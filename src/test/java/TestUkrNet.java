import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestUkrNet extends ChomeClass {

    String siteUrl = "https://www.ukr.net/";

    @Test
    public void testLogin(){
        initWebDriver();
        driver.get(siteUrl);
        openFullScreen();
        setTimeOut(2);
        WebElement frameLogin = driver.findElement(By.xpath("//iframe[@name='mail widget']"));
        //відчиняемо фрейм
        driver.switchTo().frame(frameLogin);
        driver.findElement(By.xpath("//input[@id='id-input-login']")).sendKeys("asd@gmail.com");
        driver.findElement(By.xpath("//input[@id='id-input-password']")).sendKeys("P@ssw0rd");
        //вертаємось на основну сторінку
        driver.switchTo().defaultContent();
    }

    @Test
    public void OpenTab(){
        initWebDriver();
        driver.get(siteUrl);
        WebElement frameLogin = driver.findElement(By.xpath("//iframe[@name='mail widget']"));
        driver.switchTo().frame(frameLogin);
        driver.findElement(By.xpath("//a[@class='form__link form__link_recovery']")).click();
        //переходим на першу вкладку
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
    }

    @Test
    public void selection() {
        initWebDriver();
        driver.get("https://rozetka.com.ua/");
        setTimeOut(10);
        driver.navigate().refresh();
//
//        WebElement selectionList = driver.findElement(By.xpath("//select[@class='chosen-select']"));
//        Select selectObject = new Select(selectionList);
//        List<WebElement> allSelectedOptions = selectObject.getAllSelectedOptions();
//
//        for (WebElement option : allSelectedOptions){
//            System.out.println(option.getText());
//        }
    }

    @Test
    public void js(){
        initWebDriver();
        driver.get("https://rozetka.com.ua/");
        runScript("alert('fjhfjhjh')");
    }

}
