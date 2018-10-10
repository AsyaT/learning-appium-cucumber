package com.core.setup;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/LoginPage.feature"
        , glue = {"src/main/java/business/"}
        ,tags = {"@LoginSuccess"}

)

public class TestRunner {

}