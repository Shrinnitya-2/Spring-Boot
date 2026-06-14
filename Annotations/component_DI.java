Component Scanning & Dependency  Injection : 
 
• @Component : Marks a class as a Spring-managed  component. Used for generic components that don't fit into @Service, 
               @Repository, or @Controller categories.   
• @Controller : Specialized @Component, used in Spring MVC to define a web controller.   
• @RestController : Combines @Controller and  
• @ResponseBody to simplify RESTful API development.  
• @Service : Specialized @Component, used for business logic and service layer components.   
• @Repository : Specialized @Component, used for data access objects (DAO) to indicate storage operations.   
• @Autowired : Automatically injects dependencies into Spring beans, reducing manual configuration.  
•  @Qualifier("beanName") : Specifies which bean to inject when multiple candidates exist.   
•  @Primary : Marks a bean as the default choice when multiple candidates exist.   
• @Value("${property.key}") : Injects values from properties files into Spring beans. 
