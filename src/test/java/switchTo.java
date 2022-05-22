import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class switchTo {
	
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//Drivers//chromedriver.exe");
	        WebDriver driver = new ChromeDriver();	        
	        driver.get("https://ksrtc.in/oprs-web/");
	        driver.manage().window().maximize();
	        
	        Set<String> handler = driver.getWindowHandles();
	        Iterator<String> it = handler.iterator();	
	        
	        while(it.hasNext()) {
	        	driver.switchTo().window(it.next());
	        	//driver.switchTo().newWindow(WindowType.TAB);
	        	if(driver.getTitle().equalsIgnoreCase("TargetWindowToClose")){
	        		//performing operations on specific window
	        		System.out.println("Found the window to perform, hence performing on the window");
	        		driver.findElement(By.xpath("")).click();
	        		
	        		//closing operations on specific window
	        		System.out.println("Found the window to close, hence closing the window");
	        		driver.close();	        		
	        	}	        	
	        }
	        
	        Thread.sleep(2000);
	        driver.close();
	}

}
