package eu.brugger.martin.acceptance.world;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class CustomerData {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerData.class);

    private String customer = "No Customer";

    public CustomerData() {
        LOGGER.info("Creating new customer data");
    }

    public String getCustomer() {
        return this.customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
