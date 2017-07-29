package eu.brugger.martin.acceptance.steps;

import cucumber.api.java8.En;
import eu.brugger.martin.acceptance.TestConfiguration;
import eu.brugger.martin.acceptance.world.CustomerData;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.hamcrest.core.Is.is;

@ContextConfiguration(classes = TestConfiguration.class)
public class OtherSteps implements En {

    private static final Logger LOGGER = LoggerFactory.getLogger(OtherSteps.class);

    @Autowired
    private CustomerData customerData;

    public OtherSteps() {

        When("^he does something$", () -> {
            LOGGER.info("{} does something", customerData.getCustomer());
        });

        Then("^something cool happens$", () -> {
            LOGGER.info("Something cool happens to {}", customerData.getCustomer());
        });

        Then("^nothing cool happens$", () -> {
            Assert.assertThat(customerData.getCustomer(), is("No Customer"));
            LOGGER.info("Nothing happens to {}", customerData.getCustomer());
        });


    }
}
