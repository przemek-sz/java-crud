package info.spring.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import info.spring.crud.model.Person;
import info.spring.crud.service.PersonService;
import info.spring.crud.service.PersonServiceImpl;

@Controller
public class HomeContoller {

	@Autowired
	PersonService personservice;
	

	@RequestMapping(value="/home")
	public ModelAndView home() {
		ModelAndView model = new ModelAndView("home");
	    List<Person> list = new ArrayList<Person>();
		//Iterable<Person> list = personservice.listPesons();
		list=personservice.listPesons();
		//List<Person> list = personservice.listPesons();
		
		model.addObject("lista", list);

		return model;
	}
	
	@RequestMapping("/addPerson")
	public ModelAndView add() {

		ModelAndView model = new ModelAndView("addPerson");
		Person person = new Person();
		model.addObject(person);
		
		return model;

	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView save(Person person) {
		personservice.add(person);
		
		ModelAndView model = new ModelAndView("home");

		return model;

	}

	@RequestMapping("/update")
	public ModelAndView update() {
		ModelAndView model = new ModelAndView("home");

		return model;

	}

	@RequestMapping("/find")
	public ModelAndView find() {
		ModelAndView model = new ModelAndView("home");

		return model;

	}

	@RequestMapping("/remove")
	public ModelAndView remove() {
		ModelAndView model = new ModelAndView("home");
		

		return model;

	}
	

}
