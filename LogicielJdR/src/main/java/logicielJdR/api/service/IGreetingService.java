package logicielJdR.api.service;

import java.util.Collection;

import logicielJdR.api.model.Greeting;

public interface IGreetingService {

	Collection<Greeting> findAll();
	
	Greeting findOne(Long id);
	
	Greeting create(Greeting greeting);
	
	Greeting update(Greeting greeting);
	
	void delete(Long id);
}
