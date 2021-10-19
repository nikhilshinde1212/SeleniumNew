package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	//	driver.findElement(By.id("email")).sendKeys("Nikhil");      // by x path //a[@id='u_0_2_yT']
	//	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	
		driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Nikhil");
		driver.findElement(By.name("lastname")).sendKeys("Shinde");
		
		WebElement e = driver.findElement(By.id("day"));
		Select s = new Select(e);           
	//	s.selectByValue("5");
	//	s.selectByVisibleText("13");
		s.selectByIndex(13);
		
		
		WebElement e1 = driver.findElement(By.id("month"));
		Select s1 = new Select(e1);
		s1.selectByValue("11");
		
		WebElement e2 = driver.findElement(By.id("year"));
		Select s2 = new Select(e2);
		s2.selectByVisibleText("1990");
		
		
		
		 
		
	}

}
