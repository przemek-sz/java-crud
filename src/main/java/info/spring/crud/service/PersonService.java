package info.spring.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import info.spring.crud.model.Person;

public interface PersonService {
        
	public void add(Person person);
	public void update(Person person,int id);
	public Person findbyid(Person person,int id);
	public List<Person> listPesons();
	public void remove(Person person,int id);
}
