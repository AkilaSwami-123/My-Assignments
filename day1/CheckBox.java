package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver =new ChromeDriver();
		//Load the url
		driver.get("https://leafground.com/checkbox.xhtml");
		//Maximize the screen
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//clicking  basic check box
		Thread.sleep(5000);
		WebElement basicChkBox = driver.findElement(By.xpath("//span[text() ='Basic']"));
		basicChkBox.isSelected();
		basicChkBox.click();
		
		//clicking notify check box
		Thread.sleep(5000);
		WebElement notifyBox=driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[2]"));
		notifyBox.isSelected();
		notifyBox.click();
		
		
		String notifyMsg= driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println(notifyMsg);	
		
		//clicking fav language
		Thread.sleep(5000);
		//WebElement favLang=driver.findElement(By.xpath("(//span[@class='ui-chkbox-icon ui-icon ui-icon-blank ui-c'])[1]"));
		WebElement favLang=driver.findElement(By.xpath("//label[text()='Java']"));
		favLang.isSelected();
		favLang.click();
		
		//clicking tristate
		Thread.sleep(5000);
		//WebElement state = driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']"));
		WebElement triState=driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']"));
		WebElement state = driver.findElement(By.xpath("//input[@id='j_idt87:ajaxTriState_input']"));
		//WebElement state=driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]"));
		triState.isSelected();
		//state.isEnabled();
		triState.click();
		
		
		//clicking toggle
		Thread.sleep(5000);
		WebElement toggle= driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']"));
		toggle.isSelected();
		Thread.sleep(5000);
		toggle.click();
		System.out.println("Toggle");
		
		//checking disabled
		Thread.sleep(5000);
		WebElement dis=driver.findElement(By.xpath("//span[text()='Disabled']"));	
		//dis.click();
		if(dis.isSelected()==false)
             System.out.println("Checkbox disabled");
		else
			System.out.println("Not disabled");
		
		//select multiple 
		Thread.sleep(5000);
		
		
		
		WebElement options= driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']"));
		options.click();
		System.out.println("Multiple clicked");
		//WebElement city= driver.f"indElement(By.linkText("Miami"));
		//WebElement city=driver.findElement(By.xpath("(//span[contains(@class,'ui-chkbox-icon ui')]([10]"));
		
		Thread.sleep(5000);
		WebElement option1= driver.findElement(By.xpath("(//li[contains(@class,'selectcheckboxmenu')])[1]"));
		option1.isSelected();
		option1.click();
		System.out.println("Miami selected");
		
		
		
	}
		

}
