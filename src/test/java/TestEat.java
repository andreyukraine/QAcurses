import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestEat extends ChomeClass {

    private String siteUrl = "https://qa2.eatstreet.com";

    @Test
    public void openSign(){
        initWebDriver();
        driver.get(siteUrl + "/signin");
        driver.findElement(By.xpath("//*[@id=\"menu-signin\"]")).click();
        driver.quit();
    }

    @Test
    public void openRegister(){
        initWebDriver();
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
        initWebDriver();
        driver.get(siteUrl + "/tempe-az/restaurants/munch-a-lunch/options/6369413");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String productName = driver.findElement(By.xpath("//div[@class='widget-header']/div/h2")).getText().toLowerCase();
        driver.findElement(By.xpath("//input[@id='91334404']")).click();
        driver.findElement(By.xpath("//a[@id='confirm-options']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(isProductByCart(productName));
    }


    public boolean isProductByCart(String name){

        List<WebElement> itemsList = driver.findElements(By.xpath("//tr[@class=\"ng-scope\"]"));

        if (itemsList.size() < 1){
            System.out.println("Elements not find");
            return false;
        }

        for(WebElement item : itemsList) {
            String productNameByCart = item.findElement(By.xpath("//td[@class=\"ng-scope\"]")).getText().toLowerCase();
            return name.equals(productNameByCart);
        }

        return false;
    }

}
