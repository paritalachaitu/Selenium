package beginig;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class First_Pgm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/");
		Thread.sleep(3000);
		WebDriverWait ww=new WebDriverWait(driver, 40);
		ww.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[6]/div/div/button")));
		driver.findElement(By.xpath("//div[6]/div/div/button")).click();
		//driver.switchTo().frame("iframe");
		
		//driver.findElement(By.xpath("//*[contains(text(),'NO THANKS')]")).click();
		driver.quit();
	}

}
