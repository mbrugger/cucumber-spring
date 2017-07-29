package eu.brugger.martin.acceptance.steps;

import cucumber.api.java8.En;
import eu.brugger.martin.acceptance.TestConfiguration;
import eu.brugger.martin.acceptance.world.CustomerData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = TestConfiguration.class)
public class CustomerSteps implements En {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerSteps.class);

    @Autowired
    CustomerData customerData;

    public CustomerSteps() {
        Given("^a different customer$", () -> {
            LOGGER.info("Creating a different customer");
            customerData.setCustomer("I am a different customer");
        });

        Given("^a customer$", () -> {
            LOGGER.info("Creating a customer");
            customerData.setCustomer("I am customer");
        });

        Given("^no customer$", () -> {
            LOGGER.info("No customer created");
        });
    }


}
