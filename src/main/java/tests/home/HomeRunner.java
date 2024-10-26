package tests.home;
import  io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/java/tests/home/home.feature",
        glue = {"tests"},
        plugin = {"html:reports/Home-Report.html"},
        monochrome = true
)

public class HomeRunner extends AbstractTestNGCucumberTests{
}
