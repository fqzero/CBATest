package com.geelaro.web.AutoCba;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	private WebDriver driver;
	private WebDriverWait wait;

	@BeforeMethod
	public void setUp() {
		// 路径
		System.setProperty("webdriver.chrome.driver", "D:\\LEE\\webdriver\\chromedriver.exe");

		driver = new ChromeDriver();
		//显示等待
		wait = new WebDriverWait(driver, 10, 1);
		System.out.println("开始测试");
	}

	@Test
	public void openBaidu() throws InterruptedException {
		driver.get("http://www.baidu.com");
		//
		System.out.println(driver.getTitle());
		// 最大化
		driver.manage().window().maximize();
		
		driver.findElement(By.id("kw")).sendKeys("selenum");
		// 使用显示等待
//		wait.until(new ExpectedCondition<WebElement>() {
//
//			public WebElement apply(WebDriver driver) {
//				return driver.findElement(By.id("kw"));
//			}
//		}).sendKeys("se");
		//
		driver.findElement(By.id("su")).click();
		//
		Thread.sleep(2000);
		String title=driver.getTitle();
		//
		System.out.println(title);
		
		assertEquals("selenium_百度搜索",title );
		
		//匹配第一页搜索结果的标题，并打印
		List<WebElement> search_results=driver.findElements(By.xpath("//div/div/h3"));
		System.out.println(search_results.size());
		
		for(WebElement w:search_results){
			System.out.println(w.getText());
		}
		
		//获取某一个结果
		System.out.println("----分隔线----");
		WebElement oneText=search_results.get(search_results.size()-10);
		System.out.println(oneText.getText());
	}
	
	@Test
	public void mailLogin() throws InterruptedException{
		driver.get("http:www.126.com");
		
		WebElement login=driver.findElement(By.xpath("//*[@id='loginDiv']/iframe"));
		driver.switchTo().frame(login);
		
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("username");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("yy123456");
		driver.findElement(By.id("dologin")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
		
		
		
		
	}
	
	@AfterMethod
	public void afterBaidu(){
		System.out.println("测试完成");
		driver.quit();
	}
	
	

}
