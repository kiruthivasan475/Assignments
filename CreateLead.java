package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mongodb.annotations.ThreadSafe;

public class CreateLead {
	public static void main (String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Vasu Tech");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kiruthivasan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Murugesan");
		WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select opt=new Select(dropdown);
		opt.selectByIndex(4);
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select opt1=new Select(dropdown1);
		opt1.selectByVisibleText("Automobile");
		WebElement dropdown2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select opt2=new Select(dropdown2);
		opt2.selectByValue("OWN_CCORP");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(400000);
		driver.close();
}
}