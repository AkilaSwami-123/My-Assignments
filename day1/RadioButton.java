package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		//Load the url
		driver.get("https://www.leafground.com/radio.xhtml");
		//Maximize the screen
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(5000);
		
		WebElement favBrowser=driver.findElement(By.xpath("(//label[text()='Chrome'])[1]"));
		//WebElement favBrowser=driver.findElement(By.xpath("//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active ui-state-hover']"));
		//WebElement favBrowser=driver.findElement(By.xpath("//span[@class='ui-radiobutton-icon ui-icon ui-c ui-icon-bullet']"));
	// 	WebElement favBrowser=driver.findElement(By.xpath("//input[@id='j_idt87:console1:0']"));
		favBrowser.isSelected();
		favBrowser.click();
		System.out.println("fav browser selected");
		
		//identifying already selected browser
		Thread.sleep(5000);
		WebElement selBrowser=driver.findElement(By.xpath("(//label[text()='Safari'])[2]"));
		if(selBrowser.isEnabled()==true)
		{
			System.out.println("Default radio button selected is :");
			System.out.println(selBrowser.getText());
		}
		else
			System.out.println("Not Selected");
		
		//Check and select age group is not selected already
		Thread.sleep(5000);
		WebElement age=driver.findElement(By.xpath("//label[text()='21-40 Years']"));
		if(age.isEnabled()==true)
			System.out.println("Age group is already selected");
		else
		{
			System.out.println("Age group not selected");
			age.click();
		}
		
		
		
		
		
		
		
		

	}

}
