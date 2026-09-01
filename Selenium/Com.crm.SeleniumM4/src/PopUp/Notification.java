package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class Notification {
public static void main(String[] args) throws InterruptedException, AWTException {
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.easemytrip.com/");
	Thread.sleep(3000);
	Robot bot=new Robot();
	bot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	bot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	bot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	bot.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	d.quit();
}
}
