package Managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {
    public WebDriverManager(String webDriverType) {
        this.WebDriverType = WebDriverType;
    }
    private WebDriver driver;
    private String WebDriverType;
    private WebDriver createDriver(){
        switch (WebDriverType){
            case"CHROME":
                System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver");
                driver=new ChromeDriver();
                break;
            case"FIREFOX":
                System.setProperty("webdriver.gecko.driver","src/main/resources/Drivers/geckodriver");
                driver=new FirefoxDriver();
                break;
            default:
                System.out.println("Optiunea de web driver indicata nu este valabila!");
        }
        return driver;

    }

    public WebDriver getDriver() {
        if (driver==null){
            createDriver();
        }
        return driver;
    }
public void closeDriver(){
        if (driver != null){
            driver.close();
            System.out.println("Driverul a fost inchis!");
        }
}
}
