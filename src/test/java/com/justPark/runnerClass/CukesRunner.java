package com.justPark.runnerClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"json:target/cucumber.json",
                    "html:target/cucumber-report.html",
                    "html:target/default-html-reports",
                    "rerun:target/rerun.txt"
            },
            features = "src/test/resources/features",
            glue = "com/justPark/step_definitions",
            dryRun=false,
            tags ="@smoke1"

    )
    public class CukesRunner {

    }


