
package stepdefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagefactoryPOM.OtherLinks_POM;

public class OtherLinks {

	@Test
	public void testcheck() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://unacademy.com/about");
		driver.manage().window().maximize();
		//scroll down for about us
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(4000);

		OtherLinks_POM link = PageFactory.initElements(driver, OtherLinks_POM.class);
		 
		//scroll down 
		JavascriptExecutor js1 = ((JavascriptExecutor) driver);
		js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(4000);
		link.userguidelinesclick();
		JavascriptExecutor js2 = ((JavascriptExecutor) driver);
		js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(4000);
		Thread.sleep(1000);
		link.sitemapclick();
		Thread.sleep(1000);
		//navigate back
		link.refund_pclick();
		Thread.sleep(2000);
		link.legal_nclick();
		Thread.sleep(1000);
		link.p_sclick();
		System.out.println("Task Completed");
		driver.quit();
		
	}
	
}
