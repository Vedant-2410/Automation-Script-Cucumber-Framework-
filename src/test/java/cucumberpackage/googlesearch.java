package cucumberpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googlesearch {
 WebDriver driver;
	 
	  
@Given("given browser is open")
public void given_browser_is_open() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Cucumberproject\\src\\test\\resources\\Chromepath\\chromedriver.exe ");
 driver= new ChromeDriver();
 System.out.println("Successfully browser is opened");
		
}
@When("user enters keyword")
public void user_enters_keyword() {
	driver.get("https://www.google.co.in/");
	driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Youtube");
	System.out.println("Entered url successfully");
}

@And("click search button")
public void click_search_button() {
   driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
System.out.println("Clicked successfully");
}

@Then("user navigate to search result")
public void user_navigate_to_search_result() {
  System.out.println("Successfuly navigated");
}

}
