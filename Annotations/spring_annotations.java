Spring Annotations Explanation 
1. @Configuration- Marks a class as a source of bean definitions for the Spring IoC container.- Similar to 
`applicationContext.xml` in XML-based configuration. 
2. @Required- Applied on setter methods to indicate that the property must be populated at configuration 
time.- Deprecated since Spring 5 due to constructor injection preference. 
3. @Repository- Specialization of `@Component`, used to indicate that the class provides the mechanism 
for storage, retrieval, search, update, and delete operations on objects.- Converts JPA/Hibernate exceptions 
into Spring's DataAccessException. 
4. @Order- Specifies the order of execution for components or aspects.- Lower values have higher priority. 
5. @Autowired- Automatically injects dependencies by type.- Can be used on constructors, fields, or setter 
methods. 
6. @Qualifier- Used along with `@Autowired` to resolve ambiguity when multiple beans of the same type 
exist.- Specifies the name of the bean to inject. 
7. @Scope- Defines the scope of a Spring bean (e.g., singleton, prototype, request, session). 
8. @Component- Indicates that the class is a Spring-managed component.- Generic stereotype for any 
Spring-managed component. 
9. @Service- Specialization of `@Component`, indicates a service class in the business layer. 
10. @Controller- Specialization of `@Component`, indicates a web controller.- Used in Spring MVC to 
handle web reque 
11. @Bean- Indicates that a method produces a bean to be managed by the Spring container.- Used inside a 
`@Configuration` class. 
12. @DependsOn- Specifies the names of the beans that should be initialized before the current bean. 
13. @Lazy- Indicates that a bean should not be initialized until it is requested.- Can be used at the class or 
bean definition level. 
14. @Value- Injects values into fields from property files or system properties. 
15. @Import- Allows importing additional `@Configuration` classes.- Useful to modularize configuration. 
16. @ImportResource- Imports XML-based configuration into a Java-based configuration class. 
17. @ComponentScan- Tells Spring where to search for annotated components (`@Component`, 
`@Service`, `@Repository`, `@Controller`). 
18. @PropertySource- Declares a `.properties` file to be loaded by the application context.- Used with 
`@Value`. 
19. @Primary- Marks a bean as the primary candidate for autowiring when multiple beans of the same 
type are present. 
20. @Lookup- Used to inject prototype-scoped beans into singleton beans.- Tells Spring to override the 
method to return a new instance each time. 
21. @PostConstruct- Method annotated with this will be executed after dependency injection is done.- 
Comes from `javax.annotation` package. 
22. @PreDestroy- Method annotated with this will be executed before the bean is removed from the 
context.- Also comes from `javax.annotation` package
