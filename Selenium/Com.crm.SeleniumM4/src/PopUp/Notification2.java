package PopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification2 {
public static void main(String[] args) throws InterruptedException {
	//first way
	ChromeOptions op=new ChromeOptions();
	op.addArguments("--disable-notifications");
	WebDriver d=new ChromeDriver(op);
	d.manage().window().maximize();
	d.get("https://www.easemytrip.com/");
	Thread.sleep(3000);
	Thread.sleep(3000);
	d.quit();
}
}
