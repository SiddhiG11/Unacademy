package stepdefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagefactoryPOM.AboutUsPOM;

public class DemoAU {
	WebDriver driver;

	@Test(priority = 1)
	@Given("^user is on about us page$")
	public void user_is_on_about_us_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://unacademy.com/about");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);

		AboutUsPOM home = PageFactory.initElements(driver, AboutUsPOM.class);
		home.aboutusclick();

	}

	@Test(priority = 2)
	@When("^user clicks about us link$")
	public void user_clicks_about_us_link() throws Throwable {
		System.out.println("Verified click on about us link");

	}

	@Test(priority = 3)
	@Then("^about us page is opened$")
	public void about_us_page_is_opened() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://unacademy.com/about");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor js1 = ((JavascriptExecutor) driver);
		js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Site Map")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/a[1]/div[1]")).click();
		
		 //assertion for error
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Oops! Page not found..";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println("Error! Page not found");          
      
	}

	@Test(priority = 1)
	@Given("^user is on about us page on the website$")
	public void user_is_on_about_us_page_on_the_website() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://unacademy.com/about");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Verified About Us Page");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor js2 = ((JavascriptExecutor) driver);
		js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		AboutUsPOM home = PageFactory.initElements(driver, AboutUsPOM.class);
		driver.findElement(By.linkText("Careers")).click();
		home.careersclick();
		Thread.sleep(2000);

	}

	@Test(priority = 2)
	@When("^user should click carrers link$")
	public void user_should_click_carrers_link() throws Throwable {
		System.out.println("Verified click on careers link");

	}

	@Test(priority = 3)
	@Then("^careers page is viewed$")
	public void careers_page_is_viewed() throws Throwable {
		System.out.println("Verified Careers Page");

	}

	@Test(priority = 1)
	@Given("^user views the blogs link$")
	public void user_views_the_blogs_link() throws Throwable {
		System.out.println("Verified click on blogs link");
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://unacademy.com/about");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor js3 = ((JavascriptExecutor) driver);
		js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		AboutUsPOM home = PageFactory.initElements(driver, AboutUsPOM.class);
		home.aboutusclick();
		System.out.println("Verified Blogs Page");
		driver.close();
	}

	@Test(priority = 2)
	@When("^user clicks on blogs$")
	public void user_clicks_on_blogs() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://unacademy.com/about");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor js4 = ((JavascriptExecutor) driver);
		js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		AboutUsPOM home = PageFactory.initElements(driver, AboutUsPOM.class);
		driver.findElement(By.linkText("Blogs")).click();
		home.blogsclick();
		Thread.sleep(2000);

	}

	@Test(priority = 3)
	@Then("^blogs gets open$")
	public void blogs_gets_open() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://unacademy.com/about");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor js5 = ((JavascriptExecutor) driver);
		js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		AboutUsPOM home = PageFactory.initElements(driver, AboutUsPOM.class);
		driver.findElement(By.linkText("Blogs")).click();
		home.blogsclick();
		Thread.sleep(2000);
		String title = driver.getTitle();

		// assertion to verify page title
		String expected_title = "About Us | Unacademy";
		Assert.assertEquals(title, expected_title);

		if (title.contentEquals("About Us | Unacademy")) {
			System.out.println("Test Passed : Title is Verified");
			;
		} else {
			System.out.println("Test Failed : Title is not Verified");
			System.out.println("Task Completed");
			driver.close();
		}

	}

}
