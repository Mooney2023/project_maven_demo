package Bootcamp_Theoertical_Questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Navigation_Commands_Que_5 {

	public static void main(String[] args) throws Exception{
		WebDriver driver =  new WebDriver();
		  driver.manage().window().maximize();
		  
		 
		 //webdrive Navigation commands
		 driver.navigate().to("https://www.rediff.com");
		 Thread.sleep(2000);
		 driver.navigate().to("https://www.amazon.com");
		 Thread.sleep(2000);
		  driver.navigate().back("https://www.rediff.com");
		 Thread.sleep(2000);
		 driver.navigate().forward("https://www.amazon.com");
		 Thread.sleep(2000);
		 driver.navigate().refresh("https://www.rediff.com");
		 Thread.sleep(2000);
		 driver.wait();
		 
		 
		 
		 
		 
		
		

	}

}
