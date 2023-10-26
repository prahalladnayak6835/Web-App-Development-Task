package pg.website.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MainTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver\\chromedriver.exe");

		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		// Launch website  
	    driver.navigate().to("http://localhost:8083/admin");
//	    
//	          
//	    // Click on the search text box and send value  
	    driver.findElement(By.id("username")).sendKeys("prahallad");  
	    driver.findElement(By.id("password")).sendKeys("1234"); 
////	          
////	    // Click on the search button  
	    driver.findElement(By.name("login")).click();  
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/a[2]")).click(); 
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/a[1]")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.id("checkId")).sendKeys("2");
		Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div/form/button")).click();
		 Thread.sleep(3000);
		 driver.quit();
		 WebDriver driver2 = new ChromeDriver();
		 driver2.navigate().to("http://localhost:8083/user");
		 Thread.sleep(3000);
		 driver2.findElement(By.id("username")).sendKeys("sinu");  
		 driver2.findElement(By.id("password")).sendKeys("1234"); 
		 driver2.findElement(By.name("login")).click();
		 Thread.sleep(3000);
		 driver2.findElement(By.xpath("/html/body/div[1]/a[2]")).click();
		 Thread.sleep(3000);
		 driver2.findElement(By.id("name")).sendKeys("Sinu Nayak");
		 driver2.findElement(By.id("roomNo")).sendKeys("101");
		 driver2.findElement(By.id("date")).sendKeys("23/02/2023");
		 driver2.findElement(By.id("problem")).sendKeys("Tea");
		 driver2.findElement(By.id("problemDescp")).sendKeys("Tea is not good");
		 driver2.findElement(By.id("complainRaisedBy")).sendKeys("Myself");
		 driver2.findElement(By.id("phoneNumber")).sendKeys("8527419630");
		 driver2.findElement(By.id("email")).sendKeys("sinunayak97@gmail.com");
		 Select status = new Select(driver2.findElement(By.name("status")));
		 status.selectByVisibleText("Raised");
		 
		 driver2.findElement(By.xpath("/html/body/form/input[9]")).click();  
		 
		 Thread.sleep(3000);
		 driver2.findElement(By.xpath("/html/body/a")).click();
		 Thread.sleep(3000);
		 driver2.quit();
		 
		 
		 WebDriver driver3 = new ChromeDriver();
		 driver3.navigate().to("http://localhost:8083/visitor");
		 Thread.sleep(3000);
		 driver3.findElement(By.id("username")).sendKeys("person");  
		 driver3.findElement(By.id("password")).sendKeys("1234"); 
		 driver3.findElement(By.name("login")).click();
		 Thread.sleep(3000);
		 //
		 driver3.findElement(By.xpath("/html/body/div[1]/a[3]")).click(); 
		 
		 Thread.sleep(7000);
		 driver3.quit();
		 

		
		
	}

}
