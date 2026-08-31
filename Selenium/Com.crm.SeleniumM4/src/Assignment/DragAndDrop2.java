package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        Actions act = new Actions(driver);

        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Dynamic.html");

        Thread.sleep(2000);

        int seleniumCount = 0;
        int mongoCount = 0;
        int nodeCount = 0;

        for (int i = 0; i < 9; i++) {

            int num = (int)(Math.random() * 3);

            WebElement angularWeb;

            if (num == 0) {

                angularWeb = driver.findElement(By.id("angular"));
                seleniumCount++;

            } else if (num == 1) {

                angularWeb = driver.findElement(By.id("mongo"));
                mongoCount++;

            } else {

                angularWeb = driver.findElement(By.id("node"));
                nodeCount++;
            }

            WebElement target = driver.findElement(By.id("droparea"));

            act.dragAndDrop(angularWeb, target).perform();
        }

        System.out.println("Selenium count : " + seleniumCount);
        System.out.println("Mongo count : " + mongoCount);
        System.out.println("Node count : " + nodeCount);
    }
}