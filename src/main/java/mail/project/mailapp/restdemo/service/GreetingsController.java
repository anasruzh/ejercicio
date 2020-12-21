package mail.project.mailapp.restdemo.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
public class GreetingsController {
    /**
     *
     * @param name the name to greet
     * @return greeting text
    
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingText(@PathVariable String name) {
        return "Hello " + name + "!";
    }
    */
    
    @GetMapping("/login")
    public String showForm() { //ventana html log in
        return "login";
    }
    
    @GetMapping("/user")
    public String showFormUser() { //ventana html datos usuario
        return "user";
       
    }
    
    @PostMapping("/new_login")
    public String showFormRegister() { //ventana registro usuario
        return "user";
    }
    
    @PostMapping("/new_mensaje")
    public String showFormSendMessage() { //enviar nuevo mensaje
        return "login";
    }
}
