package edens.zac.section_03_assignment.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    @Test
    void sayHello() {

        MyController myController = new MyController();

        System.out.println("test says: " + myController.sayHello());
    }
}