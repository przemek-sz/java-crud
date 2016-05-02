package info.spring.crud.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		list=personservice.listPesons();
		
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
	
	@RequestMapping(value="/save")//,method=RequestMethod.POST
	public String save(Person person) {
		personservice.add(person);

		return "redirect:/home";

	}

	@RequestMapping(value="/editPerson/{id}")
	public ModelAndView edit(@PathVariable("id") int id) {
		ModelAndView model = new ModelAndView("editPerson");
		Person person = new Person();
		person=personservice.findbyid(null,id);
		model.addObject(person);
		
		return model;

	}

	@RequestMapping(value="/update/{id}",method=RequestMethod.GET)
	public String update(@PathVariable("id") int id,Person person) {
		 
		person.setID(id);
		personservice.update(person);
		

		return "redirect:/home";

	}

	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
	
		
		
		personservice.remove(null,id);
		

		return "redirect:/home";

	}
	

}
