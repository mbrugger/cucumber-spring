package eu.brugger.martin.acceptance;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "eu.brugger.martin.acceptance.world" })
public class TestConfiguration {
}
