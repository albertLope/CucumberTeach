package Pages;

import Utilities.DriverClassCopy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class ReleaseNotes extends _01_ParentClass{

    private WebDriver driver ;

    public ReleaseNotes(){

        driver = DriverClassCopy.getDriver();
        PageFactory.initElements( driver , this );

    }

    @FindBy(xpath = "//li[@class='ng-star-inserted']")
    private List<WebElement> releaseNoteFromTheWebSite;

    public void checkReleaseNotes(List<String> elementName){

        scrollToLastElement(releaseNoteFromTheWebSite.get(releaseNoteFromTheWebSite.size()-1));

        for (int i = 0  ; i < releaseNoteFromTheWebSite.size(); i++){

            Assert.assertEquals(releaseNoteFromTheWebSite.get(i).getText() , elementName.get(i));

        }

    }


}
