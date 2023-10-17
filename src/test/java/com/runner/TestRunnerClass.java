package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\ADMIN\\eclipse-workspace\\ProjectMaven\\src\\test\\resources\\Datatable.feature"}, glue= {"stepDefinition"})//packageName
public class TestRunnerClass {

}
