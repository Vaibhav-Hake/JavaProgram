package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class UrlTitlePageSrc {
public static void main(String[] args) throws InterruptedException {
	//open the browser
		ChromeDriver driver=new ChromeDriver();
		//Maximize
		driver.manage().window().maximize();
		//Enter into and perform navigation methode
		driver.get("https://demowebshop.tricentis.com/");
		
		//geting url of current page
		String url=driver.getCurrentUrl();
		System.out.println("Current url : "+url);
		//Geting tititle of current webpage
		String title=driver.getTitle();
		System.out.println("Current Title : "+title);
		
		String src_Code=driver.getPageSource();
		System.out.println("Src Code : "+ src_Code);
		
		Thread.sleep(2000);
		
		driver.close();
		
}
}

