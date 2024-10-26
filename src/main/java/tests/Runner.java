package tests;
import  io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/java/tests"},
        glue = {"tests"},
        plugin = {"html:reports/Report.html"},
        monochrome = true
)

public class Runner extends AbstractTestNGCucumberTests {
}
