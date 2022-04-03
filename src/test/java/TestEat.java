import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class TestEat extends WebDriverClass {

    private String siteUrl = "https://qa2.eatstreet.com";

    @Test
    public void openSign(){
        driver.get(siteUrl + "/signin");
        driver.findElement(By.xpath("//*[@id='menu-signin']")).click();
    }

    @Test
    public void openRegister(){
        driver.get(siteUrl + "/create-account");

        String genName = System.currentTimeMillis() + "_andrey@gmail.com";
        String passTest = "Zaqxsw123qaz";

        setTextByLocator("//input[@id='email']",genName);
        setTextByLocator("//input[@id='password']",passTest);
        setTextByLocator("//input[@id='passwordAgain']",passTest);

        clickByLocator("//button[@id='signup']");

        waitElementByLocator("//a[@id='menu-my-account']", 10);

        Assert.assertNotNull(driver.findElement(By.xpath("//a[@id='menu-my-account']")));
    }

    @Test
    public void addCart(){
        driver.get(siteUrl + "/tempe-az/restaurants/munch-a-lunch/options/6369413");

        waitElementByLocator("//div[@class='widget-header']/div/h2", 10);

        String productName = getTextByLocator("//div[@class='widget-header']/div/h2").toLowerCase();

        clickByLocator("//input[@id='91334404']");
        clickByLocator("//a[@id='confirm-options']");

        waitElementByLocator("//tr[@class='ng-scope']", 10);

        Assert.assertTrue(isProductByCart(productName));
    }


    public boolean isProductByCart(String name){
        List<WebElement> itemsList = getListElementByLocator("//tr[@class='ng-scope']");
        if (isEmptyListElements(itemsList)) {
            for (WebElement item : itemsList) {
                String productNameByCart = item.findElement(By.xpath("//td[@class='ng-scope']")).getText().toLowerCase();
                return name.equals(productNameByCart);
            }
        }
        return false;
    }

}
