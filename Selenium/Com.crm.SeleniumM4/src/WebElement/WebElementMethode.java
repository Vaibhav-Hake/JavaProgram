package WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethode {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
    d.get("https://demowebshop.tricentis.com/");
	
	Thread.sleep(2000);
}
}
