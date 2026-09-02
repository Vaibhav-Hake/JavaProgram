package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment02_sept {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.easemytrip.com/flights.html?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gad_campaignid=788997081&gbraid=0AAAAADo_0-gDN73Jw2B4J-auIE38jcbXh&gclid=Cj0KCQjw79nUBhCgARIsADSHka3cBZW-1lrT5xqyyfOnIVphXVLuYTz9vvKNytKcqY25s0BG_mKjvzUaArW2EALw_wcB");
    Thread.sleep(2000);
    d.findElement(By.id("#ddate")).click();
    d.quit();
}
}
