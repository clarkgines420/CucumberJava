package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeaturesWithTags",
glue = { "StepDefinitions" },
tags = "@smoke and @regression")
public class TestRunner_Tags {

}
