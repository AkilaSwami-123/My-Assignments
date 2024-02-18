package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver =new ChromeDriver();
		//Load the url
		driver.get("https://login.salesforce.com/");
		//Maximize the screen
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter the username
		driver.findElement(By.className("username")).sendKeys("princilaroseline.edward@testleaf.com");
		//enter the password
		driver.findElement(By.id("password")).sendKeys("Princila@123");
		//click login button
		driver.findElement(By.id("Login")).click();
		//Thread.sleep(3000);
		//click on app launcher
		driver.findElement(By.className("slds-icon-waffle")).click();

		}

		
}
		



