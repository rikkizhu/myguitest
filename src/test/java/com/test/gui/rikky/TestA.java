package com.test.gui.rikky;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @program: com.test.gui.rikky.TestA
 * @description:
 * @author: zhuruiqi
 * @create: 2022-07-05 23:15
 **/
public class TestA {
    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","Users/zhuruiqi/Documents/code_repo/chromedriver");
    }

    @Test
    public void test1() {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.navigate().to("https://weather.cma.cn/web/weather/58367.html");
        String title = chromeDriver.getTitle();
        assert(title.contains("气象局"));
        chromeDriver.quit();
    }

    @Test
    public void test2() {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.navigate().to("https://weather.cma.cn/web/weather/58367.html");
        String title = chromeDriver.getTitle();
        assert(title.contains("中国"));
        chromeDriver.quit();
    }





}
