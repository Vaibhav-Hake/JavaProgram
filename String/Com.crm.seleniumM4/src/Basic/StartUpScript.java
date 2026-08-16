package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartUpScript {
 public static void main(String[] args) {
	 //Open the browser 
	//ChromeDriver driver=new ChromeDriver();
	 WebDriver driver=new ChromeDriver();//Another approach
	//MAximize the window
	driver.manage().window().maximize();
	//Enter into one webpage
	//driver.get("https://www.facebook.com");
	driver.navigate().to("https://www.facebook.com");
	//close
	//driver.close();
     driver.quit();//it will not give Socket Exception 
 }
 
}
