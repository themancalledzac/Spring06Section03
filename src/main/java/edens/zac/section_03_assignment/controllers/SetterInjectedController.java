package edens.zac.section_03_assignment.controllers;

import edens.zac.section_03_assignment.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 'most least preferred' (not as bad as propertyInjectedController)
 */
@Controller
public class SetterInjectedController {

    @Autowired
    private GreetingService greetingService;

    // if we want the setter to be utilized here we need to put the @Autowired on it instead
//    public void setGreetingService(GreetingService greetingService) {
//        System.out.println("setteryo");
//        this.greetingService = greetingService;
//    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
