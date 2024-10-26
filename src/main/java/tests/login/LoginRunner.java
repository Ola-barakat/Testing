package tests.login;

import  io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/java/tests/login/login.feature",
        glue = {"tests"},
        plugin = {"html:reports/login-Report.html"},
        monochrome = true
)

public class LoginRunner extends AbstractTestNGCucumberTests {
}

