package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Gurkan\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }

}
