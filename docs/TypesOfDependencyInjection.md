## Dependency Injection

- Dependency injection is where a needed dependency is injected by another object.
- By class Properties -
    - private property through reflection
- By Constructor
- By Setter method.

## Concete classes or Interfaces.

- Generally prefered way is interface.
    - Allows runtime to decide implementation to inject.
    - Follow interface Segregation principle of SOLID
    - Makes your code more testable.

- Inversion of Control
- Injected at runtime.
- Dependencies are not predetermined.
- Dependency Injection is much about how to compose your classes.
- IoC is the runtime environment of your code.

### Best practices for dependency Injection.

- Favor constructor injection over setter injection. 
- Use final properties for injected components. 
- Declare properties private final and initialize in the constructor. 
- Whenever practical don't use injection.

### How spring needs to wire  up. 

- The primary bean @Primary
```java

@Service
@Primary
public class SetterInjectedMyService implements MyService{


    @Override
    public void serve() {
        System.out.println("SetterInjectedMyService");
    }
}

```
- Qualifier

```java

@Service("setterInjectedService")
public class SetterInjectedMyService implements MyService{


    @Override
    public void serve() {
        System.out.println("SetterInjectedMyService");
    }
}

@Controller
class MyController {
    
    
    MyService service;
    
    
    public void setService(@Qualifier("setterInjectedService") MyService service){
        this.service = service;
    }
    
    
    
}

```
- Active Profile

```java











```
