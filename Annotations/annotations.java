@Autowired 
  Definition: Marks a constructor, field, or setter method to be autowired by Spring's dependency injection facilities. 
  Why it is used: To inject dependencies automatically. 
  Example: 
    @Autowired 
    private DataSource dataSource; 
 
@Value 
  Definition: Injects values into fields from properties files or simple expressions. 
  Why it is used: To externalize configuration or use SpEL. 
  Example: 
    @Value("${items.info.idlyPrice}") // Property injection 
    public float idlyPrice; 
 
    @Value("#{item.idlyPrice+item.dosaPrice}") // SpEL 
    private Float billAmount; 
 
@Configuration 
  Definition: Indicates that a class declares one or more @Bean methods and may be processed by the Spring 
container to generate bean definitions. 
  Why it is used: For Java-based configuration of beans. 
  Example: 
    @Configuration 
    public class PersistConfig { ... } 
 
@Bean 
  Definition: Indicates that a method produces a bean to be managed by the Spring container. 
  Why it is used: To manually create and configure items, especially from third-party libraries (like DataSources). 
  Example: 
    @Bean 
    public ComboPooledDataSource createDS() { ... } 
 
@ImportResource 
  Definition: Indicates that an XML configuration file should be imported. 
  Why it is used: To load legacy XML configuration in a Spring Boot application. 
  Example: 
    @ImportResource(locations = "in/ineuron/cfg/applicationContext.xml")

@Named 
  Definition: Standard equivalent to @Component (and @Qualifier). 
  Why it is used: To define a named bean in a portable, non-framework-specific way. 
  Example: 
    @Named("std") 
    public class Student { ... } 
 
@Inject 
  Definition: Standard equivalent to @Autowired. 
  Why it is used: To perform dependency injection in a portable way. 
  Example: 
    @Inject 
    @Named(value="courseId") 
    private ICourseMaterial material;


 
@PostConstruct 
  Definition: Marks a method to be executed after the bean has been instantiated and all dependency 
injection has been completed. 
  Why it is used: To perform initialization logic that depends on injected dependencies (e.g., 
verifying DB connection, loading cache data) which cannot be done in the constructor. 
  Example: 
    @PostConstruct 
    public void init() { 
        // This runs after 'dataSource' is injected 
        System.out.println("Bean initialized, connection valid: " + (dataSource != null)); 
    } 
 
@PreDestroy 
  Definition: Marks a method to be executed just before the bean is removed from the Spring 
container. 
  Why it is used: To perform cleanup operations (e.g., closing open files, releasing network 
connections, stopping background threads). 
  Example: 
    @PreDestroy 
    public void cleanup() { 
        System.out.println("Closing resources..."); 
    } 

