package MouseAndKeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Register {
public static void main(String[] args) throws InterruptedException {
	throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(15)
        );

        
        Actions actions = new Actions(driver);

        
        driver.get("https://demo.automationtesting.in/Register.html");

        WebElement firstName = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("input[placeholder='First Name']")));

        actions.moveToElement(firstName)
                .click()
                .sendKeys("Vedant")
                .perform();

        
        WebElement lastName = driver.findElement(
                By.cssSelector("input[placeholder='Last Name']"));

        actions.moveToElement(lastName)
                .click().sendKeys("Bharaskar").perform();

        WebElement address = driver.findElement(
                By.cssSelector("textarea[ng-model='Adress']"));

        actions.moveToElement(address)
                .click()
                .sendKeys("Pune, Maharashtra, India")
                .perform();

        WebElement email = driver.findElement(
                By.cssSelector("input[type='email']"));

        actions.moveToElement(email)
                .click()
                .sendKeys("vedant@gmail.com")
                .perform();

        WebElement phone = driver.findElement(
                By.cssSelector("input[type='tel']"));

        actions.moveToElement(phone)
                .click()
                .sendKeys("9876543210")
                .perform();

        WebElement male = driver.findElement(
                By.cssSelector("input[value='Male']"));

        actions.moveToElement(male)
                .click()
                .perform();

        WebElement cricket = driver.findElement(
                By.cssSelector("input[value='Cricket']"));

        actions.moveToElement(cricket)
                .click()
                .perform();

        WebElement movies = driver.findElement(
                By.cssSelector("input[value='Movies']"));

        actions.moveToElement(movies)
                .click()
                .perform();

        WebElement language = driver.findElement(By.id("msdd"));

        actions.moveToElement(language)
                .click()
                .perform();

        WebElement english = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[text()='English']")));

        actions.moveToElement(english)
                .click()
                .perform();

        Select skills = new Select(
                driver.findElement(By.id("Skills")));

        skills.selectByVisibleText("Java");

        Select country = new Select(
                driver.findElement(By.id("countries")));

        country.selectByVisibleText("India");

        Select year = new Select(
                driver.findElement(By.id("yearbox")));

        year.selectByVisibleText("2004");

        Select month = new Select(
                driver.findElement(
                        By.cssSelector("select[placeholder='Month']")));

        month.selectByVisibleText("September");

        Select day = new Select(
                driver.findElement(By.id("daybox")));

        day.selectByVisibleText("17");

        WebElement password = driver.findElement(
                By.id("firstpassword"));

        actions.moveToElement(password)
                .click()
                .sendKeys("Vedant@123")
                .perform();

        WebElement confirmPassword = driver.findElement(
                By.id("secondpassword"));

        actions.moveToElement(confirmPassword)
                .click()
                .sendKeys("Vedant@123")
                .perform();

        System.out.println("Registration form filled successfully.");

        Thread.sleep(3000);

        driver.quit();
}
}
