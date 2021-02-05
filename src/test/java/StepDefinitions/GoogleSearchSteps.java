package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import java.util.List;

public class GoogleSearchSteps {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.out.println("Before");
    }

    @After()
    public void tearDown(Scenario scenario) {
        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
    }

    @Given("I navigate to Google")
    public void iNavigateToGoogle() {
        System.out.println("I am navigating to google website");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    @When("I enter {string} in search box")
    public void iEnterInSearchBox(String searchText) {
        System.out.println("Entering " + searchText + " in search box");
        driver.findElement(By.cssSelector("input[name=\"q\"]")).sendKeys(searchText);
    }

    @Then("I see {string} results")
    public void iSeeResults(String resultText) {
        System.out.println("I must see results containing " + resultText);
        List<WebElement> elements = driver.findElements(By.cssSelector("form ul > li"));
        for (WebElement result : elements) {
            String actualText = result.getText();
            boolean contains = actualText.contains(resultText);
            Assert.assertTrue(contains);
        }
        Assert.fail();
    }

    @Given("I launch web browser,")
    public void iLaunchWebBrowser() {
        System.out.println("open web browser");
    }
}
