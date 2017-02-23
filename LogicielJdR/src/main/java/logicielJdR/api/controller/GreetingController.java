package logicielJdR.api.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonValue;

import logicielJdR.api.model.Greeting;
import logicielJdR.api.service.IGreetingService;

/**
 * 
 * RestController permettant les actions de CRUD pour l'entity {@link Greeting}
 * @author Vincent
 *
 */
@RestController
public class GreetingController {
	
	@Autowired
	private IGreetingService greetingService;
	
	/**
	 * Méthode permettant de récupérer depuis la base de données tous les éléments présents dans la table Greetings
	 * @return toutes les table au format {@link JsonValue}
	 */
	@RequestMapping(
			value = "/api/greetings", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Collection<Greeting>> getGreetings() {
		
		Collection<Greeting> greetings = greetingService.findAll();
		
		return new ResponseEntity<Collection<Greeting>>(
				greetings, 
				HttpStatus.OK);
		
	}
	
	/**
	 * Méthode permettant de récupérer un élément de la table Greetings à partir de son identifiant
	 * @param id l'identifiant de l'entité souhaitée
	 * @return l'entité souhaitée au format {@link JsonValue}
	 */
	@RequestMapping(
			value = "/api/greetings/{id}", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Greeting> getGreeting(@PathVariable("id") Long id ) {
		
		Greeting greeting = greetingService.findOne(id);
		if (greeting == null) {
			return new ResponseEntity<Greeting>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Greeting>(greeting, HttpStatus.OK);
		
	}
	
	@RequestMapping(
			value = "/api/greetings", 
			method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Greeting> createGreeting(@RequestBody Greeting greeting) {
		
		Greeting savedGreeting = greetingService.create(greeting);
		return new ResponseEntity<Greeting>(savedGreeting, HttpStatus.CREATED);
	}
	
	@RequestMapping(
			value = "/api/greetings/{id}", 
			method = RequestMethod.PUT, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Greeting> updateGreeting(@RequestBody Greeting greeting) {
		Greeting updateGreeting = greetingService.update(greeting);
		if (updateGreeting == null) {
			return new ResponseEntity<Greeting>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Greeting>(updateGreeting, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/api/greetings/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Greeting> deleteGreeting(@PathVariable("id") Long id, @RequestBody Greeting greeting) {
		
		greetingService.delete(id);
		
		return new ResponseEntity<Greeting>(HttpStatus.NO_CONTENT);
	}
}
