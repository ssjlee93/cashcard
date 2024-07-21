# Notes
Notes taken while following the course

## Module 1 : Creating RESTful Endpoints

### Spring and Spring Boot
**Spring**  
Spring is a comprehensive framework that provides various modules for building different types of applications.  
**Spring Boot**  
Spring Boot is a project that provides a pre-configured set of dependencies to simplify the process of building Spring applications.  
**Inversion of Control Container**  
configure how and when dependencies are provided to your application at runtime. 
This puts you in control of how your application operates in different scenarios.  
> Sometimes IoC is also called Dependency Injection (DI).
> But this is misleading since not all frameworks achieve IoC through DI.
> In Spring, this is true. Other frameworks may use different techniques.

### API Contracts and JSON
**API Contract**  
patterns for capturing agreed upon API behavior in documentation and code  
REST API and RESTful API are forms of API Contracts.  

### Testing First
Normally, tests are written after implementation to guard against regressions.  

**Test-Driven Development (TDD)**  
Write tests before implementing the code.  
Developers focus on what the code should do, not how it is done.  
Guides the developer to write minimum code to pass the test.  

### Red, Green, Refactor
**TDD Cycle**
1. Write a failing test (Red)
2. Write the minimum code to pass the test (Green)
3. Refactor the code to make it better
