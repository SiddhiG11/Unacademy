package pagefactoryPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUsPOM {
	WebDriver driver;

	@FindBy(linkText = "About us")
	WebElement aboutus;
	
	@FindBy(linkText = "Careers")
	WebElement careers;
	
	@FindBy(linkText = "Blogs")
	WebElement blogs;
	
	@FindBy(linkText = "Privacy Policy")
	WebElement privacypolicy;
	
	@FindBy(linkText = "Terms and Conditions")
	WebElement t_c;

	public AboutUsPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void aboutusclick() {
		aboutus.click();
	}

	public void careersclick() {
		careers.click();
	}

	public void blogsclick() {
		blogs.click();
	}

	public void privacypolicyclick() {
		privacypolicy.click();
	}

	public void t_cclick() {
		t_c.click();
	}
}
