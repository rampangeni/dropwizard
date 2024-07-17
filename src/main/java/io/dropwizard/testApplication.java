package io.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class testApplication extends Application<testConfiguration> {

    public static void main(final String[] args) throws Exception {
        new testApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(final Bootstrap<testConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final testConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
