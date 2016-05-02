package info.spring.crud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import info.spring.crud.model.Person;

public interface PersonDao {
	
	public void add(Person person);
	public void update(Person person);
	public Person findbyid(Person person,int id);
	public List<Person> listPersons();  
	public void remove(Person person,int id);
	
    
}
