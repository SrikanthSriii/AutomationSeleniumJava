package tutorialsninja.register;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC_RF_001 {

	@Test
	public void VerifyRegisterwithFields() {

		WebDriver driver = new ChromeDriver	();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	
		driver.findElement(By.xpath("//span[text()=\"My Account\"]")).click();
		driver.findElement(By.linkText("Register")).click();

		driver.findElement(By.id("input-firstname")).sendKeys("Srikanth");
		driver.findElement(By.id("input-lastname")).sendKeys("Kalepalli");
		driver.findElement(By.name("email")).sendKeys(generateNewEmail());
	    driver.findElement(By.name("telephone")).sendKeys("93898983865");
	    driver.findElement(By.id("input-password")).sendKeys("Sri@123");
	    driver.findElement(By.id("input-confirm")).sendKeys("Sri@123");
	    driver.findElement(By.name("agree")).click();
	    driver.findElement(By.xpath("//input[@value='Continue']")).click();
	
	    driver.close();
	   
	    
	}
	
	public  String generateNewEmail() {
		return new Date().toString().replaceAll("\\s","").replaceAll("\\:","")+"@gmail.com";
				
	}

	
}
   
