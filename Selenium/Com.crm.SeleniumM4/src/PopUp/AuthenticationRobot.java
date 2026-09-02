package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationRobot {

    public static void main(String[] args) throws AWTException, InterruptedException {

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Maximize browser
        driver.manage().window().maximize();

        // Open website
        driver.get("https://basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");

        Thread.sleep(2000);

        // Create Robot object
        Robot r = new Robot();

        // Enter username
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_A);

        r.keyPress(KeyEvent.VK_D);
        r.keyRelease(KeyEvent.VK_D);

        r.keyPress(KeyEvent.VK_M);
        r.keyRelease(KeyEvent.VK_M);

        r.keyPress(KeyEvent.VK_I);
        r.keyRelease(KeyEvent.VK_I);

        r.keyPress(KeyEvent.VK_N);
        r.keyRelease(KeyEvent.VK_N);

        // Move to password field
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);

        // Enter password
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_A);

        r.keyPress(KeyEvent.VK_D);
        r.keyRelease(KeyEvent.VK_D);

        r.keyPress(KeyEvent.VK_M);
        r.keyRelease(KeyEvent.VK_M);

        r.keyPress(KeyEvent.VK_I);
        r.keyRelease(KeyEvent.VK_I);

        r.keyPress(KeyEvent.VK_N);
        r.keyRelease(KeyEvent.VK_N);

        // Click OK / Login
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(3000);

        System.out.println("Authentication handled successfully");

        driver.quit();
    }
}