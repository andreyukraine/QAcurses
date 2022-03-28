import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChomeClass{

    public WebDriver driver;

    public void initWebDriver() {
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
