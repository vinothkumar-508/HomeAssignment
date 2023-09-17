package HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookDemonstrating {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        driver.findElement(By.name("firstname")).sendKeys("vinoth");
        driver.findElement(By.name("lastname")).sendKeys("kumar");
        driver.findElement(By.name("reg_email__")).sendKeys("kumar");
        driver.findElement(By.id("password_step_input")).sendKeys("vinoth@123");
        WebElement select = driver.findElement(By.id("day"));
        Select option = new Select(select);
        (option).selectByIndex(0);
        WebElement select1 = driver.findElement(By.id("month"));
        Select option1 = new Select(select1);
        (option1).selectByVisibleText("Jan");
        WebElement select2 = driver.findElement(By.id("year"));
        Select option2 = new Select(select2);
        (option2).selectByValue("2000");
        driver.findElement(By.xpath("//label[text()='Male']")).click();

	}

	}
