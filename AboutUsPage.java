package stepdefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagefactoryPOM.AboutUsPage_POM;

public class AboutUsPage {

	@Test
	public void testcheck() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://unacademy.com/about");
		driver.manage().window().maximize();
		//scroll down for about us
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);

		AboutUsPage_POM home = PageFactory.initElements(driver, AboutUsPage_POM.class);
		
		home.aboutusclick();
		driver.navigate().to("https://unacademy.com/about"); 
		//scroll down 
		JavascriptExecutor js1 = ((JavascriptExecutor) driver);
		js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		home.careersclick();
		Thread.sleep(2000);
		home.blogsclick();
		Thread.sleep(2000);
		home.privacypolicyclick();
		Thread.sleep(2000);
		home.t_cclick();
		System.out.println("Task Completed");
		driver.quit();
		
	}
	
}
