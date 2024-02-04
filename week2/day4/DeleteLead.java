package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  ChromeDriver driver= new ChromeDriver();
		  driver.get("http://leaftaps.com/opentaps");
		  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
	 		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	 		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	  		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	  		System.out.println("crm sfa link clicked");
	    	 
    	  driver.findElement(By.linkText("Leads")).click();
	  		//driver.findElement(By.xpath("//a[contains(text(),Leads)]")).click();
    	  //finding by index doubt since lots of 'leads' are there
	  		System.out.println("Leads page");
    	  driver.findElement(By.linkText("Find Leads")).click();
    	 System.out.println("find leads page");
    	 Thread.sleep(2000);
    	 
    	 driver.findElement(By.xpath("//span[contains(text(),'Name and ID')]")).click(); 
    	 driver.findElement(By.name("id")).sendKeys("14788");
    	 driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
    	 Thread.sleep(2000);
    	 driver.findElement(By.xpath("//a[contains(text(),'14788')]")).click();
    	 Thread.sleep(2000);
    	 driver.findElement(By.className("subMenuButtonDangerous")).click();
    	 Thread.sleep(5000);
    	 System.out.println("Record 14788 deleted");
    	     	 
    	/* driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click(); 
    	 driver.findElement(By.name("phoneNumber")).sendKeys("14");
    	 driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
    	 Thread.sleep(2000);
    	 */
    	
    	/* driver.findElement(By.xpath("//div[contains(text(),'Lead ID')]"));
    	 driver.findElement(By.xpath("//a[contains(text(),'14129')]")).click();
    	 Thread.sleep(2000);
    	 driver.findElement(By.className("subMenuButtonDangerous")).click();
    	 System.out.println("Record 14129 deleted");*/
    	// Thread.sleep(2000);
    	 
    	 driver.findElement(By.linkText("Find Leads")).click();
    	 driver.findElement(By.xpath("//span[contains(text(),'Name and ID')]")).click(); 
    	 driver.findElement(By.name("id")).sendKeys("14788");
    	 Thread.sleep(5000);
    	 driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
       	 System.out.println("Record Not Found");
    	 
    	 
    	 
    	 
    	 //String text1=lDrop.getText();
    	// System.out.println("the drop list is" + text1);
    	 
    	// Select item1 = new Select(lDrop);
    	// item1.selectByIndex(1);
    	 
    	// System.out.println("First lead record clicked");
	}

}
