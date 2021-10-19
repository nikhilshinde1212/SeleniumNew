package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://developer.salesforce.com/signup?d=70130000000td6N");
		
		//driver.findElement(By.xpath(" //a[text()=' Terms of Use']")).click();
		
		//driver.findElement(By.xpath("//a[text()=' Terms of Use']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Terms of Use')]")).click();   // use of contains + text method 
	}

}
