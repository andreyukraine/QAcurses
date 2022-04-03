import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.List;

public class WebDriverClass {

    public WebDriver driver;

    public void initDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void openFullScreen(){
        driver.manage().window().maximize();
    }

    public void setTimeOut(int second){
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeTest
    public void beforeRun(){
        initDriver();
    }

    @AfterTest
    public void afterRun(){
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.quit();
    }

    public void setTextByLocator(String locator, String text){
        driver.findElement(By.xpath(locator)).sendKeys(text);
    }

    public void clickByLocator(String locator){
        driver.findElement(By.xpath(locator)).click();
    }

    public String getTextByLocator(String locator){
        return driver.findElement(By.xpath(locator)).getText();
    }

    public List<WebElement> getListElementByLocator(String locator) {
        return driver.findElements(By.xpath(locator));
    }

    public boolean isEmptyListElements(List<WebElement> list){
        if (list.size() > 0){
            return true;
        }else{
            return false;
        }
    }

    public void waitElementByLocatorByText(String locator, String text, int second){
        WebDriverWait waitInit = new WebDriverWait(driver, second);
        waitInit.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath(locator)), text));
    }

    public void waitElementByLocator(String locator, int second){
        WebDriverWait waitInit = new WebDriverWait(driver, second);
        waitInit.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    //перезагрузка сторінки
    public void refreshTab(){
        driver.navigate().refresh();
    }


    //відкрити посилання в новій вкладці
    //driver.execute_script("window.open('https://www.lambdatest.com', 'new tab')")

    //виконати скрипт
    public void runScript(String textScript){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(textScript);
    }


}
