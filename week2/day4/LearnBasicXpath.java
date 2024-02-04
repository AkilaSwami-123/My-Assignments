package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBasicXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
 		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
 		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
 		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
  		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
  		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();


	}

}
