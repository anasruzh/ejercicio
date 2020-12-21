package mail.project.mailapp.restdemo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import mail.project.mailapp.restdemo.model.User;
import mail.project.mailapp.restdemo.properties.RestProperties;


/**
 *
 * Spring Boot application starter class
 */
@SpringBootApplication
@EnableConfigurationProperties({RestProperties.class})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    
    

@Autowired
UserRepository userRepository;


    @PostConstruct
    public void init() {

        User activado = User.builder().username("test").hashedPassword("$2a$10$J.EQEoXXCmUbl1QKbPCxwu5Q4uBlTExA9asr5xh/LfayOxXkBjnMm").build();
        userRepository.save(activado);

        User desactivado = User.builder().username("test2").hashedPassword("$2a$10$J.EQEoXXCmUbl1QKbPCxwu5Q4uBlTExA9asr5xh/LfayOxXkBjnMm").enabled(false).build();
        userRepository.save(desactivado);

    }

}
