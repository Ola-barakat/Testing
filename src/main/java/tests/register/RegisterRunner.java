package tests.register;
import  io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/java/tests/register/register.feature",
        glue = {"tests"},
        plugin = {"html:reports/register-Report.html"},
        monochrome = true
)

public class RegisterRunner extends AbstractTestNGCucumberTests  {
}


