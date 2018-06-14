package com.dice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Job;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DicejobPartTwo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*
		 * )Create arraylist of keywords. add 20 different keyworks list.add("java");
		 * 
		 * pass each item to search box and print accordingly. modify your arraylist
		 * 
		 * java-1234
		 * 
		 * 2) Store all keywords into a text file read the text file and repeat above
		 * steps.
		 * 
		 * store keyword and results count into an arraylist. ----
		 * 
		 * after closing browser. print contents of arraylist that was updated each time
		 * we looped.
		 * 
		 * commit > push > share your github link
		 */
		   
		
		 List<String> l = new ArrayList<>();
			l.add("Application Developer");
			l.add("Application Support Analyst");
			l.add("Project Manager");
			l.add("Test Engineer");
			l.add("Senior Software Engineer");
			l.add("Junior Developer");
			l.add("Marketing Manage");
			l.add("Cloud System Engineer");
			l.add("Computer and Information Research Scientist");
			l.add("Computer Network Architect");
			l.add("Computer Programmer");
			l.add("Test Engineer");
			l.add("Selenium Automation Engineer");
			l.add("Customer Support Administrator");
			l.add("Selenium Mobile Web service Tester");
			l.add("Data Quality Manager");
			l.add("Java Developer");
			l.add("Junior Software Engineer");
			l.add("NET Developer");
			l.add("Business Analyst Project Manager");
		 

			List<String> newList = new ArrayList<>();

			for (int i = 0; i < l.size(); i++) {
				String url = "https://www.dice.com";
				driver.get(url);

				driver.findElement(By.id("search-field-keyword")).clear();
				driver.findElement(By.id("search-field-keyword")).sendKeys(l.get(i));

				String location = "San Francisco, CA";
				driver.findElement(By.id("search-field-location")).clear();
				driver.findElement(By.id("search-field-location")).sendKeys(location);

				driver.findElement(By.cssSelector("#findTechJobs")).click();

				 WebElement  webElement= driver.findElement(By.id("posiCountId"));
				  System.out.println("Have   "+webElement.getText()+"   result");
			}

			System.out.println();
			System.out.println(newList);
			
			  
			  driver.close();
			  System.out.println("Test Completed  : " + LocalDateTime.now());
		
	}

}
