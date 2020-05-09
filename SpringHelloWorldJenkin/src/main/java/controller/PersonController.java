package controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Person;
import service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	PersonService ps;
	
	@RequestMapping("/all")
	public Map<String, Person> getAll(){
		return ps.getAll();
	}
	
	@RequestMapping("{id}")
	public Person getPerson(@PathVariable String id) {
		return ps.getPerson(id);
	}
}

   