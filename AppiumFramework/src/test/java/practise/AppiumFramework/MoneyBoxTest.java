package practise.AppiumFramework;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.HomePage;

public class MoneyBoxTest extends base
{
	@Test
	public void validateFunds() throws IOException, InterruptedException
	{
		service=startServer();
		AndroidDriver<AndroidElement> driver=capabilities("FundsApp");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       HomePage homePage=new HomePage(driver);
	       System.out.println("Veryfying Cautious Tab");
	       Assert.assertTrue(homePage.getCautiousField().isDisplayed());
	     homePage.getBalancedField().click();
	     System.out.println("Clicked on Balanced tab and verifying displayed percentages");
	     Assert.assertTrue(homePage.getbalencedPercentage1().isDisplayed());
	     Assert.assertTrue(homePage.getbalencedPercentage2().isDisplayed());
	     Assert.assertTrue(homePage.getbalencedPercentage3().isDisplayed());
	     homePage.getAdventurousField().click();
	     System.out.println("Clicked on Adventurous tab and verifying displayed percentages");
	     Assert.assertTrue(homePage.getadventurousPercentage1().isDisplayed());
	     Assert.assertTrue(homePage.getadventurousPercentage2().isDisplayed());
	     Assert.assertTrue(homePage.getadventurousPercentage3().isDisplayed());
	     service.stop();
	     
	}
	
	@BeforeTest
	public void killAllNodes() throws IOException, InterruptedException
	{
	//taskkill /F /IM node.exe
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(3000);
		
	}

}
