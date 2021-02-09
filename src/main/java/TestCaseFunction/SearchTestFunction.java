package TestCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class SearchTestFunction extends BasePage {

    public SearchTestFunction(WebDriver driver) {
        super(driver);
    }

    public void searchTest() throws InterruptedException {


        sendKeys(By.cssSelector("input[name='q']"),"Karya");

        //element(By.cssSelector("input[name='q']")).sendKeys("karya");


    }
}
