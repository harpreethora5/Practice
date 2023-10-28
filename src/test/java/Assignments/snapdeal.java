package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class snapdeal {

	public static void main(String[] args) {
		 WebDriverManager.edgedriver().setup(); 
		 WebDriver driver=new EdgeDriver(); 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.snapdeal.com/");
		 WebElement toys = driver.findElement(By.xpath("//li[@class='navlink ']/following-sibling::li[@navindex='4']"));
Actions a=new Actions(driver);
a.moveToElement(toys).perform();
	}

}
