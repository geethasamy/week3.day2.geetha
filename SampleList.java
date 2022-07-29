package week3.day2.Assignment;


import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleList {

/*
 * SAMPLE PROGRAM TO IMPLEMENT List :
=================================
 NOTE: Java code is attached for your reference.

1. Launch the URL https://www.ajio.com/
2. In the search box, type as "bags" and press enter
3. To the left  of the screen under " Gender" click the "Men"
4. Under "Category" click "Fashion Bags"
5. Print the count of the items Found. 
6. Get the list of brand of the products displayed in the page and print the list.
7. Get the list of names of the bags and print it	
 */
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		driver.findElement(By.xpath("//input[@id='Men']//following::label[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(1000);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		//System.out.println(text);
		String[] text1=text.split(" ");
		System.out.println(text1[0]);
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='brand']"));
		HashSet<String> hashet = new HashSet<String>();
		for (int i = 0; i < findElements.size(); i++) 
		{
			String value = findElements.get(i).getText();
			hashet.add(value);
			
		}
		////div[@class='nameCls']

		System.out.println("List of bags brand"+hashet);
		
		List<WebElement> findElementsbag = driver.findElements(By.xpath("//div[@class='nameCls']"));
		HashSet<String> hashetbag = new HashSet<String>();
		for (int i = 0; i < findElementsbag.size(); i++) 
		{
			String value = findElementsbag.get(i).getText();
			hashetbag.add(value);
			
		}
		System.out.println("List of bags"+hashetbag);
	}

}
