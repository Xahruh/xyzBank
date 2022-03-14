package com.xyzbank;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com/xyzbank"},
        tags = "@testing",
        dryRun = false
)


public class TestRunner extends AbstractTestNGCucumberTests {

}


