package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

// All th objects belonging to one page will be defined in java class
public class HomePage {
// 1. Is to call the driver object from testcase to Pageobject file
	
	//Concatenate driver
	public HomePage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(xpath="//*[@text='Cautious']")
	public WebElement CautiousOption;
	@AndroidFindBy(xpath="//*[@text='Balanced']")
	public WebElement BalancedOption;
	@AndroidFindBy(xpath="//*[@text='Adventurous']")
	public WebElement AdventurousOption;
	@AndroidFindBy(xpath="//*[@text='30%']")
	public WebElement balencedPercentage1;
	@AndroidFindBy(xpath="//*[@text='45%']")
	public WebElement balencedPercentage2;
	@AndroidFindBy(xpath="//*[@text='25%']")
	public WebElement balencedPercentage3;
	@AndroidFindBy(xpath="//*[@text='5%']")
	public WebElement adventurousPercentage1;
	@AndroidFindBy(xpath="//*[@text='60%']")
	public WebElement adventurousPercentage2;
	@AndroidFindBy(xpath="//*[@text='35%']")
	public WebElement adventurousPercentage3;
	
	public WebElement getCautiousField()
	{
		System.out.println("trying to find the CautiousOption field");
		return CautiousOption;
	}
	public WebElement getBalancedField()
	{
		System.out.println("trying to find the BalancedOption field");
		return BalancedOption;
	}
	public WebElement getAdventurousField()
	{
		System.out.println("trying to find the AdventurousOption field");
		return AdventurousOption;
	}
	public WebElement getbalencedPercentage2()
	{
		System.out.println("trying to find the balencedPercentage2");
		return balencedPercentage2;
	}
	public WebElement getbalencedPercentage1()
	{
		System.out.println("trying to find the balencedPercentage1 ");
		return balencedPercentage1;
	}
	public WebElement getbalencedPercentage3()
	{
		System.out.println("trying to find the balencedPercentage3 ");
		return balencedPercentage3;
	}
	public WebElement getadventurousPercentage1()
	{
		System.out.println("trying to find the adventurousPercentage1 ");
		return adventurousPercentage1;
	}
	
	public WebElement getadventurousPercentage2()
	{
		System.out.println("trying to find the adventurousPercentage2");
		return adventurousPercentage2;
	}
	
	public WebElement getadventurousPercentage3()
	{
		System.out.println("trying to find the adventurousPercentage3 ");
		return adventurousPercentage3;
	}
	
	
	
	
}

