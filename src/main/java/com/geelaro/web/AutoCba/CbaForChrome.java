package com.geelaro.web.AutoCba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CbaForChrome {

	public static void main(String[] args) {
		//路径
		System.setProperty("webdriver.chrome.driver", "D:\\LEE\\webdriver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		//
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.get("http://www.baidu.com");
		//
		System.out.println(driver.getTitle());
		//最大化
		driver.manage().window().maximize();
		
//		driver.findElement(By.id("kw")).sendKeys("selenum");
		//使用显示等待
		wait.until(new ExpectedCondition<WebElement>() {
			
			public WebElement apply(WebDriver driver){
				return driver.findElement(By.id("kw"));
			}
		}).sendKeys("se");
		//
		driver.findElement(By.id("su")).click();
		//
		
		driver.get("http://news.baidu.com");
		//go back
		driver.navigate().back();
		
		
//		driver.quit();
		
	}

}
