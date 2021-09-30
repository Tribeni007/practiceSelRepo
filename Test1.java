package mavenSelpracticeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	
  @Test
  public void f() {	  System.setProperty("webdriver.chrome.driver", "C:\\Tribeni\\jar\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	  

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
//Opening free crm

driver.get("https://www.ebay.com/");
driver.close();
  }
}
