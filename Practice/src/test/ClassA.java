package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class ClassA {

	
	WebDriver driver= new FirefoxDriver();

	
	public void m1()
	{
		driver.get("https://starter.earn.org/login");
		
		
	 WebElement Header = driver.findElement(By.xpath("//div[@class='earn-text earn-h4-resizable footer container']"));
	 List<WebElement> Headerlinks = Header.findElements(By.tagName("a"));
     int element= Header.findElements(By.tagName("a")).size();
     
    
     for(int i =0; i< element;i++){
    	 System.out.println(((WebElement) Headerlinks.get(i)).getText());
     }
    	 
		System.out.println(element);
		System.out.println(Headerlinks);
		
		
	}
	
}
