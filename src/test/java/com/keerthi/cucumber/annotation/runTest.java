package com.keerthi.cucumber.annotation;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/keerthi/cucumber/annotation",
        glue= {"stepDefinitions"}
)
public class runTest {

}
