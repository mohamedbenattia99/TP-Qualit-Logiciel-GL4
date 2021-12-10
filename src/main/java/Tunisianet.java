import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tunisianet {
    WebDriver driver;
    JavascriptExecutor js;

    public void initialiseDriver() throws  InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://www.tunisianet.com.tn/");
        Thread.sleep(2000);
        chrome.quit();
    }

    public static void main(String[] args) throws  InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tunisianet.com.tn/");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".nav-link > svg")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='_desktop_user_info']/ul/li/a/span")).click();
        Thread.sleep(2000);   
        driver.findElement(By.name("email")).sendKeys("mohamedbenattia99@gmail.com");
        driver.findElement(By.name("password")).sendKeys("11091999");
        Thread.sleep(1000);      
        driver.findElement(By.id("submit-login")).click();
        driver.findElement(By.id("search_query_top")).sendKeys("PC portable MacBook M1 13.3 ");
        driver.findElement(By.name("submit_search")).click();
        Thread.sleep(10000);
        driver.quit();
    }
}