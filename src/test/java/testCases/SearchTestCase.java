package testCases;

import TestCaseFunction.SearchTestFunction;
import listener.Listener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.BaseTest;


@Listeners ({Listener.class})
public class SearchTestCase extends BaseTest {

//    WebDriver driver;
    @Test
    public void searchTest () throws InterruptedException {
        SearchTestFunction searchTestCase = new SearchTestFunction(driver);
        searchTestCase.searchTest();
    }
}
