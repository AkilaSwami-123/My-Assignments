package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		  driver.get("http://leaftaps.com/opentaps/control/main");
		  driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		  driver.findElement(By.id("password")).sendKeys("crmsfa");
		  
		  //to login to the page
           driver.findElement(By.className("decorativeSubmit")).click();
	       driver.findElement(By.linkText("CRM/SFA")).click();
	       driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
	       driver.findElement(By.linkText("Create Account")).click();
	       driver.findElement(By.id("accountName")).sendKeys("ABC1");
	       System.out.println("ACCOUNT NAME ENTERED");
	       driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	       
	       WebElement sourceIndustry = driver.findElement(By.name("industryEnumId"));
	       Select drop1 = new Select(sourceIndustry);
           drop1.selectByIndex(3);
           System.out.println("INDUSTRY TYPE SELECTED");
           
           WebElement ownerShip = driver.findElement(By.name("ownershipEnumId"));
           Select drop2=new Select (ownerShip);
           drop2.selectByVisibleText("S-Corporation");
           System.out.println("OWNERSHIP TYPE SELECTED");
           
           WebElement source = driver.findElement(By.id("dataSourceId"));
           Select drop3=new Select (source);
           drop3.selectByValue("LEAD_EMPLOYEE");
           System.out.println("SOURCETYPE SELECTED");

           WebElement marketCamp = driver.findElement(By.id("marketingCampaignId"));
           Select drop4=new Select (marketCamp);
           drop4.selectByIndex(6);
           System.out.println("MARKETING CAMPAIGN SELECTED");
           
           WebElement stateProvince = driver.findElement(By.id("generalStateProvinceGeoId"));
           Select drop5=new Select (stateProvince);
           //drop5.selectByValue("Texas");
           drop5.selectByVisibleText("Texas");
           System.out.println("STATE PROVINCE TYPE SELECTED");
           
           //submit account details
           driver.findElement(By.className("smallSubmit")).click();
          // Thread.sleep(2000);
           driver.close();
          // System.out.println("BROWSER CLOSED");
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
	       
	       


	}

}
