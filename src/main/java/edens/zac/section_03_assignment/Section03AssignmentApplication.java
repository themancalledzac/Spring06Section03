package edens.zac.section_03_assignment;

import edens.zac.section_03_assignment.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Section03AssignmentApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Section03AssignmentApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println("In Main Method");

		System.out.println(controller.sayHello());
	}

}