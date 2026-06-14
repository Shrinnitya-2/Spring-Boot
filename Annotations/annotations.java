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
