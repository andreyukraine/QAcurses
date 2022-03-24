import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.security.Timestamp;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestDemo {

    private WebDriver driver;
    private String siteUrl = "https://qa2.eatstreet.com";


    public void webDriverChrome() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void openSign(){
        webDriverChrome();
        driver.get(siteUrl + "/signin");
        driver.findElement(By.xpath("//*[@id=\"menu-signin\"]")).click();
        driver.quit();
    }

    @Test
    public void openRegister(){
        webDriverChrome();
        driver.get(siteUrl + "/create-account");
        String genName = System.currentTimeMillis() + "_andrey@gmail.com";

        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(genName);
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Zaqxsw123qaz");
        driver.findElement(By.xpath("//input[@id=\"passwordAgain\"]")).sendKeys("Zaqxsw123qaz");
        driver.findElement(By.xpath("//button[@id=\"signup\"]")).click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//a[@id=\"menu-my-account\"]"));
        driver.quit();
    }

    @Test
    public void addCart(){
        webDriverChrome();
        driver.get(siteUrl + "/tempe-az/restaurants/munch-a-lunch/options/6369413");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String productName = driver.findElement(By.xpath("//div[@class=\"widget-header\"]/div/h2")).getText();
        driver.findElement(By.xpath("//input[@id=\"91334404\"]")).click();
        driver.findElement(By.xpath("//a[@id=\"confirm-options\"]")).click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Assert.assertEquals(findProductByCart(productName),1);

    }

    public boolean findProductByCart(String name){
        List<WebElement> elementsxpath = driver.findElements(By.xpath("//tr[@class=\"ng-scope\"]"));
        for(int i=0; i < elementsxpath.size(); i++) {

            if (name.equals(elementsxpath.get(i).findElement(By.xpath("//td[@class=\"ng-scope\"]")).getText())){
                return true;
            }
            //System.out.println(elementsxpath.get(i).findElement(By.xpath("//td[@class=\"ng-scope\"]")).getText());
        }
        return false;
    }
}
