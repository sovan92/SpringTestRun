## Dependency Injection 
### Types of dependency injection
 - By Private properties - EVIL 
   - Works but makes testing difficult .
   - It is also slow. 
 - By Setter . The old method of doing injection . 
 - By Constructor - Most preferred.
### Concrete Classes/Interfaces
 - Avoid dependency Injection through concrete classes. 
 - Should do with Interfaces
 - Promotes SOLID principle.

### Inversion of Control. 
 - Control of the which concrete class to use is provided to framework . 
 - The framework in the Runtime uses the decision to decide which implementation to use.

### IoC vs Dependency Injection
 - DI is refering to the way in which we compose classes. 
 - IoC is the idea of in the runtime env, which dependency the spring should use. 
 - DI is the tool in which Spring does the IoC. 