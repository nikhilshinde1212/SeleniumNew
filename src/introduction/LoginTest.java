package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
					
		System.setProperty("webdriver.chrome.driver", "\"G:\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("nikhil6227@gmail.com");
		driver.findElement(By.id("pass"));
		driver.findElement(By.xpath("//*[@id=\"u_0_d_7p\"]")).click();
		driver.close();
	}

}
