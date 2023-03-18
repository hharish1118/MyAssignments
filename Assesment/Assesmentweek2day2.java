package week3day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assesmentweek2day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Assignments week2.day2
		// Step 1: Download and set the path  
		
		// Step 2: Launch the Edge
		EdgeDriver driver= new EdgeDriver();

		// Step 3: Load the URL https://en-gb.facebook.com/ 
		driver.get("https://en-gb.facebook.com/ ");
		
		// Step 4: Maximise the window 
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait 

		// Step 6: Click on Create New Account button 
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		

		// Step 7: Enter the first name 
		driver.findElement(By.xpath("//div[text()='First name']")).sendKeys("Test");
		

		// Step 8: Enter the last name 
		driver.findElement(By.xpath("//div[text()='last	 name' ]")).sendKeys("automation");

		// Step 9: Enter the mobile number 
		driver.findElement(By.xpath("//div [@class= 'placeholder']")).sendKeys("1236549879");

		// Step 10: Enter the password 
		driver.findElement(By.xpath("//div [text()='New password']")).sendKeys("Password@123");

		// Step 11: Handle all the three drop downs 
		WebElement dropDob =driver.findElement(By.id("day"));
		
		
		
		

		// Step 12: Select the radio button "Female"  

		          //  ( A normal click will do for this step)  
		
		

	}

}
