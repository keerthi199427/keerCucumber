package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Annotations {

    WebDriver driver=null;

    @Given("^Iam on Facebook Login Page$")
    public void iamOnFacebookLoginPage() {
        System.setProperty("webdriver.gecko.driver","E:\\softwares\\geckodriver-v0.23.0-win64\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.navigate().to("https://www.facebook.com/");

    }

    @When("^I Enter Username as \"([^\"]*)\"$")
    public void iEnterUsernameAs(String arg0) {
        driver.findElement(By.id("email")).sendKeys(arg0);
    }

    @When("^I Enter Password as \"(.*?)\"$")
    public void i_Enter_Password_as(String arg1)  {
        driver.findElement(By.id("pass")).sendKeys(arg1);
        driver.findElement(By.id("loginbutton")).click();
    }


    @Then("^Login Should Pass$")
    public void loginShouldPass()  {
        driver.findElement(By.id("userNavigationLabel")).isDisplayed();
    }
}
