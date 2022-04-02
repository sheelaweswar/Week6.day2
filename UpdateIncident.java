package Week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UpdateIncident extends CommonIncident {
	@Test(priority=2)
	public void Updateinc() {
		//WebElement pframe1 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		//driver.switchTo().frame(pframe1);
		driver.findElement(By.xpath("//div[@id='incident_list']//tbody[@class='list2_body']//td[@class='vt']/a[@class='linked formlink']")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame(0);
		WebElement priority = driver.findElement(By.xpath("(//select[@role='listbox']/option)[1]"));
		priority.click();
		System.out.println("priotity status:" +priority.getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame(0);
		WebElement status =driver.findElement(By.xpath("(//select[@role='listbox']/option)[5]"));
		status.click();
		System.out.println("state:"+status.getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id='sysverb_update_bottom']")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
	}

}
