package info.spring.crud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import info.spring.crud.model.Person;

@Repository
public class PersonDaoImpl implements PersonDao {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void add(Person person) {
		
		em.persist(person);

	}

	@Override
	public void update(Person person,int id) {
		
		
		em.merge(findbyid(person, id));

	}

	@Override
	public Person findbyid(Person person, int id) {
		person=em.find(Person.class, id);
		
		return person;
	}

	@Override
	public void remove(Person person, int id) {
		
		em.remove(em.merge(findbyid(person, id)));
		

	}

	@Override
	public List<Person> listPersons() {
		
		
		
		return (List<Person>)em.createQuery("SELECT e FROM Person e").getResultList();
	}

}
