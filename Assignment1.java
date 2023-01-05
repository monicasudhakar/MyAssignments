package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// Assignment 1:Create Lead
		//  1. Launch URL "http://leaftaps.com/opentaps/control/login"
		  driver.get("http://leaftaps.com/opentaps/control/login"); 
		  driver.manage().window().maximize();
		  // 2. Enter UserName and Password Using Id Locator
		   driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		   driver.findElement(By.id("password")).sendKeys("crmsfa");
		  // 3. Click on Login Button using Class Locator
		   driver.findElement(By.className("decorativeSubmit")).click();
		   //4. Click on CRM/SFA Link
		   driver.findElement(By.linkText("CRM/SFA")).click();
		   //5. Click on Leads Button
		   driver.findElement(By.linkText("Leads")).click();
		   //6. Click on create Lead Button
		   driver.findElement(By.linkText("Create Lead")).click();
		   //7. Enter CompanyName using id Locator
		   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		  // 8. Enter FirstName using id Locator
		   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("monica");
		   //9. Enter LastName using id Locator
		   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("c");
		   //10. Select value as Employee in Source Using SelectbyVisible text
		   WebElement drop = driver.findElement(By.id("createLeadForm_dataSourceId"));
		   Select tool = new Select(drop);
		   tool.selectByVisibleText("Employee");
		   //11. Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue
		   WebElement campaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		   Select tool1 = new Select(campaign);
		   tool1.selectByValue("9001");
		   //13. Select value as Corporation in OwnerShip field Using SelectbyIndex
		   WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		   Select tool2 = new Select(owner);
		   tool2.selectByIndex(5);
		   
		   //14. Select value as India in Country Field Using SelectbyVisibletext
		   WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		   Select tool3 = new Select(country);
		   tool3.selectByVisibleText("India");
		   
		   //15. Click on create Lead Button Using name Locator
		   driver.findElement(By.name("submitButton")).click();
		   //16. Get the Title of the resulting Page
		   String title=driver.getTitle();
	       System.out.println(title);	   
	}

}
