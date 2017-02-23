package logicielJdR.api.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import logicielJdR.api.model.Greeting;
import logicielJdR.api.repository.IGreetingRepository;
import logicielJdR.api.service.IGreetingService;

@Service
public class GreetingImpl implements IGreetingService {

	@Autowired(required=true)
	private IGreetingRepository greetingRepository;
	
	
	@Override
	public Collection<Greeting> findAll() {
		Collection<Greeting> greetings = greetingRepository.findAll();
		return greetings;
	}

	@Override
	public Greeting findOne(Long id) {
		Greeting greeting = greetingRepository.findOne(id);
		return greeting;
	}

	@Override
	public Greeting create(Greeting greeting) {
		if (greeting.getId() != null) {
			return null;
		}
		Greeting savedGreeting = greetingRepository.save(greeting);
		return savedGreeting;
	}

	@Override
	public Greeting update(Greeting greeting) {
		Greeting greetingPersisted = findOne(greeting.getId());
		if (greetingPersisted == null) {
			return null;
		}
		
		Greeting updateGreeting = greetingRepository.save(greeting);
		return updateGreeting;
	}

	@Override
	public void delete(Long id) {
		greetingRepository.delete(id);
		
	}

}
