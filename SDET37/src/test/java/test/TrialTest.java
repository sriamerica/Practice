package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TrialTest {
	@Test
	public void abcTest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//enter the url
		String url=System.getProperty("URL");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(url);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		driver.get(url);
		Thread.sleep(2000);
		//maximize the window
		driver.manage().window().maximize();
		driver.quit();
	}
	
	public void hello()
	{
		String password = System.getProperty("PASSWORD");
		System.out.println(password);
		System.out.println("Hello World");
	}

	@Test
	public void hello1()
	{
		System.out.println("Hello1 World");
	}
}