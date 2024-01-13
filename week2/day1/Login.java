package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class Login {
	public static void main (String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("kiruthivasan475@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Q8r6@ct2");
		driver.findElement(By.name("login")).click();
		
	}
}
