package com.geelaro.web.CBATest;

import java.awt.image.ImagingOpException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Unit test for simple yy.com/cba.
 */
public class CbaTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeSuite
    public void Setup() {

	System.setProperty("webdriver.chrome.driver", "D:\\LEE\\webdriver\\chromedriver.exe");
	// 实例
	driver = new ChromeDriver();
	// 等待时间
	wait = new WebDriverWait(driver, 10, 1);
	//
	System.out.println("开始测试");
    }

    /** -使用id查找- **/
    @Test(enabled = false)
    public void openBaiduById() throws InterruptedException {
	System.out.println("ID查找");
	// 打开baidu
	driver.get("http://www.baidu.com");
	// 窗口最大化
	driver.manage().window().maximize();
	//
	System.out.println(driver.getTitle());
	// 输入selenium
	driver.findElement(By.id("kw")).sendKeys("selenium");
	// 点击搜索
	driver.findElement(By.id("su")).click();
	//
	Thread.sleep(2000);
	//
	driver.close();

    }
    @Test(enabled=false)
    public void openBaiduByName() throws Exception {
	System.out.println("ByName查找");
	// 打开baidu
	driver.get("http://www.baidu.com");
	// 窗口最大化
	driver.manage().window().maximize();
	//
	System.out.println(driver.getTitle());
	// 输入selenium
	driver.findElement(By.name("wd")).sendKeys("selenium");
	// 点击搜索
	driver.findElement(By.id("su")).click();
	//
	Thread.sleep(2000);
	//
    }
    @Test(enabled=false)
    public void openBaiduByClass() {
	System.out.println("ByClass查找");
	// 打开baidu
	driver.get("http://www.baidu.com");
	// 窗口最大化
	driver.manage().window().maximize();
	//
	System.out.println(driver.getTitle());
	// 输入selenium
	
	driver.findElement(By.className("s_ipt")).sendKeys("selenium");
	//
	driver.findElement(By.className("btn self-btn bg s_btn")).click();
    }
    
    @Test
    public void openBiaduByLinkText() throws InterruptedException{
	System.out.println("ByLinkText查找");
	// 打开baidu
	driver.get("http://www.baidu.com");
	// 窗口最大化
	driver.manage().window().maximize();

	// 输入selenium
	
//	driver.findElement(By.linkText("新闻")).click();
	
//	driver.findElement(By.linkText("贴吧")).click();
	
//	driver.findElement(By.partialLinkText("百度新闻客户端")).click();

//	driver.findElement(By.xpath("//input[@id='kw']")).sendKeys("see");
	
	//
	driver.findElement(By.xpath("//form[@id='form']/span/input")).sendKeys("ssee");
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	Thread.sleep(2000);
    }
    
    @AfterSuite
    public void tearDown() {
	System.out.println("测试结束");
	driver.quit();
    }
}
