import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class GoogleClass extends WebDriverClass{

    private String urlSite = "https://www.google.com/";

    @Test
    public void searchCat() {
        driver.get(urlSite);
        setTextByLocator("//input[@name='q']", "cat\n");
        List<WebElement> webElementList = getListElementByLocator("//*[@jsname='TeSSVd']/td/a");
        Assert.assertEquals(isEmptyListElements(webElementList),true);
    }

    @Test
    public void searchDog() {
        driver.get(urlSite);
        setTextByLocator("//input[@name='q']", "dog\n");
        List<WebElement> webElementList = getListElementByLocator("//*[@jsname='TeSSVd']/td/a");
        Assert.assertEquals(isEmptyListElements(webElementList),true);
    }

    @Test
    public void searchDuck() {
        driver.get(urlSite);
        setTextByLocator("//input[@name='q']", "duck\n");
        List<WebElement> webElementList = getListElementByLocator("//*[@jsname='TeSSVd']/td/a");
        Assert.assertEquals(isEmptyListElements(webElementList),true);
    }

    @Test
    public void searchElephant() {
        driver.get(urlSite);
        setTextByLocator("//input[@name='q']", "elephant\n");
        List<WebElement> webElementList = getListElementByLocator("//*[@jsname='TeSSVd']/td/a");
        Assert.assertEquals(isEmptyListElements(webElementList),true);
    }

    @Test
    public void searchMouse() {
        driver.get(urlSite);
        setTextByLocator("//input[@name='q']", "mouse\n");
        List<WebElement> webElementList = getListElementByLocator("//*[@jsname='TeSSVd']/td/a");
        Assert.assertEquals(isEmptyListElements(webElementList),true);
    }

    @Test
    public void searchOrange() {
        driver.get(urlSite);
        setTextByLocator("//input[@name='q']", "orange\n");
        List<WebElement> webElementList = getListElementByLocator("//*[@jsname='TeSSVd']/td/a");
        Assert.assertEquals(isEmptyListElements(webElementList),true);
    }

    @Test
    public void searchCode() {
        driver.get(urlSite);
        setTextByLocator("//input[@name='q']", "code\n");
        List<WebElement> webElementList = getListElementByLocator("//*[@jsname='TeSSVd']/td/a");
        Assert.assertEquals(isEmptyListElements(webElementList),true);
    }

    @Test
    public void searchCake() {
        driver.get(urlSite);
        setTextByLocator("//input[@name='q']", "cake\n");
        List<WebElement> webElementList = getListElementByLocator("//*[@jsname='TeSSVd']/td/a");
        Assert.assertEquals(isEmptyListElements(webElementList),true);
    }

    @Test
    public void searchPeople() {
        driver.get(urlSite);
        setTextByLocator("//input[@name='q']", "people\n");
        List<WebElement> webElementList = getListElementByLocator("//*[@jsname='TeSSVd']/td/a");
        Assert.assertEquals(isEmptyListElements(webElementList),true);
    }

    @Test
    public void searchRock() {
        driver.get(urlSite);
        setTextByLocator("//input[@name='q']", "rock\n");
        List<WebElement> webElementList = getListElementByLocator("//*[@jsname='TeSSVd']/td/a");
        Assert.assertEquals(isEmptyListElements(webElementList),true);
    }

}
