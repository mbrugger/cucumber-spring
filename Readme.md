# cucumber-spring

A dummy project setting up cucumber and spring with proper reset of injected data objects to share data between step definitions across multiple classes

`@Autowire` the CustomerData in all step definition files

The scope "customer-glue" will take care of properly resetting the CustomerData

```java
@Component
@Scope("cucumber-glue")
public class CustomerData {

}
```

[main] INFO  e.b.m.acceptance.world.CustomerData - Creating new customer data
