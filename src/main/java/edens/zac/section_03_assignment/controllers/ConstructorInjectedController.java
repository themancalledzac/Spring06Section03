package edens.zac.section_03_assignment.controllers;

import edens.zac.section_03_assignment.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Correct way of doing Dependency Injection
 */
@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
