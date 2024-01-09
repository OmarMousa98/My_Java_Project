package interviewPreperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class Parametar {
	
	WebDriver driver = new ChromeDriver();
	
	SoftAssert myAssertion = new SoftAssert();
	
     @BeforeTest
    public void mySetup() {
    	 
    	  String[] myWebSite= {"https://smartbuy-me.com/smartbuystore/en/Deals/c/DEALS","https://smartbuy-me.com/smartbuystore/ar/%D8%A7%D9%84%D8%B9%D8%B1%D9%88%D8%B6/c/DEALS"};
     }
}
