package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		//Assignment 2:Duplicate Lead
        //1. Launch URL "http://leaftaps.com/opentaps/control/login"
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login"); 
		driver.manage().window().maximize();
		 // 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		  //3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		  //4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		  //5. Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
//		  6. Click on Create Lead 
		driver.findElement(By.linkText("Create Lead")).click();
//		  7. Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
//		  8. Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("monica");
//		  9. Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kalyan");
//		  10. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Moni");
//		  11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software testing");
//		  12. Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Fresher with selenium knowledge");
//		  13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("monicasudhakar96@gmail.com");
//		  14. Click on Create Button
		driver.findElement(By.className("smallSubmit")).click();
//        15. Get the Title of Resulting Page using driver.getTitle()
		String title = driver.getTitle();
		System.out.println(title);
//        16. Click on Duplicate button
		driver.findElement(By.linkText("Duplicate Lead")).click();
//        17. Clear the CompanyName Field using .clear() And Enter new CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("WIPRO");
//        18.Clear the FirstName Field using .clear() And Enter new FirstName
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bharath");
//Bu        19.Click on Create Lead Button
		driver.findElement(By.className("smallSubmit")).click();
//        20. Get the Title of Resulting Page using driver.getTitle()
         String title1 = driver.getTitle();
         System.out.println(title1);
	}

}
