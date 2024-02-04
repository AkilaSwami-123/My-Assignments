package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominosPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://pizzaonline.dominos.co.in/menu");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//span[text()='ADD TO CART'][2]"));
		driver.findElement(By.xpath("//span[contains(text(),'ADD TO CART')][2]"));

	}

}
