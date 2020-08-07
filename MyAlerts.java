package BulkObjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MyAlerts {
	@Test
	public void doTestWindow() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/LatestDrivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://www.rediff.com/");
	    driver.findElement(By.linkText("Sign in")).click();
	    driver.findElement(By.name("proceed")).click();
	    
	    Alert alt=driver.switchTo().alert();
	    System.out.println("Alert Text is ->"+alt.getText());
	    //WebDriverwait
	    
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(4));
	    wait.until(ExpectedConditions.alertIsPresent());
	    //alt.accept();
	    //alt.dismiss();
	    //go to defalut content 
	    driver.switchTo().defaultContent();

}
}