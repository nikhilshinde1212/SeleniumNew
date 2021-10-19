package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		/*Thread.sleep(5000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.manage().window().maximize();  */
		
//		WebElement e = driver.findElement(By.name("q"));
//		WebElement e = driver.findElement(By.xpath("//input[@type='text']"));
//		e.sendKeys("Swift Dzire");
		
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ford focus");	
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//div[@class='exehdJ']"));
	}

}
