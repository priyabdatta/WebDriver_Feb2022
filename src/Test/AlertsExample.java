package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver" ,"chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
	//	WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//wait for browser to load implicit
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		//Alert Accept
		
		WebElement elm = driver.findElement(By.xpath("//*[@id='alertButton']"));
		elm.click();
		

		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		alert.accept();
		
		//Alert Cancel
		
		WebElement elm1 = driver.findElement(By.xpath("//*[@id='confirmButton']"));
		elm1.click();
		
		Alert alert1 = driver.switchTo().alert();
		
		System.out.println(alert1.getText());
		alert1.dismiss();
		
		//Alert Message
		
		WebElement elm2 = driver.findElement(By.xpath("//*[@id='promtButton']"));
		elm2.click();
		
		Alert alert2 = driver.switchTo().alert();
		
		System.out.println(alert2.getText());
		alert2.sendKeys("Priya");
		alert2.accept();
		
		
		
		
		
	}

}
