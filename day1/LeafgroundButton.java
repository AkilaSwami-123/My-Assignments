package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		//Load the url
		driver.get("https://leafground.com/button.xhtml");
		//Maximize the screen
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click and confirm title
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		System.out.println("clicked to next page");
		
		String dashTitle = driver.getTitle();
		System.out.println("Title of the page is");
	 	System.out.println(dashTitle);
	 	Thread.sleep(5000);
	 	
	 	//Navigating to the previous page
		driver.navigate().back();
	 	
	 	//check if button is disabled
	 	boolean isSel =  driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).isSelected();
	 	System.out.println("The boolean val :" + " " + isSel);
	 	if(isSel!=true)
	 	{
	 		System.out.println("button is disabled");
	 	}
	 	else
	 		System.out.println("Button is enabled");
	 	
	 	//getting position of button SUBMIT
	 	driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).getLocation();
	 	Point getPosition=driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).getLocation();
	 	System.out.println("The Coordinates are :");
	 	System.out.println("The X" + getPosition.getX());
	 	System.out.println("The Y" + getPosition.getY());
	 	
	   //finding background colour of the button "Find and save button colour"
	 	String bckColor= driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]")).getCssValue("background-color");
	 	System.out.println("The background colour is" +  " " + bckColor );	 	
	 	
	 	//Finding height and width of the button "Find height and width of this button"
	 	WebElement getValues = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]"));
	 	int getWidth = getValues.getSize().getWidth();
	 	int getHeight = getValues.getSize().getHeight();
	 	System.out.println("The Width of the button is" +  " " + getWidth);
	 	System.out.println("The Height of the button is" + " " + getHeight);
	 	
	}

}
