package logicielJdR.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import logicielJdR.api.model.Greeting;

@Repository
public interface IGreetingRepository extends JpaRepository<Greeting, Long> {

}
