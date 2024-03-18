## SOLID

### Single Responsibility principle . 
    - Every calss should have single responsibility. 
    - Don't have a class more code than a single screen. 
### Open close Principle 
    - Your class should be open for extension. 
    - Closed for modification. 
    - You should be able to extend a class behavior. 
    - Use private variables only when you need them
    - Abstract base classes. 
### Liskorv substitution Principles. 
    - If it looks and quakes likes a duck , but requires battery . Then it's not a duck.
### Interface segregation Principle. 
    - You want your components plug and play . Don't have God interface. 
### Dependency Inversion Principle
    - Your Absraction shouldn't depend on the details and not vise versa. 
    - Avoid Tight coupling. 
    - Be pragmatic when Using SOLID . Too much and too little may be bad. 

## Spring Context 

```java
@Controller
public class MyController {
    
    public String sayHello(){
        return "hello";
    }
    
}

@SpringBootApplication
public class Spring6DiApplication{
    public static void main(String[] args) {
        ApplicationContext ctx = Spring6DiApplication.run(Spring6DiApplication.class , args);
        MyController myController = ctx.getBean(MyController.class);
        System.out.println("In main method");
        System.out.println(myController.sayHello());
    }
}
// Spring boot scans packages that are below the SpringBootApplication. 


```
## Spring test Context

```java
@SpringBootTest
class SpringBootApplicationtests{
    
    @Autowired
    SpringApplicationContext context;
    
    @Autowired
    MyController controller;
    
    @Test
    void testAutowiredController(){
        System.out.println(controller.sayHello());
    }
    
    
    @Test
    void testApplicationContext(){

        ApplicationContext ctx = Spring6DiApplication.run(Spring6DiApplication.class , args);
        MyController myController = ctx.getBean(MyController.class);
        System.out.println("In main method");
        System.out.println(myController.sayHello());
        
    }
    
}




```