package Week6.day2;
import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testcase.CommonSteps;

public class CreateLead extends CommonSteps{
@Test(dataProvider="fetchdata")
	public void Createlead(String cname,String fname, String lname) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
		
}
@BeforeClass
public void callFile() {	 
	 fileName="seleniumreaddata";
}

}






