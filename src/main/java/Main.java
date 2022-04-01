import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.avito.ru/smolensk/avtomobili");

        WebElement link = driver.findElement(By.xpath("//a[text()='Личные вещи'][1]"));
        String par = link.getAttribute("href");

        System.out.println(par);


    }
}
