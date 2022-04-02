package Week6.day2;

import java.util.Set;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AssignIncident extends CommonIncident {
	@Test(priority=3)
	public void Assigninc() throws InterruptedException {
		
		//WebElement pframe1 = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		//driver.switchTo().frame(pframe1);
		driver.findElement(By.xpath("//div[@id='incident_list']//tbody[@class='list2_body']//td[@class='vt']/a[@class='linked formlink']")).click();
		driver.findElement(By.xpath("//div[@class='col-xs-2 col-sm-3 col-lg-2 form-field-addons']/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody[@class='list2_body']//td[@class='vt']/a[@class='linked formlink']")).click();
		driver.findElement(By.xpath("//div[@class='input-group ref-container']//button[@id='lookup.incident.assignment_group']//span[@class='icon icon-search']")).click();
		String parent = driver.getWindowHandle();
		Set<String> allwindowhandle = driver.getWindowHandles();
		for(String currenthandle : allwindowhandle) {
			if(!currenthandle.equalsIgnoreCase(parent)) {
				driver.switchTo().window(currenthandle);
			}
		}
		driver.findElement(By.xpath("//table[@id='sys_user_group_table']//button[@class='list_header_search_toggle icon-search btn btn-icon table-btn-lg']")).click();
		driver.findElement(By.linkText("Software")).click();
		driver.switchTo().window(parent);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//textarea[@id='activity-stream-textarea']")).sendKeys("Update Work notes");
		driver.switchTo().parentFrame();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='form_action_button_container']//button[@class='form_action_button  action_context btn btn-default'][1]")).click();
		
	}

}
