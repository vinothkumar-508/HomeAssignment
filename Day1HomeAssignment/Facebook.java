package Week3.Day1HomeAssignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		
List<WebElement> tags = driver.findElements(By.tagName("a"));
		
		int totallinks = tags.size();
		System.out.println("total number of link :"+totallinks);
		
		for (int i = 0; i < totallinks; i++) {
			
			System.out.println(tags.get(i).getText());
			
		}
		

}
}
