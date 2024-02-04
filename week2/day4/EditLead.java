package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  ChromeDriver driver= new ChromeDriver();
		  driver.get("http://leaftaps.com/opentaps/control/main");
		  driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		  driver.findElement(By.id("password")).sendKeys("crmsfa");
		  driver.findElement(By.className("decorativeSubmit")).click();
		  driver.findElement(By.linkText("CRM/SFA")).click();
    	  driver.findElement(By.linkText("Leads")).click();
		  driver.findElement(By.linkText("Create Lead")).click();
		  
		  driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TESTLEAF");
		  driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("AKS");
		  driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("test");
		  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("aks");
		  driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Software Testing");
	      driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Testing Engineer");
	      
	      
		 // driver.findElement(By.xpath("//input[@id='createLeadForm_description']")).sendKeys("Selenium Testing Engineer");
		  driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("abc@gmail.com");
		  
		  WebElement stateProvince = driver.findElement(By.name("generalStateProvinceGeoId"));
		  Select sDrop = new Select (stateProvince);
		  sDrop.selectByVisibleText("New York");
		  
		  driver.findElement(By.name("submitButton")).click();
		  //System.out.println("Account Created");
		  Thread.sleep(2000);
		  
		  System.out.println("GOING TO EDIT");
		  		  
		  driver.findElement(By.linkText("Edit")).click();
		  driver.findElement(By.name("description")).clear();
		  driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Software Tester Trainee");
		  driver.findElement(By.name("submitButton")).click();
		  Thread.sleep(5000);
		  
		  System.out.println("UPDATED SUCCESSFULLY");
		  String title = driver.getTitle();
		  System.out.println("Title of the page is");
		  System.out.println(title);

		  
		  /*System.out.println("GOING TO DELETE");
		  driver.findElement(By.className("subMenuButtonDangerous")).click();
		  System.out.println("DELETE BUTTON CLICKED");*/
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
