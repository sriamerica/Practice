package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbcTest {

	@Test
	public void abcTest() throws InterruptedException{
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		//maximize the window
		driver.manage().window().maximize();
	
		//driver.get(null);
		driver.quit();
	}
}
	@Test
	public void hello()
	{
		System.out.println();
		System.out.println();
		
		System.out.println("Hello globe");
		System.out.println("Hello Basavanagudi");
		System.out.println("Hello Mysore");
		
		System.out.println();
		System.out.println();
	}
	
	@Test
	public void hello1()
	{
		System.out.println();
		System.out.println();

		System.out.println("Hello India ");
		System.out.println("Hi Karnataka");
		System.out.println("Hi Coorg");
		System.out.println();
	}


}
