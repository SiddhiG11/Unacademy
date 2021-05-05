package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AngelList_Demo {
	WebDriver driver;

@Given("user on the Angel List page")
public void user_on_the_angel_list_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver(); 
	driver.get("https://angel.co/");
	driver.manage().window().maximize();
}

@Given("user on the Login Page")
public void user_on_the_login_page() {
	driver.findElement(By.xpath("//*[@id=\"main\"]/div[5]/div/div[1]/a[2]")).click();	
	driver.get("https://angel.co/about");
	driver.manage().window().maximize();
}

@Given("user enters {string} with {string}")
public void user_enters_with(String string, String string2) {
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[1]/div[1]/div/div[2]/div[1]/a[2]")).click();
}

@Given("user click {string} button")
public void user_click_button(String string) {
    
}

@Then("user should see {string}")
public void user_should_see(String string) {
   
}

@Given("user clicks {string} button")
public void user_clicks_button(String string) {
 
}

@Then("error message displayed with wrong password")
public void error_message_displayed_with_wrong_password() {
    
}

}
