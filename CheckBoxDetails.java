package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxDetails {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		boolean selected = driver
				.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input")).isSelected();
		System.out.println("The Value is selected : " + selected);

		Boolean clickResult = driver
				.findElement(By.xpath("//label[text()='DeSelect only checked']/following::input[2]")).isSelected();
		if (clickResult == true) {
			driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[2]")).click();
		}

		driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[3]")).click();
		driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[4]")).click();
		driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[5]")).click();
		driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[6]")).click();
		driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[7]")).click();

	}

}