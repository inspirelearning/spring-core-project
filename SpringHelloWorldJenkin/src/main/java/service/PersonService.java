package service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import model.Person;

@Service
public class PersonService {
   Map<String,Person> persons = new HashMap<>();
   
   public PersonService() {
	   Person p = new Person();
	   p.setId("1");
	   p.setFirstName("Deepak");
	   p.setLastName("Taylor");
	   p.setAge(28);
	   
	   persons.put("1", p);
	   
	   p = new Person();
	   p.setId("2");
	   p.setFirstName("Jeas");
	   p.setLastName("Kurien");
	   p.setAge(32);
	   
	   persons.put("2", p);
   }
   
   public Person getPerson(String id) {
	   if(persons.containsKey(id)) {
		   return persons.get(id);
	   }else {
		   return null;
	   }
   }
   
   public Map<String,Person> getAll(){
	   return persons;
   }
   
}
