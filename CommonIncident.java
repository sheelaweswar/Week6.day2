package Week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonIncident {
	public ChromeDriver driver;
	@Parameters({"url","username","pwd"})
	@BeforeMethod
	public void preCondition(String url,String username,String pwd) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(username);
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement Filter = driver.findElement(By.xpath("//input[@id='filter']"));
		Filter.sendKeys("incidents",Keys.ENTER);
		driver.findElement(By.xpath("(//div[text()='Incidents'])[1]")).click();
		//driver.switchTo().frame(0);
		Thread.sleep(6000);
		WebElement pframe1 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(pframe1);
	}
	@AfterMethod
	public void postCondition(){
		driver.close();
	}
}
