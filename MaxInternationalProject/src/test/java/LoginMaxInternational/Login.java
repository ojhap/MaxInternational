package LoginMaxInternational;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
@Test
public class Login {
	public void setData(){
		System.setProperty("webdriver.chrome.driver","C:\\selenium component\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://qa.max.com/home/");
		 driver.findElement(By.xpath("//a[@class='text-white head-login reloader-alert']")).click();
		 driver.findElement(By.xpath("//input[@id='myusername']")).sendKeys("11103");
		 driver.findElement(By.xpath("//input[@id='mypassword']")).sendKeys("Cheese456!");
		 driver.findElement(By.xpath("//button[@id='submit']")).click();
//		 driver.switchTo().alert().accept();
//		 driver.findElement(By.xpath("//input[@id='agree_tc_user']")).click();
//		 Actions action = new Actions(driver);
//		 WebElement cb = driver.findElement(By.xpath("//input[@id='agree_tc_user']"));
//		 action.doubleClick (cb).perform(); 
				 
		 
		 


}
	
}