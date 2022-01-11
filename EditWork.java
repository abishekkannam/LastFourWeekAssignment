package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditWork {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("abishekkanna87.com");
		driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following::input"))
				.sendKeys("sang", Keys.TAB);
		System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		Boolean result = driver.findElement(By.xpath("//input[@disabled='true']")).isDisplayed();
		System.out.println(result);
	}

}