import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTrial {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Chrome107\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/johna/Downloads/UserRegistration.html");
		
		Thread.sleep(3000);
		//<input style="color: #FF0000;" class="fNameClass" name="fname" id="fname" type="text">
		WebElement fName = driver.findElement(By.xpath("//input[@class='fNameClass']"));
		fName.sendKeys("John");
		
		Thread.sleep(2000);
		
		WebElement middleName = driver.findElement(By.xpath("//input[@name='mname']"));
		middleName.sendKeys("Noel");
		
		
		Thread.sleep(2000);
		
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lname']"));
		lastName.sendKeys("Albesa");
		
		Thread.sleep(2000);
		
		WebElement age = driver.findElement(By.xpath("//input[@name='age']"));
		age.sendKeys("28");
		
		Thread.sleep(2000);
		WebElement maritalStatus = driver.findElement(By.xpath("//select[@name='marital']"));
		Select selectMaritalStatus = new Select(maritalStatus);
		selectMaritalStatus.selectByVisibleText("Married");
		
		Thread.sleep(2000);
		WebElement genderChooser =driver.findElement(By.xpath("//input[@value='Male']"));
		genderChooser.click();
		
		Thread.sleep(2000);
		WebElement checkboxPicker = driver.findElement(By.xpath("//input[@name='selenium']"));
		checkboxPicker.click();
		
		Thread.sleep(2000);
		WebElement fileUploader = driver.findElement(By.xpath("//input[@name='image']"));
		fileUploader.sendKeys("C:\\Users\\johna\\OneDrive\\Pictures\\Homer_Simpson_2006.png");
		
		Thread.sleep(2000);
		WebElement registerButton = driver.findElement(By.xpath("//input[@id='Register']"));
		registerButton.click();
		
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		
		
	}

}
