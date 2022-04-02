package Week6.day2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class Deleteincident extends CommonIncident {
	@Test(priority=4)
	public void Deleteinc() {
		//WebElement pframe1 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		//driver.switchTo().frame(pframe1);
		driver.findElement(By.xpath("//div[@id='incident_list']//tbody[@class='list2_body']//td[@class='vt']/a[@class='linked formlink']")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='form_action_button_container']//button[@class='form_action_button  action_context btn btn-default'][3]")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@class='btn btn-destructive']")).click();
		driver.close();
	}

}
