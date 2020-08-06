package Pages;

import Utilities.DriverClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class ReleaseNotes extends _01_ParentClass{

    private WebDriver driver ;

    public ReleaseNotes(){

        driver = DriverClass.getDriver();
        PageFactory.initElements( driver , this );

    }

    @FindBy(xpath = "//li[@class='ng-star-inserted']")
    private List<WebElement> releaseNoteFromTheWebSite;

    public void checkReleaseNotes(List<String> elementName){

        scrollToLastElement(releaseNoteFromTheWebSite.get(releaseNoteFromTheWebSite.size()-1));

        System.out.println("element name all elements -->>> "+elementName);
        System.out.println(releaseNoteFromTheWebSite);
        System.out.println("element name all elements -->>> "+elementName.size());
        System.out.println(releaseNoteFromTheWebSite.size());

        for (int i = 0  ; i < releaseNoteFromTheWebSite.size(); i++){

            System.out.println("webSite "+releaseNoteFromTheWebSite.get(i).getText());
            System.out.println("Excel  "+elementName.get(i));


        }

        for (int i = 0  ; i < releaseNoteFromTheWebSite.size(); i++){

            System.out.println("releaseNoteFromTheWebSite each -->> "+releaseNoteFromTheWebSite.get(i).getText());
            System.out.println("Elemenet name each -->> "+elementName.get(i));


            Assert.assertEquals(releaseNoteFromTheWebSite.get(i).getText() , elementName.get(i));

        }

    }


}
