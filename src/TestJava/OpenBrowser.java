package TestJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*System.setProperty("webdriver.gecko.driver", "D:\\SeleniumPractice\\geckodriver19.1\\geckodriver.exe");*/
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("Driver Called Successfully");
		
		Select dropdownelement = new Select(driver.findElement(By.xpath("//select[@id='continents']")));
		
		dropdownelement.selectByVisibleText("Africa");
		WebElement SelDropdown = driver.findElement(By.xpath("//select[@id='continents']"));
		System.out.println("Element "+SelDropdown.getText() +"selected");
		dropdownelement.selectByIndex(5);
		System.out.println("Element "+SelDropdown.getText() +"selected");
		
		/*driver.quit();*/
		
	}

}
