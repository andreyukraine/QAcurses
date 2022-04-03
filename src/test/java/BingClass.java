import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class BingClass extends WebDriverClass {

    private String urlSite = "https://www.bing.com/";

    @Test
    public void searchCat() {
        driver.get(urlSite);
        setTextByLocator("//input[@id='sb_form_q']", "cat\n");
        List<WebElement> webElementList = getListElementByLocator("//*[@id='b_results']/li/nav/ul/li");
        Assert.assertEquals(isEmptyListElements(webElementList),true);
    }

    @Test
    public void searchDog() {
        driver.get(urlSite);
        setTextByLocator("//input[@id='sb_form_q']", "dog\n");
        List<WebElement> webElementList = getListElementByLocator("//*[@id='b_results']/li/nav/ul/li");
        Assert.assertEquals(isEmptyListElements(webElementList),true);
    }

    @Test
    public void searchDuck() {
        driver.get(urlSite);
        setTextByLocator("//input[@id='sb_form_q']", "duck\n");
        List<WebElement> webElementList = getListElementByLocator("//*[@id='b_results']/li/nav/ul/li");
        Assert.assertEquals(isEmptyListElements(webElementList),true);
    }

    @Test
    public void searchElephant() {
        driver.get(urlSite);
        setTextByLocator("//input[@id='sb_form_q']", "duck\n");
        List<WebElement> webElementList = getListElementByLocator("//*[@id='b_results']/li/nav/ul/li");
        Assert.assertEquals(isEmptyListElements(webElementList),true);
    }

    @Test
    public void searchMouse() {
        driver.get(urlSite);
        setTextByLocator("//input[@id='sb_form_q']", "mouse\n");
        List<WebElement> webElementList = getListElementByLocator("//*[@id='b_results']/li/nav/ul/li");
        Assert.assertEquals(isEmptyListElements(webElementList),true);
    }

    @Test
    public void searchOrange() {
        driver.get(urlSite);
        setTextByLocator("//input[@id='sb_form_q']", "orange\n");
        List<WebElement> webElementList = getListElementByLocator("//*[@id='b_results']/li/nav/ul/li");
        Assert.assertEquals(isEmptyListElements(webElementList),true);
    }

    @Test
    public void searchCode() {
        driver.get(urlSite);
        setTextByLocator("//input[@id='sb_form_q']", "code\n");
        List<WebElement> webElementList = getListElementByLocator("//*[@id='b_results']/li/nav/ul/li");
        Assert.assertEquals(isEmptyListElements(webElementList),true);
    }

    @Test
    public void searchCake() {
        driver.get(urlSite);
        setTextByLocator("//input[@id='sb_form_q']", "cake\n");
        List<WebElement> webElementList = getListElementByLocator("//*[@id='b_results']/li/nav/ul/li");
        Assert.assertEquals(isEmptyListElements(webElementList),true);
    }

    @Test
    public void searchPeople() {
        driver.get(urlSite);
        setTextByLocator("//input[@id='sb_form_q']", "people\n");
        List<WebElement> webElementList = getListElementByLocator("//*[@id='b_results']/li/nav/ul/li");
        Assert.assertEquals(isEmptyListElements(webElementList),true);
    }

    @Test
    public void searchRock() {
        driver.get(urlSite);
        setTextByLocator("//input[@id='sb_form_q']", "rock\n");
        List<WebElement> webElementList = getListElementByLocator("//*[@id='b_results']/li/nav/ul/li");
        Assert.assertEquals(isEmptyListElements(webElementList),true);
    }
}
