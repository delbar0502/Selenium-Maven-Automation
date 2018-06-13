package com.weborder;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class Order {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\delia\\Documents\\selenium dependencies\\drivers\\chromedriver.exe ");
	WebDriver driver = new ChromeDriver();
	driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
	driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
	driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
	driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	driver.findElement(By.linkText("Order")).click();
	Random rn=new Random();	
	int t=rn.nextInt(101);
	String str= String.valueOf(t);
	driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).sendKeys(str);
	RandomString s=new RandomString();
	String str2=s.nextString();
	driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName")).sendKeys("John" +str2 + "Smith");
	driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2")).sendKeys("123 any St");
	driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3")).sendKeys("Anytown");
	driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4")).sendKeys("Chicago");
	Random rn2 = new Random();
    int min= 10000;
    int max = 99999;
    int t2 = rn2.nextInt(max-min)+min;
    String str3 = String.valueOf(t2);
	driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox5")).sendKeys(str3);
		
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$cardList")).click();
		Random rn3 = new Random();
        int t3 = rn2.nextInt(3);
        String str4 = String.valueOf(t3);
       
        Random rt3 = new Random();
        String cardNumbers ="";

        switch (t3) {
        case 0:
          cardNumbers = String.valueOf(4);
          for(int i = 0; i<15; i++) {
             int s1 = rt3.nextInt(10);
              cardNumbers +=String.valueOf(s1);          
          }   
          break;
        case 1:
          cardNumbers = String.valueOf(5);
          for(int i = 0; i<15; i++) {
            int s1 = rt3.nextInt(10);
              cardNumbers +=String.valueOf(s1);          
         }   
          break;
        case 2:
          cardNumbers = String.valueOf(3);
          for(int i = 0; i<14; i++) {
            int s1 = rt3.nextInt(10);
              cardNumbers +=String.valueOf(s1);          
         }   
          break;
        } 
        driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).
        sendKeys(cardNumbers);
      
	driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).sendKeys("05/02");
      driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();

	String expected = "New order has been successfully added.";

	String actual = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder\"]/tbody/tr/td/div/strong"))
			.getText();

	if(expected.equals(actual)) {
		System.out.println("Expected result matches the actual result.");
	}else {
		System.out.println("Expected result does not match the actual result.");

}
 
        }
}