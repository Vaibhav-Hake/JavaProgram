package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment02_sept {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions op=new ChromeOptions();
	op.addArguments("--disable-notifications");
	ChromeDriver d=new ChromeDriver(op);
	d.manage().window().maximize();
	d.get("https://www.easemytrip.com/flights.html?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gad_campaignid=788997081&gbraid=0AAAAADo_0-gDN73Jw2B4J-auIE38jcbXh&gclid=Cj0KCQjw79nUBhCgARIsADSHka3cBZW-1lrT5xqyyfOnIVphXVLuYTz9vvKNytKcqY25s0BG_mKjvzUaArW2EALw_wcB");
    Thread.sleep(1000);
    d.findElement(By.id("ddate")).click();
    Thread.sleep(1000);
    d.findElement(By.id("fst_4_03/09/2026")).click();
    Thread.sleep(2000);
    d.findElement(By.id("divRtnCal")).click();
    Thread.sleep(1000);
    d.findElement(By.id("img2Nex")).click();
    Thread.sleep(1000);
    d.findElement(By.id("img2Nex")).click();
    Thread.sleep(1000);
    d.findElement(By.id("fiv_4_31/12/2026")).click();
   
}
}
