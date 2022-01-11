package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@type ='submit']")).click();
		driver.findElement(By.linkText("FLIGHTS")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(windowhandles);
		driver.switchTo().window(handles.get(1));
		String IRTC = driver.getTitle();
		System.out.println(IRTC);
		driver.switchTo().window(handles.get(1));
		driver.close();
	}

}
