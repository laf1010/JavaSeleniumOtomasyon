package utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage {
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver driver;

//    public WebElement element(By obje){
//        WebElement willReturn = driver.findElement(obje);
//        driver.wait(ExpectedConditions.elementToBeClickable(willReturn));
//
//        try {
//            return driver.findElement(obje);
//        }catch (Exception e) {
//            System.out.println("Objeyi Bulurken Hata ile Karşıalştım!");
//        }
//        return null;
//
//    }


    public void sendKeys(By by, String text) throws InterruptedException {
        WebElement element = null;
        String elemText = "";
        try {
            element = findElement(by);
            if (element.isEnabled()) {
                elemText = element.getText();
                element.sendKeys(text);
                System.out.println("Text: '"+text + "' filled to Field: "+elemText );
            }
        } catch (Exception e) {
            System.out.println("Objeyi Bulurken Hata ile Karşıalştım!");

            throw new RuntimeException(e);
        }
    }

    public WebElement findElement(By by, int... index) throws InterruptedException {

        WebElement element = null;

        try {
            if (index.length == 0)
                element = driver.findElement(by);
            else
                element = driver.findElements(by).get(index[0]);


        } catch (Exception e) {
            System.out.println("Objeyi Bulurken Hata ile Karşıalştım!");
            throw new RuntimeException(e);
        }
        return element;
    }

}
