package edens.zac.section_03_assignment.controllers;

import edens.zac.section_03_assignment.services.GreetingService;
import edens.zac.section_03_assignment.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {

        System.out.println("I'm in the controller");

        return greetingService.sayGreeting();
    }
}
