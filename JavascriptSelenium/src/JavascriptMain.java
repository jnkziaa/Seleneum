import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptMain {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Chrome107\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/johna/Downloads/FaqExtended.html");
		
		Thread.sleep(2000);
		WebElement jsScroller = driver.findElement(By.xpath("//input[@id='ques1']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", jsScroller);
		jsScroller.sendKeys("Do I wanna write anything here tho?");
		Thread.sleep(2000);
		
		WebElement jsScroller1 = driver.findElement(By.xpath("//input[@id='ques2']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", jsScroller1);
		jsScroller1.sendKeys("Again, do I really wanna write anything here tho?");
		Thread.sleep(2000);
		
	}
}
