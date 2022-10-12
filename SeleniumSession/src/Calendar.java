import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Chrome107\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/johna/OneDrive/Desktop/WebSite/PradeepCalender.html");
		
		
		Thread.sleep(2000);
		WebElement calendarClick = driver.findElement(By.xpath("//img[@src='calander.png']"));
		calendarClick.click();
		
		Thread.sleep(2000);
		WebElement dayClick = driver.findElement(By.xpath("//td[@class='day' and text()='13']"));
		dayClick.click();
	
		Thread.sleep(2000);
		WebElement clickOut = driver.findElement(By.xpath("//input[@type='text']"));
		clickOut.click();
		
		Thread.sleep(2000);
		calendarClick.click();
		
		Thread.sleep(2000);
		WebElement findJanuary = driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='picker-switch' and text()='October 2022']"));
		findJanuary.click();
		
		String yearPicker = driver.findElement(By.xpath("//div[@class='datepicker-months']//th[@class='picker-switch']")).getText();
		System.out.println(yearPicker);
		while(!yearPicker.equals("1995")){
			
			driver.findElement(By.xpath("//div[@class='datepicker-months']//th[@class='prev']")).click();
			Thread.sleep(500);
			yearPicker = driver.findElement(By.xpath("//div[@class='datepicker-months']//th[@class='picker-switch']")).getText();
			System.out.println(yearPicker);
		}
		
		Thread.sleep(2000);
		WebElement clickJanuary = driver.findElement(By.xpath("//span[@class='month' and text()='Mar']"));
		clickJanuary.click();
		
		Thread.sleep(2000);
		WebElement click2025 = driver.findElement(By.xpath("//td[@class='day' and text()='25']"));
		click2025.click();
		
		Thread.sleep(2000);
		clickOut.click();
	}

}
