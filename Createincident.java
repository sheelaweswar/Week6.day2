package Week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Createincident extends CommonIncident{
	@Test(priority=1)
		public void Createinc() {
		
		driver.findElement(By.xpath("//button[text()='New']")).click();
		WebElement incNum = driver.findElement(By.xpath("//input[@id='incident.number']"));
		String getIncidentNum = incNum.getAttribute("value");
		System.out.println("getIncidentNum :"+getIncidentNum);
		driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("Create Instance");
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		WebElement search = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		search.sendKeys(getIncidentNum,Keys.ENTER);

	}

}
