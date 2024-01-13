package week2.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;



public class Sample {
 
	public static void main (String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();//to launch browser
		driver.manage().window().maximize();//maximize the screen
		driver.get("http://leaftaps.com/opentaps/control/main");//load 
      //to wait before class use thread.sleep 
	//	driver.close();//to close browser
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
	   
}
}