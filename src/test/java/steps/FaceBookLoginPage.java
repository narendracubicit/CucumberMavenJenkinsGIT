package steps;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Map;
import java.util.HashMap;

public class FaceBookLoginPage {
	
	By email = By.xpath("//*[@name='email']");
	By password = By.xpath("//*[@id='pass']");
	By loginBtn = By.xpath(".//*[@id='loginbutton']");
	
	public WebDriver driver;
	
	@Given("^I open browser$")
	public void OpenBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
				Map<String, Object> prefs = new HashMap<String, Object>();
				prefs.put("profile.default_content_settings.popups", 0);
				prefs.put("safebrowsing.enabled", "false");
				prefs.put("download.prompt_for_download", "false");
				prefs.put("profile.default_content_setting_values.notifications", 1);
				prefs.put("profile.default_content_setting_values.automatic_downloads", 1);
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--no-sandbox", "--start-maximized", "--headless", "--disable-gpu", "window-size=1920,1080", "--disable-dev-shm-usage", "--disable-extensions", "disable-infobars", "--use-fake-ui-for-media-stream");
// 		driver.manage().window().maximize();
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
