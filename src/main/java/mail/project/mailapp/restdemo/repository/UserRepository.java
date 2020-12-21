package mail.project.mailapp.restdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mail.project.mailapp.restdemo.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	

}
