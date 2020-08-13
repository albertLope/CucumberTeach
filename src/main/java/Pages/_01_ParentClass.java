package Pages;

import Utilities.DriverClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class _01_ParentClass {

    private WebDriver driver;
    WebDriverWait wait;

    public _01_ParentClass(){

        driver= DriverClass.getDriver();
        wait = new WebDriverWait(driver,10);

    }

    public void clickFunction(WebElement elementToClick){
        waitUntilClickable(elementToClick);
        System.out.println(elementToClick.getText());
        scrollToElement(elementToClick);
        elementToClick.click();
    }

    public void sendKeysFunction(WebElement sendKeyElement , String value){
        waitUntilVisibility(sendKeyElement);
        scrollToElement(sendKeyElement);
        sendKeyElement.clear();
        sendKeyElement.sendKeys(value);
    }

    public void waitUntilVisibility(WebElement element){

        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void waitUntilClickable(WebElement element){

        wait.until(ExpectedConditions.elementToBeClickable(element));

    }


    public void verifyElementContainsText(WebElement element , String text){

        waitUntilVisibility(element);
        Assert.assertTrue(element.getText().contains(text) , "element text is " + element.getText());

    }

    public void clickOnButtonAccordingToName(List<WebElement> listname , List<WebElement> Button , String expectedName){

        System.out.println(listname + "<<<<<<<<<<<<<<<<<---------------");

        for(int i = 0 ; i <listname.size() ; i++){

            System.out.println(listname.get(i).getText()+ " in the for loop ");
            if(listname.get(i).getText().equals(expectedName)){
                Button.get(i).click();
                break;
            }

        }

    }

    public void scrollToElement(WebElement elementToScroll){
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", elementToScroll);
    }

    public void clickOnElementFromTheList(List<WebElement> listOfElements , String text){

        for (WebElement eachElement : listOfElements){

            if(eachElement.getText().equalsIgnoreCase(text)){

                eachElement.click();
                break;

            }
        }

    }

    public void scrollToLastElement(WebElement Element){

        JavascriptExecutor js = (JavascriptExecutor) driver;


        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }


}
