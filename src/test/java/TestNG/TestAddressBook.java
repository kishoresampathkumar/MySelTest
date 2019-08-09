package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestAddressBook {
  @Test
  public void verifyAddressBook() {
	  // testcase
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "chromedriver");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless");
				ChromeDriver driver = new ChromeDriver(options);

				driver.get("http://localhost:8081/addressbook");
				driver.manage().window().maximize();
				String mytitle = driver.getTitle();
				System.out.println(mytitle);
				String myUrl = driver.getCurrentUrl();
				System.out.println(myUrl);
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.className("v-button")).click();
				driver.findElement(By.id("gwt-uid-5")).sendKeys("Edureka");
				driver.findElement(By.id("gwt-uid-7")).sendKeys("DevOps");
				driver.findElement(By.id("gwt-uid-9")).sendKeys("9834562709");
				driver.findElement(By.id("gwt-uid-11")).sendKeys("Devops@edureka.co");
				driver.findElement(By.id("gwt-uid-13")).sendKeys("01/01/2015");
				//driver.findElement(By.className("v-button-primary")).click();
				//Thread.sleep(5000);
				//driver.quit();
  }
}