package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowserAndLogin {
	
	public void setData(){
			System.setProperty("webdriver.chrome.driver","C:\\selenium component\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://qa.max.com/home/");
			 
		
	}


}