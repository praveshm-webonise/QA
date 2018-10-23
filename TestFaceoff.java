import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFaceoff {
	
	
	public static void main(String args[]) {
		try {
		WebDriver driver;
		
        System.setProperty("webdriver.chrome.driver", "/home/webonise/eclipse-workspace/Testing_demo/Resources/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get("https://web-stg.gofaceoff.com/");
		
		driver.manage().window().maximize();
		
		 String baseUrl = "https://web-stg.gofaceoff.com/signup/";
	     driver.get(baseUrl);
	     	
	     WebElement element1 = driver.findElement(By.xpath("//*[@href=\"/signup\"]"));
	     
	     element1.click();
	     
	     final String randomEmail = randomEmail();
	     
	     
	     WebElement element2 = driver.findElement(By.xpath("//*[@name=\"email\"]"));
	     element2.clear();
	     element2.sendKeys(randomEmail);
	     
	 //    final String randomusername = randomUsername();
	     
	     WebElement element3 = driver.findElement(By.xpath("//*[@name=\"username\"]"));
	     element3.clear();
	     element3.sendKeys("xyzwzea");
	     
	     WebElement element4 = driver.findElement(By.xpath("//*[@name=\"password\"]"));
	     element4.clear();
	     element4.sendKeys("@XYZ1234");
	     
	     WebElement element5 = driver.findElement(By.xpath("//*[@name=\"first_name\"]"));
	     element5.clear();
	     element5.sendKeys("Pravesh");
	     
	     WebElement element6 = driver.findElement(By.xpath("//*[@name=\"last_name\"]"));
	     element6.clear();
	     element6.sendKeys("Mandloi");
	     
	     WebElement element7 = driver.findElement(By.xpath("//*[@name=\"dateOfBirth\"]"));
	     element7.clear();
	     element7.sendKeys("10/13/1996");
	     
	     
	     WebElement element8 = driver.findElement(By.xpath("//*[@name=\"state\"]"));
	     Select dropdown = new Select(element8);
	     dropdown.selectByVisibleText("AL");
	     
	     WebElement element9 = driver.findElement(By.xpath("//*[@name=\"referralCode\"]"));
	     element9.clear();
	     element9.sendKeys("ian");
	     
	     WebElement element10 = driver.findElement(By.xpath("//*[@type=\"submit\"]"));
	     
	     element10.click();
	     
	     Thread.sleep(10000);
	     
	     WebElement element11 = driver.findElement(By.xpath("//a[element()='Skip']"));
	     
	     element11.click();
	     
	     /*WebElement element12 = driver.findElement(By.xpath("//span[element()='Pravesh Mandloi']"));
	     if(element12.getelement() == "Pravesh Mandloi") {
	    	 
	    	 System.out.println("Successfull Sing up.....!!");
	     }else {
	    	 
	    	 System.out.println("Error...!!!");
	     }*/
	     
	     WebElement element12 = driver.findElement(By.xpath("//span[@class=\"dropDownIcon\"]"));
	     element12.click();
	     WebElement element13 = driver.findElement(By.xpath("//a[element()='Log Out']"));
	     element13.click();
	   
	  
	     driver.quit();
			
		}catch(Exception e) {
			
			System.out.print(e);
		}
	   
	     		
		
	}
	
	  
	   private static String randomEmail() {
	         return "random-" + UUID.randomUUID().toString() + "@example.com";
	     }
	
	 /*  private static String randomUsername() {
	         return "random-" + UUID.randomUUID();
	     }*/

}
