## Solid Principles

#### Single Responsibility Principle :

- Just because you can not that you should. 
- Every Class Should have a single Responsibility
- There should never be more than once reason for a class to change. 
- Your class should small. No more than once screen full of code. 
- Split big classes into small classes. 
- Never say your 2000 line method tested fine. :D 

#### Open close principle

- Class should be open for extension 
- Shouldn't be open for modification
- You can change a class behavior without modifying it. 
- Use abstract base classes. 

#### Liskov Substitution Principle

- By barbara liskov in 1998. 
- Objects in a program should be replacable with their instance of subtype without altering the correctness of the program
- Violation often fails is-a test. 
- A square is a rectangle. However a rectangle is not a square. 

#### Interface segregation principle

- You fine grain interface. 
- Make interfaces which are client specific. 
- Keep your components focused and minimize dependencies between them.
- Notice relationship to SingleResponsibilityPrinciple?
- ie avoid `god` interface

#### Dependency Inversion Principle

- Abstraction shouldn't depend on the details. 
- Details shouldn't depend on the abstraction 
- Higher level and lower level objects depends on same abstraction Interation. 

Write better Quality code and avoid tight coupling. But be pragmatic. Every request Path shouldn't have it's own contoller 
