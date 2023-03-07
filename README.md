- What is the difference between Creating a new
  Object ( `ApplicationContext applicationContext = new ApplicationContext();`) Well, creating a new object is as
  explicit as it can get - you create a new instance of the desired class.

Dependency injections is a mechanism that provides you with references where you need them. Imagine a class that
represents a connection pool to your database - you usually only have one instance of that class. Now you need to
distribute that reference to all the classes that use it. Here is where Dependency Injection comes in handy - by using a
DI framework such as Spring you can define that the one instance of your pool will be injected into the classes that
need it.

Types of Dependency Injection

- By class properties - Least Preffered
    - can be public or private properties
    - using private properties is EVIL
        - spring can use reflection to set private properties
        - "Works" but is slow and makes testing difficult
- By Setters - Area of much debate
- By Constructor - Most Preferred
    - Because: When you are instantiating the object to Create the object, you need to pass in that dependency via
      constructor, So the object cannot exist without that dependency being injected into it.

Concrete Classes Vs Interfaces

- DI can be done with Concreate Classes OR with Interfaces
- Generally, DI with Concreate Classes should be avoided
- DI via Interfaces is highly preferred
    - Allows runtime to decide implementation to inject
    - Follows Interface Segregation Principle of SOLID
    - Also, makes your code more testable - mocking becomes trivial

Inversion of Control

- Inversion of Control - aka IoC
- is a technique to allow dependencies to be injected at runtime
- Dependencies are not predetermined
- Allows the framework to compose the application by controlling which implementation is injected.
    - Example - H2 in memory data source or MySQL data source
- The CONTROL of the dependency is being Inverted Over to the managing framework ( here that is Spring Framework )

IoC vs Dependency Injection

- IoC and DI are easily confused
- DI refers much to the composition of your classes
    - i.e - you compose your class with DI in mind
    - You might even write code to 'inject' a dependency
- IoC is the runtime environment of your coce
    - Control of Dependency Injection is inverted to the framework
    - Spring is in control of the injection of dependencies

Best Practices with DI

- Favor using Constructor Injection vs Setter Injection
- User FINAL properties for injected components
    - Declare property `private final` and initialize in the constructor
- Whenever practical, code to an interface.
- Small things, like say 'waht day is it?' that aren't going to be used throughout the application really don't need DI,
  if it's only used in one place. be pragmatic. I am thinking this is sort of like Redux State in React, where if you
  aren't using that data elsewhere, why do it in a more complicated way.