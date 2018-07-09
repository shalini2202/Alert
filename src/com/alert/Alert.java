package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\a631020\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.popuptest.com/popuptest2.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		//driver.quit();
		System.exit(0);
		
		/*driver.get("http://jsbin.com/usidix/1");
		driver.findElement(By.xpath("//input[@onclick='showAlert()']")).click();
		String alertMsg = driver.switchTo().alert().getText();
		Thread.sleep(5000);
		System.out.println(alertMsg);
		//driver.switchTo().alert().accept();
		driver.close();*/
	}

}
