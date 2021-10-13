import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path to driver"); //path to driver change to yours
        WebDriver driver = new ChromeDriver();

        driver.get("website"); //input your website
        driver.manage().window().maximize(); //browser to fullscreen

        WebElement varToClick = driver.findElement(By.xpath("//div[@class='class]//button[@id='id']")); //change to your xPath
        varToClick.click(); //click on element

        WebElement varToInput = driver.findElement(By.xpath("//div[@class='class]//button[@id='id']")); //change to your xPath
        varToInput.sendKeys("value to input"); //send value to input field

        WebElement varClickNWait = (new WebDriverWait(driver, Duration.ofSeconds(5))) //duration to wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='class]//button[@id='id']"))); //change to your xPath
        varClickNWait.click(); //click on element after wait

        driver.quit(); //exit from browser
    }

}
