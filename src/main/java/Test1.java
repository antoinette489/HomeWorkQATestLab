import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", Test1.class.getResource("chromedriver.exe").getPath());
        WebDriver driverChrome = new ChromeDriver();
        driverChrome.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement emailField = driverChrome.findElement(By.id("email"));
        emailField.sendKeys("webinar.test@gmail.com");
        Thread.sleep(1000);
        WebElement passwField = driverChrome.findElement(By.id("passwd"));
        passwField.sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement signInButton = driverChrome.findElement(By.name("submitLogin"));
        signInButton.click();
        Thread.sleep(2000);
        WebElement accountButton = driverChrome.findElement(By.className("employee_avatar_small"));
        accountButton.click();
        WebElement exitButton = driverChrome.findElement(By.id("header_logout"));
        exitButton.click();
    }
}
