package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) {
//		CreateAccount 	
//		   1. Launch URL "http://leaftaps.com/opentaps/control/login"
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
//		   2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		   3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click(); 
//		   4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();		   
//		   5. Click on Accounts Button
		 driver.findElement(By.linkText("Accounts")).click();  
//		   6. Click on Create Account
		  driver.findElement(By.linkText("Create Account")).click();  
//		   7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
	   driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account1");
//		   8. Enter DEscriptiion as "Selenium Automation Tester"
	   driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
//		   9. Enter LocalName Field Using Xpath Locator
	   driver.findElement(By.id("groupNameLocal")).sendKeys("Moni");
//		   10. Enter SiteName Field Using Xpath Locator
	   driver.findElement(By.id("officeSiteName")).sendKeys("Chennai");
//		   11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
	   driver.findElement(By.id("annualRevenue")).sendKeys("300000");
//		   12. Select Industry as ComputerSoftware
	   WebElement industry = driver.findElement(By.name("industryEnumId"));
	   Select tool = new Select(industry);
	   tool.selectByIndex(3);
//		   13. Select OwnerShip as S-Corporation using SelectByVisibletext
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select tool1 = new Select(ownership);
		tool1.selectByVisibleText("S-Corporation");
//		   14. Select Source as Employee using SelectByValue
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select tool2 = new Select(source);
		tool2.selectByValue("LEAD_EMPLOYEE");
//		   15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
		WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
		Select tool3 = new Select(marketing);
		tool3.selectByIndex(6);
//		   16. Select State/Province as Texas using SelectByValue 
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select tool4 = new Select(state);
		tool4.selectByValue("TX"); 
//		   17. Click on Create Account using Xpath Locator
        driver.findElement(By.className("smallSubmit")).click();
	}

}
