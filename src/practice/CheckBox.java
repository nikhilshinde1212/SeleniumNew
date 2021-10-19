package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#RememberMe")).click();
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='nav nav-pills nav-sidebar flex-column nav-legacy']/child::li[4]")).click();
		driver.findElement(By.xpath("//p[text()=\" Customers\"]")).click();
		
	//	driver.findElement(By.cssSelector("Select#SearchMonthOfBirth")).sendKeys("1");
		Select s = new Select (driver.findElement(By.cssSelector("Select#SearchMonthOfBirth")));
		s.selectByVisibleText("1");
		
		driver.findElement(By.xpath("id('SearchDayOfBirth')")).sendKeys("5");
		driver.findElement(By.xpath("//li[@class='k-button']")).click();
		
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='SelectedCustomerRoleIds_listbox']//li"));
		for (int i = 0; i < list.size(); i++) {
	//		if (list.get(i).getText().contains("Forum Moderators")) {
				list.get(i).click();	
	//	}
		}
		
		List<WebElement>list1 = driver.findElements(By.xpath("//input[@class='checkboxGroups']")); //for selecting all checkboxes
		for (WebElement w1 : list1) {
	//		w1.click();
			if (w1.getAttribute("Value").equalsIgnoreCase("5")|| w1.getAttribute("Value").equals("2")) {
				w1.click();
	//		}else if (w1.getAttribute("Value").equals("2")) {
	//			w1.click();
			}
		}
	}

}
