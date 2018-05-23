package com.geelaro.web.CBATest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CbaHomePage {
    // 登录
    @FindBy(xpath = "//*[@id=\"wHeadInfo\"]/div/a[1]")
    public WebElement login;
    
    public static By byLogin = By.xpath("//*[@id=\"wHeadInfo\"]/div/a[1]");
    // 注册
    @FindBy(xpath = "//*[@id='wHeadInfo']/div/a[2]")
    public WebElement signIn;
    public static By bySignIn = By.xpath("//*[@id='wHeadInfo']/div/a[2]");
    // 球队人气
    @FindBy(xpath = "/html/body/div[3]/div/ul/li[1]")
    public WebElement pop;
    public static By byPop = By.xpath("/html/body/div[3]/div/ul/li[1]");
    // 赛程赛果
    @FindBy(xpath = "/html/body/div[3]/div/ul/li[2]")
    public WebElement schedule;
    public static By bySchedule = By.xpath("/html/body/div[3]/div/ul/li[2]");

}
