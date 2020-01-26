package crm.Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookLoginPage {
	
	By email = By.xpath("//*[@name='email']");
	By password = By.xpath("//*[@id='pass']");
	By loginBtn = By.xpath(".//*[@id='loginbutton']");
	
	public WebDriver driver;
	
	@Given("^I open browser$")
	public void OpenBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("driver initialized");
	}
	
	@Then("^I navigate to facebook page$")
	public void navigateToFacebookPage() throws InterruptedException {
		driver.get("https://www.facebook.com");
		System.out.println("Navigated to fb");
		Thread.sleep(5000);
		
	}
	
	@Then("^I login to fb with user \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void loginToFb(String userName, String pass) throws InterruptedException {
		driver.findElement(email).sendKeys(userName);
		driver.findElement(password).sendKeys(pass);
		
		driver.findElement(loginBtn).click();
		System.out.println("login button clicked");
		
		Thread.sleep(5000);
	}

}
