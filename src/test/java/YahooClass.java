import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class YahooClass extends WebDriverClass{

    private String urlSite = "https://www.yahoo.com/";

    @Test
    public void searchCat() {
        driver.get(urlSite);
        setTextByLocator("//input[@id='ybar-sbq']", "cat\n");
        waitElementByLocator("//div[@class='pages']", 10);
        Assert.assertNotNull(driver.findElement(By.xpath("//div[@class='pages']")));
    }

    @Test
    public void searchDog() {
        driver.get(urlSite);
        setTextByLocator("//input[@id='ybar-sbq']", "dog\n");
        waitElementByLocator("//div[@class='pages']", 10);
        Assert.assertNotNull(driver.findElement(By.xpath("//div[@class='pages']")));
    }

    @Test
    public void searchDuck() {
        driver.get(urlSite);
        setTextByLocator("//input[@id='ybar-sbq']", "duck\n");
        waitElementByLocator("//div[@class='pages']", 10);
        Assert.assertNotNull(driver.findElement(By.xpath("//div[@class='pages']")));
    }

    @Test
    public void searchElephant() {
        driver.get(urlSite);
        setTextByLocator("//input[@id='ybar-sbq']", "elephant\n");
        waitElementByLocator("//div[@class='pages']", 10);
        Assert.assertNotNull(driver.findElement(By.xpath("//div[@class='pages']")));
    }

    @Test
    public void searchMouse() {
        driver.get(urlSite);
        setTextByLocator("//input[@id='ybar-sbq']", "mouse\n");
        waitElementByLocator("//div[@class='pages']", 10);
        Assert.assertNotNull(driver.findElement(By.xpath("//div[@class='pages']")));
    }

    @Test
    public void searchOrange() {
        driver.get(urlSite);
        setTextByLocator("//input[@id='ybar-sbq']", "orange\n");
        waitElementByLocator("//div[@class='pages']", 10);
        Assert.assertNotNull(driver.findElement(By.xpath("//div[@class='pages']")));
    }

    @Test
    public void searchCode() {
        driver.get(urlSite);
        setTextByLocator("//input[@id='ybar-sbq']", "code\n");
        waitElementByLocator("//div[@class='pages']", 10);
        Assert.assertNotNull(driver.findElement(By.xpath("//div[@class='pages']")));
    }

    @Test
    public void searchCake() {
        driver.get(urlSite);
        setTextByLocator("//input[@id='ybar-sbq']", "cake\n");
        waitElementByLocator("//div[@class='pages']", 10);
        Assert.assertNotNull(driver.findElement(By.xpath("//div[@class='pages']")));
    }

    @Test
    public void searchPeople() {
        driver.get(urlSite);
        setTextByLocator("//input[@id='ybar-sbq']", "people\n");
        waitElementByLocator("//div[@class='pages']", 10);
        Assert.assertNotNull(driver.findElement(By.xpath("//div[@class='pages']")));
    }

    @Test
    public void searchRock() {
        driver.get(urlSite);
        setTextByLocator("//input[@id='ybar-sbq']", "rock\n");
        waitElementByLocator("//div[@class='pages']", 10);
        Assert.assertNotNull(driver.findElement(By.xpath("//div[@class='pages']")));
    }

}
