package org.Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ={"C:\\Users\\adileep\\eclipse-workspace\\IntellijProjects\\SMS\\src\\test\\java\\org\\Features\\TC1_1login.feature"
},
        glue ={"org.StepDefinitions"})
public class Test_Runner extends AbstractTestNGCucumberTests
{

}
