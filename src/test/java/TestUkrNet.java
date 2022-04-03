import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class TestUkrNet extends WebDriverClass {

    String siteUrl = "https://www.ukr.net/";

    @Test
    public void testLogin(){

        driver.get(siteUrl);
        openFullScreen();

        waitElementByLocator("//iframe[@name='mail widget']", 10);

        WebElement frameLogin = driver.findElement(By.xpath("//iframe[@name='mail widget']"));

        //відчиняемо фрейм
        driver.switchTo().frame(frameLogin);
        setTextByLocator("//input[@id='id-input-login']", "asd@gmail.com");
        setTextByLocator("//input[@id='id-input-password']", "P@ssw0rd");

        //вертаємось на основну сторінку
        driver.switchTo().defaultContent();
    }

    @Test
    public void OpenTab(){
        driver.get(siteUrl);
        WebElement frameLogin = driver.findElement(By.xpath("//iframe[@name='mail widget']"));
        driver.switchTo().frame(frameLogin);
        clickByLocator("//a[@class='form__link form__link_recovery']");
        //переходим на першу вкладку
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
    }

    @Test
    public void selection() {
        driver.get("https://rozetka.com.ua/");
        setTimeOut(10);
        refreshTab();

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
        driver.get("https://rozetka.com.ua/");
        runScript("alert('fjhfjhjh')");
    }

}
