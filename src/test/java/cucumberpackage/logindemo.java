
package cucumberpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class logindemo {

	WebDriver driver;
	@Given("browser is open")
	public void browser_is_open() 
	{
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Cucumberproject\\src\\test\\resources\\Chromepath\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get("https://www.saucedemo.com/");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	
	   driver.findElement(By.id("user-name")).sendKeys("standard_user");
	   driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@And("press login button")
	public void press_login_button() {
	    driver.findElement(By.id("login-button")).click();
	}

	@Then("user nevigated to the home screen")
	public void user_nevigated_to_the_home_screen() {
	    System.out.println("user nevigated to the home screen");
	}
}
