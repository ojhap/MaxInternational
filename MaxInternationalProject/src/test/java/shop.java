import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class shop  {
	@Test
	public void shop() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium component\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.max.com/company/select-locale/");
		driver.findElement(By.xpath("//*[contains(@style,'flag-image-us--100px.jpg')]")).click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='/shop/shop-product' and @role='button']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver ;
			js.executeScript("window.scrollBy(0,800)");
			Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='2981']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='3030']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='img-responsive' and @src='https://www.max.com/images/cartIcon.svg']")).click();
		Thread.sleep(3000);
		driver.close();
	}
}