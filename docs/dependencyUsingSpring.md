



### Getting bean from application context 
```java
@SpringBootApplication
public class SpringTestRunApplication {

    
    public static void main(String[] args) {
        
        ApplicationContext ctx = SpringApplication.run(SpringTestRunApplication.class, args);
        // Ctx gets bean for this class and classes underneath of the package of SpringApplication
        
        // Getting a controller bean . 
        MyController myController = ctx.getBean(MyController.class);
        
        
    }

}


@SpringBootTest
public class SpringTestRunApplicationTests {


    @Autowired
    private ApplicationContext ctx;
    
    
    public static void main(String[] args) {

        ctx = SpringApplication.run(SpringTestRunApplication.class, args);
        // Ctx gets bean for this class and classes underneath of the package of SpringApplication

        // Getting a controller bean . 
        MyController myController = ctx.getBean(MyController.class);


    }

}





```