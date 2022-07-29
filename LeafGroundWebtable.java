package week3.day2.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundWebtable {

	/*
	 * /*
		 * URL - http://www.leafground.com/pages/table.html
		 * 
		 * 1) Set the property for chromedriver and initialize the driver
		 * 
		 * 2) launch the url
		 * 
		 * 3) Get the table and store it as a webelement
		 * 
		 * 4) Find the number of rows based on its tag name and store it in a list
		 * 
		 * 5) Find the number of cols based on its tag name and store it in a list
		 * 
		 * 6) Print the size of the rows
		 * 
		 * 7) Print the size of the cols
		 * 
		 * 8) Get the progress value of 'Learn to interact with Elements' and store it in a variable
		 * 
		 * 9) Print the text of the variable
		 * 
		 * 10) Find the vital task for the least completed progress and check the box
		 * 
		 * 
		 */
	 
	
	public static void main(String[] args) { 
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		WebElement findElementt = driver.findElement(By.xpath("//section[@class='innerblock']"));
		List<WebElement> findElements = driver.findElements(By.xpath("//tr/following::tr"));
		int rowsize=findElements.size();
		System.out.println(rowsize);
		List<WebElement> findElementcoloumn = driver.findElements(By.xpath("//tr[2]/td"));
		int colsize=findElementcoloumn.size();
		System.out.println(colsize);
		List<WebElement> findElementvalue = driver.findElements(By.xpath("//tr[@class='even']/td[2]"));
		List<Integer> listval = new ArrayList<Integer>();
		for (int i = 0; i < findElementvalue.size(); i++) {
			String text = findElementvalue.get(i).getText();
			text =text.replace("%", "");
			int parseint=Integer.parseInt(text);
			listval.add(parseint);
			
		}
		System.out.println(listval);
		
		List<WebElement> allprogressvalue = driver.findElements(By.xpath("//tr/td[2]"));
		Set<Integer> TS = new TreeSet<Integer>();
		
		for (int i = 0; i < allprogressvalue.size(); i++) {
			String text = allprogressvalue.get(i).getText();
			text =text.replace("%", "");
			int parseint=Integer.parseInt(text);
			TS.add(parseint);
			
		}
		List<Integer> listallprogress = new ArrayList<Integer>(TS);;
		System.out.println(listallprogress.get(0));
		String findxpath = "//tr//td//font[contains(text(),'"+listallprogress.get(0)+"')]//following::td[1]";
		driver.findElement(By.xpath(findxpath)).click();
		boolean enabled = driver.findElement(By.xpath(findxpath)).isEnabled();
		System.out.println(enabled);
		
	}

}
