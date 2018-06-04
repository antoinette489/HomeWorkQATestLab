import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
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
        Thread.sleep(3000);


        WebElement dashboard = driverChrome.findElement(By.linkText("Dashboard"));
        dashboard.click();
        String dashboardName = driverChrome.findElement(By.linkText("Dashboard")).getText();
        System.out.println(dashboardName);
        driverChrome.navigate().refresh();
        String dashboardRef =  driverChrome.findElement(By.linkText("Dashboard")).getText();
        Thread.sleep(1000);
        if(dashboardName.equals(dashboardRef))
            System.out.println("User stays in the same section after refresh");
        else System.out.println("User doesn't stay in the same section after refresh");
        Thread.sleep(2000);

        WebElement orders = driverChrome.findElement(By.linkText("Заказы"));
        orders.click();
        String ordersName = driverChrome.findElement(By.linkText("Заказы")).getText();
        System.out.println(ordersName);
        driverChrome.navigate().refresh();
        String ordersRef =  driverChrome.findElement(By.linkText("Заказы")).getText();
        Thread.sleep(1000);
        if(ordersName.equals(ordersRef))
            System.out.println("User stays in the same section after refresh");
        else System.out.println("User doesn't stay in the same section after refresh");
        Thread.sleep(2000);

        WebElement catalog = driverChrome.findElement(By.linkText("Каталог"));
        catalog.click();
        String catalogName = driverChrome.findElement(By.linkText("Каталог")).getText();
        System.out.println(catalogName);
        driverChrome.navigate().refresh();
        String catalogRef =  driverChrome.findElement(By.linkText("Каталог")).getText();
        Thread.sleep(1000);
        if(catalogName.equals(catalogRef))
            System.out.println("User stays in the same section after refresh");
        else System.out.println("User doesn't stay in the same section after refresh");
        Thread.sleep(2000);

        WebElement customs = driverChrome.findElement(By.linkText("Клиенты"));
        customs.click();
        String customsName = driverChrome.findElement(By.linkText("Клиенты")).getText();
        System.out.println(customsName);
        driverChrome.navigate().refresh();
        String customsRef =  driverChrome.findElement(By.linkText("Клиенты")).getText();
        Thread.sleep(1000);
        if(customsName.equals(customsRef))
            System.out.println("User stays in the same section after refresh");
        else System.out.println("User doesn't stay in the same section after refresh");
        Thread.sleep(2000);

        WebElement supportService = driverChrome.findElement(By.linkText("Служба поддержки"));
        supportService.click();
        String suppServName = driverChrome.findElement(By.linkText("Служба поддержки")).getText();
        System.out.println(suppServName);
        driverChrome.navigate().refresh();
        String suppServRef =  driverChrome.findElement(By.linkText("Служба поддержки")).getText();
        Thread.sleep(1000);
        if(suppServName.equals(suppServRef))
            System.out.println("User stays in the same section after refresh");
        else System.out.println("User doesn't stay in the same section after refresh");
        Thread.sleep(2000);

        WebElement statistics = driverChrome.findElement(By.linkText("Статистика"));
        statistics.click();
        String statistName = driverChrome.findElement(By.linkText("Статистика")).getText();
        System.out.println(statistName);
        driverChrome.navigate().refresh();
        String statisRef =  driverChrome.findElement(By.linkText("Статистика")).getText();
        Thread.sleep(1000);
        if(statistName.equals(statisRef))
            System.out.println("User stays in the same section after refresh");
        else System.out.println("User doesn't stay in the same section after refresh");
        Thread.sleep(2000);

        WebElement modules = driverChrome.findElement(By.linkText("Modules"));
        modules.click();
        String modulesName = driverChrome.findElement(By.linkText("Modules")).getText();
        System.out.println(modulesName);
        driverChrome.navigate().refresh();
        String moduleRef =  driverChrome.findElement(By.linkText("Modules")).getText();
        Thread.sleep(1000);
        if(modulesName.equals(moduleRef))
            System.out.println("User stays in the same section after refresh");
        else System.out.println("User doesn't stay in the same section after refresh");
        Thread.sleep(2000);

        WebElement design = driverChrome.findElement(By.linkText("Design"));
        design.click();
        String designName = driverChrome.findElement(By.linkText("Design")).getText();
        System.out.println(designName);
        driverChrome.navigate().refresh();
        String designRef =  driverChrome.findElement(By.linkText("Design")).getText();
        Thread.sleep(1000);
        if(designName.equals(designRef))
            System.out.println("User stays in the same section after refresh");
        else System.out.println("User doesn't stay in the same section after refresh");
        Thread.sleep(2000);

        WebElement delivery = driverChrome.findElement(By.linkText("Доставка"));
        delivery.click();
        String deliveryName = driverChrome.findElement(By.linkText("Доставка")).getText();
        System.out.println(deliveryName);
        driverChrome.navigate().refresh();
        String deliveryRef =  driverChrome.findElement(By.linkText("Доставка")).getText();
        Thread.sleep(1000);
        if(deliveryName.equals(deliveryRef))
            System.out.println("User stays in the same section after refresh");
        else System.out.println("User doesn't stay in the same section after refresh");
        Thread.sleep(2000);

        WebElement paymentMeth = driverChrome.findElement(By.linkText("Способ оплаты"));
        paymentMeth.click();
        String payMethName = driverChrome.findElement(By.linkText("Способ оплаты")).getText();
        System.out.println(payMethName);
        driverChrome.navigate().refresh();
        String payMethRef =  driverChrome.findElement(By.linkText("Способ оплаты")).getText();
        Thread.sleep(1000);
        if(payMethName.equals(payMethRef))
            System.out.println("User stays in the same section after refresh");
        else System.out.println("User doesn't stay in the same section after refresh");
        Thread.sleep(2000);

        WebElement international = driverChrome.findElement(By.linkText("International"));
        international.click();
        String internName = driverChrome.findElement(By.linkText("International")).getText();
        System.out.println(internName);
        driverChrome.navigate().refresh();
        String internRef =  driverChrome.findElement(By.linkText("International")).getText();
        Thread.sleep(1000);
        if(internName.equals(internRef))
            System.out.println("User stays in the same section after refresh");
        else System.out.println("User doesn't stay in the same section after refresh");
        Thread.sleep(2000);

        WebElement shopParameters = driverChrome.findElement(By.linkText("Shop Parameters"));
        shopParameters.click();
        String shopParName = driverChrome.findElement(By.linkText("Shop Parameters")).getText();
        System.out.println(shopParName);
        driverChrome.navigate().refresh();
        String shopParRef =  driverChrome.findElement(By.linkText("Shop Parameters")).getText();
        Thread.sleep(1000);
        if(shopParName.equals(shopParRef))
            System.out.println("User stays in the same section after refresh");
        else System.out.println("User doesn't stay in the same section after refresh");
        Thread.sleep(2000);

        WebElement configur = driverChrome.findElement(By.linkText("Конфигурация"));
        configur.click();
        String configurName = driverChrome.findElement(By.linkText("Конфигурация")).getText();
        System.out.println(configurName);
        driverChrome.navigate().refresh();
        String configutRef =  driverChrome.findElement(By.linkText("Конфигурация")).getText();
        Thread.sleep(1000);
        if(configurName.equals(configutRef))
            System.out.println("User stays in the same section after refresh");
        else System.out.println("User doesn't stay in the same section after refresh");
        Thread.sleep(2000);
    }
}
