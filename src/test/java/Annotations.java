import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Annotations {

    WebDriver driver=null;
    @Given("^Iam on Facebook Login Page$")
    public void iamOnFacebookLoginPage() throws Throwable {
        driver = new FirefoxDriver();
        driver.navigate().to("https://www.facebook.com/");
        throw new PendingException();
    }

    @When("^I Enter Username as \"([^\"]*)\"$")
    public void iEnterUsernameAs(String arg0) throws Throwable {
        driver.findElement(By.id("email")).sendKeys(arg0);
        throw new PendingException();
    }

    @Then("^Login Should Fail$")
    public void loginShouldFail() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
