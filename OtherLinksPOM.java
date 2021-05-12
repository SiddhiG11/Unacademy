package pagefactoryPOM;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	
	public class OtherLinksPOM {

		WebDriver driver;
		@FindBy(linkText = "User Guidelines")
		WebElement user_g;
		@FindBy(linkText = "Site Map")
		WebElement sitemap;
		@FindBy(xpath = "//*[@id=\"sitemap_category_0\"]/a/div")
		WebElement test;
		//@FindBy(xpath = "(//button[contains(.,'Go home')]")
        //WebElement homebtn;
		@FindBy(linkText = "Refund Policy")
		WebElement refund_p;
		@FindBy(linkText = "Legal Notices")
		WebElement legal_n;
		@FindBy(linkText = "Plus subscriptions T&C")
		WebElement p_s;

		public OtherLinksPOM(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public void userguidelinesclick() {
			user_g.click();
		}

		public void sitemapclick() {
			sitemap.click();
		}

		public void testclick() {
			test.click();
		}
		
		//public void homebtnclick() {
		//	homebtn.click();}
      
		public void refund_pclick() {
			refund_p.click();
		}

		public void legal_nclick() {
			legal_n.click();
		}

		public void p_sclick() {
			p_s.click();
		}
	}


