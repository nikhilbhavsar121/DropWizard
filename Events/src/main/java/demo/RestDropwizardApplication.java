package demo;

import demo.resources.EventResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class RestDropwizardApplication extends Application<RestDropwizardConfiguration> {

    public static void main(final String[] args) throws Exception {
        new RestDropwizardApplication().run(args);
    }

    @Override
    public String getName() {
        return "RestDropwizard";
    }

    @Override
    public void initialize(final Bootstrap<RestDropwizardConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final RestDropwizardConfiguration configuration,
                    final Environment environment) {

        EventResource eventResource = new EventResource();
        environment.jersey().register(eventResource);

    }

}
