package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment24_07 {

    // WAS for filling all the details of login1, login2 and login3
    // in XPath section from QSpiders demo app

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoapps.qspiders.com/");

        Thread.sleep(2000);

        driver.findElement(
                By.xpath("//main[@data-aos='zoom-in']")
        ).click();

        Thread.sleep(2000);

        driver.findElement(
                By.xpath("//section[text()='X Path']")
        ).click();

        Thread.sleep(2000);

        Actions act = new Actions(driver);

        driver.findElement(
                By.xpath("//section[text()='Login 1.0']")
        ).click();

        Thread.sleep(2000);

        WebElement userName = driver.findElement(
                By.xpath("//input[@placeholder='Username:']")
        );

        WebElement password = driver.findElement(
                By.xpath("//input[@placeholder='Password']")
        );

        WebElement radioButton = driver.findElement(
                By.xpath("//input[@type='radio' and @name='reg']")
        );

        WebElement checkBox = driver.findElement(
                By.xpath("//input[@type='checkbox' and @name='reg']")
        );

        act.sendKeys(userName, "afrozz48")
           .sendKeys(password, "Afroz@123")
           .perform();

        Thread.sleep(2000);

        act.click(checkBox)
           .click(radioButton)
           .perform();

        Thread.sleep(2000);

        driver.findElement(
                By.xpath("//section[text()='Login 2.0']")
        ).click();

        Thread.sleep(2000);

        userName = driver.findElement(
                By.xpath("//input[@placeholder='Username:']")
        );

        password = driver.findElement(
                By.xpath("//input[@placeholder='Password']")
        );

        act.sendKeys(userName, "afrozz48")
           .sendKeys(password, "Afroz@123")
           .perform();

        Thread.sleep(2000);

        WebElement radioBut = driver.findElement(
                By.xpath("//input[@type='radio']")
        );

        WebElement check = driver.findElement(
                By.xpath("//input[@type='checkbox']")
        );

        act.click(radioBut)
           .click(check)
           .perform();

        Thread.sleep(2000);

        driver.findElement(
                By.xpath("//section[text()='Login 3.0']")
        ).click();

        Thread.sleep(2000);

        driver.findElement(
                By.cssSelector("[placeholder='Username']")
        ).sendKeys("afrozz48");

        driver.findElement(
                By.cssSelector("[placeholder='Password']")
        ).sendKeys("Afroz@123");

        Thread.sleep(2000);

        WebElement login = driver.findElement(
                By.xpath("//button[text()='Login']")
        );

        act.click(login).perform();

        Thread.sleep(5000);

        driver.close();
    }
}