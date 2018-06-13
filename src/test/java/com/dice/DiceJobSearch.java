package com.dice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DiceJobSearch {

	public static void main(String[] args) {
	         
     WebDriverManager.chromedriver().setup();
//set up chrome path.
     
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\delia\\Documents\\selenium dependencies\\drivers\\chromedriver.exe ");
		//String url="https://www.dice.com/";
     //nevegetive to ,
     WebDriver driver = new ChromeDriver();
		driver.get("https://www.dice.com/");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Job Search for Technology Professionals | Dice.com";
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Step PASS. Dice homepage successfully loaded");
		} else {
			System.out.println("Step PASS. Dice homepage did not load successfully");
			throw new RuntimeException("Step PASS. Dice homepage did not load successfully");
		}
		//FULLSRREEN.
		driver.manage().window().maximize();
		//Set iniversal wait time in case web page is slow 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	String keyword="elenium Automation Engineer";
		driver.findElement(By.id("search-field-keyword")).sendKeys("Selenium Automation Engineer");
		driver.findElement(By.id("search-field-location")).clear();
		driver.findElement(By.id("search-field-location")).sendKeys("Chicago,IL");
		driver.findElement(By.id("findTechJobs")).click();
		
		
		
		//you can also use submit.
	  WebElement  webElement= driver.findElement(By.id("posiCountId"));
	  System.out.println("Have "+webElement.getText()+"result");
	  
	  
	  driver.close();
	  
	}

}
