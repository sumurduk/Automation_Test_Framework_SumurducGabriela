import Managers.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class TestRunner {
    public static void main(String[] args) {
        WebDriverManager webDriverManager=new WebDriverManager( "CHROME");
        webDriverManager.getDriver().get("https://www.google.com/?client=safari");

    }
}
