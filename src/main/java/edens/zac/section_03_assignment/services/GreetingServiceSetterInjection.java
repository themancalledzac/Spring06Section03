package edens.zac.section_03_assignment.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hey I'm setting a greeting in 'GreetingServiceSetterInjection'.";
    }
}
