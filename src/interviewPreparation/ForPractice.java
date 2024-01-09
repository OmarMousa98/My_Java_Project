package interviewPreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import interviewPreperation.Parametar;

import java.util.List;
import java.util.Random;

public class ForPractice extends Parametar{
WebDriver driver = new ChromeDriver();
	
	SoftAssert myAssertion = new SoftAssert();
    @Test()
    public void changeLanguage () {
        String[] myWebSite = {"https://global.almosafer.com/ar", "https://global.almosafer.com/en"};

        Random rand = new Random();
        int randomNum = rand.nextInt(2);
        driver.get(myWebSite[randomNum]);

        String[] expectedTitles = {"المسافر: رحلات، فنادق، أنشطة ممتعة و تذاكر طيران",
                "Almosafer: Flights, Hotels, Activities & Airlines Ticket Booking"};
        String actualResult = driver.getTitle();

        myAssertion.assertEquals(actualResult, expectedTitles[randomNum]);
        myAssertion.assertAll();
    }

    @Test()
    public void defaultCurrencySAR() {
        WebElement SARCurrency = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button"));
        String currencyInSite = SARCurrency.getText();
        String expectedCurrency = "SAR";
        myAssertion.assertEquals(expectedCurrency, currencyInSite);
        myAssertion.assertAll();
    }

    @Test()
    public void hotelsSearchNotSelected() {
        WebElement hotelButton = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
        String actualResult = hotelButton.getAttribute("aria-selected");
        String expectedResult = "false";
        myAssertion.assertEquals(expectedResult, actualResult);
        myAssertion.assertAll();
    }

    @Test()
    public void switchToHotelAndInput() {
        Random rand = new Random();
        String[] myWebSite = {"https://global.almosafer.com/ar", "https://global.almosafer.com/en"};
        String[] enInput = {"Dubai", "Jeddah", "Riyadh"};
        String[] arInput = {"دبي", "جدة"};

        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/button[1]")).click();
        WebElement hotelButton = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]/div"));
        hotelButton.click();

        int enCities = rand.nextInt(3);
        int arCities = rand.nextInt(2);
        int languageWebsite = rand.nextInt(2);
//        driver.get(myWebSite[languageWebsite]);
//
//        String inputXPath = "//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div[2]/div/div[1]/div/div[1]/div/div/input";
//        WebElement inputField = driver.findElement(By.xpath("//*[@id="uncontrolled-tab-example-tabpane-flights"]/div/div[2]/div[1]/div/div[2]/div[1]/div/div/div/input"));

        if (languageWebsite == 0) {
        	driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[1]/div/div/div/input")).sendKeys(arInput[arCities]);
        } else {
        	driver.findElement(By.xpath("driver.findElement(By.xpath(\"//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[1]/div/div/div/input\"))")).sendKeys(enInput[enCities]);
        }
    }
}
		
		
		
		
		
		
		
		
		
	//	public void qitafLogo()  {
	//		
	//		WebElement divQitafLogo = driver.findElement(By.xpath("//div[@class='sc-dznXNo iZejAw']//*[name()='svg']"));
	//
	//		System.out.println(divQitafLogo.isDisplayed());
	//		
	//		
	//		
	//		
	//		//		List<WebElement> inDiv = divQitafLogo.findElements(By.tagName("svg"));
	////		System.out.println(inDiv.size());
	////		myAssertion.assertEquals(inDiv, "Footer__MadaCardLogo");
	////		myAssertion.assertAll();
	//
	//
	//		
	//		//	        for(int i=0;i<inDiv.size();i++) {
	//		//	        	
	//		//	        	System.out.println(i);
	//		//	        }
	//		//	        System.out.println(driver.t data-testid);
	//		////	        List<WebElement> inDiv = divQitafLogo.findElements(By.tagName("svg"));
	//		//	       
	//
	//
	//	}




















