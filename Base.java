package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.Homepage;

public class Base {
     static protected WebDriver driver;
    static protected Homepage homepage;
    @BeforeClass
    public  static void setupBrowser() {
        System.setProperty("webdriver.chrome.driver", "C://Users//naresh.kumar//IdeaProjects//BBC//src//main//resource//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        webSite(driver);
       homepage= new Homepage(driver);
    }
    @BeforeMethod
    public static void webSite( WebDriver driver){

        driver.get("https://www.bbc.co.uk/");

        System.out.println(driver.manage().getCookies());
      /*  Cookie name = new Cookie("ckns_explicit lakshmi", "1");
        driver.manage().addCookie(name);
        driver.navigate().refresh();*/
    }

    public static void quitBrowser(){
        driver.close();
        System.out.println("close");
    }

}
