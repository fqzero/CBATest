package com.geelaro.web.CBATest.testcase;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.geelaro.web.CBATest.page.CbaHomePage;

/**
 * Unit test for simple yy.com/cba.
 */
public class CbaTest {

    private WebDriver driver;
    private WebDriverWait wait;

    private static Logger logger = LogManager.getLogger(CbaTest.class);
    private final static String CBA_URL = "http://www.yy.com/cba";

    private CbaHomePage cbaHomePage = new CbaHomePage();

    @BeforeSuite
    public void Setup() {

	System.setProperty("webdriver.chrome.driver", "D:\\Users\\webdriver\\chromedriver.exe");
	// 实例
	driver = new ChromeDriver();
	// 等待时间
	wait = new WebDriverWait(driver, 10, 1);
	//
	System.out.println("开始测试");
	logger.info("Setup...");
    }

    @Test()
    public void login() throws InterruptedException {
	driver.get(CBA_URL);
	Thread.sleep(2000);
	try {

	    driver.findElement(CbaHomePage.byLogin).click();
	    Thread.sleep(1000);
	} catch (Exception e) {
	    // TODO: handle exception
	    System.out.println("查找id错误");
	}
    }

    @AfterSuite
    public void tearDown() {
	System.out.println("测试结束");
	logger.info("tearDown...");
	driver.quit();
    }
}
