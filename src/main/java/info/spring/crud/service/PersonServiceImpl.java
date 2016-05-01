package info.spring.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import info.spring.crud.dao.PersonDao;
import info.spring.crud.dao.PersonDaoImpl;
import info.spring.crud.model.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao persondao;
	
	@Override
	@Transactional
	public void add(Person person) {
		persondao.add(person);

	}

	@Override
	@Transactional
	public void update(Person person, int id) {
		persondao.update(person, id);

	}

	@Override
	@Transactional
	public Person findbyid(Person person, int id) {

		Person per=persondao.findbyid(person, id);
		return per;
	}

	@Override
	@Transactional
	public void remove(Person person, int id) {
		persondao.remove(person, id);

	}

	@Override
	@Transactional
	public List<Person> listPesons() {
		
		return persondao.listPersons();
	}

}
