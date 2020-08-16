package Pages;

import Utilities.DriverClassCopy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class CountryPage extends _01_ParentClass {

    private WebDriver driver ;

//    https://www.softwaretestinghelp.com/page-object-model-pom-with-pagefactory/#:~:text=The%20initElements%20is%20a%20static,java.lang.Class%20pageObjectClass)
    public CountryPage(){

        driver = DriverClassCopy.getDriver();
        PageFactory.initElements( driver , this );

    }

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath="//ms-text-field[@formcontrolname='code']/input")
    private WebElement codeInput;

    @FindBy(xpath="//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'success')]")
    private WebElement successMessage;

    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement ErrorMessage;

    @FindBy(xpath="//ms-add-button//button")
    private WebElement addButton;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement YesButton;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement shortName;

    @FindBy(xpath="//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']/input")
    private WebElement IntegrationCode;

    @FindBy(xpath="//ms-text-field[@formcontrolname='priority']/input")
    private WebElement Priority;

    @FindBy(xpath="//ms-text-field[@formcontrolname='description']/input")
    private WebElement Description;

    @FindBy(xpath="//span[text()='Subjects']")
    private WebElement Subjects;

    @FindBy(xpath="//span[text()='Subject Category']")
    private WebElement Subject_Category_dropdown;

    @FindBy(xpath="//mat-chip-list[@focused='unFocus']//input")
    private WebElement UserType;

        @FindBy(xpath="//span[text()=' Tenant Admin ']")
        private WebElement UserTypeOption_TenantAdmin;

        @FindBy(xpath="//span[text()=' Everyone ']")
        private WebElement UserTypeOption_Everyone;

        @FindBy(xpath="//span[text()=' Administrator ']")
        private WebElement UserTypeOption_Administrator;

        @FindBy(xpath="//span[text()=' User ']")
        private WebElement UserTypeOption_User;

        @FindBy(xpath="//span[text()=' Guest ']")
        private WebElement UserTypeOption_Guest ;

    @FindAll({
            @FindBy(xpath="//table//tr//td[2]")
    })
    private List<WebElement> ListOfName;

    @FindAll({
            @FindBy(xpath="//table//tr//td[3]")
    })
    private List<WebElement> ListOfNamePosition3;

    @FindAll({
            @FindBy(xpath="//ms-edit-button//button")
    })
    private List<WebElement> ListOfedit;

    @FindAll({
            @FindBy(xpath="//ms-delete-button//button")
    })
    private List<WebElement> ListOfDelete;

    @FindAll({
            @FindBy(xpath="//span[@class='mat-option-text']")
    })
    private List<WebElement> DropdownOptionsList;

    WebElement myElement;

    public void verifyElementContainTheText(String elementName , String text){

        switch (elementName){
            case "successMessage":
                myElement = successMessage;
                break;
            case "ErrorMessage":
                myElement = ErrorMessage;
                break;
            case "Subjects":
                myElement = Subjects;
                break;

        }

        verifyElementContainsText(myElement , text);
    }

    public void findTheElementFromThePageAndClick(String elementName){

        switch (elementName){

            case "saveButton":
                myElement = saveButton;
                break;
            case "addButton":
                myElement = addButton;
                break;
            case "YesButton":
                myElement = YesButton;
                break;
            case "closeButton":
                myElement = closeButton;
                break;
            case "UserTypeOption_TenantAdmin":
                myElement = UserTypeOption_TenantAdmin;
                break;
            case "UserTypeOption_Everyone":
                myElement = UserTypeOption_Everyone;
                break;
            case "UserTypeOption_Administrator":
                myElement = UserTypeOption_Administrator;
                break;
            case "UserTypeOption_User":
                myElement = UserTypeOption_User;
                break;
            case "UserTypeOption_Guest":
                myElement = UserTypeOption_Guest;
                break;
            case "UserType":
                myElement = UserType;
                break;
            case "Subject_Category_dropdown":
                myElement = Subject_Category_dropdown;
                break;

        }

        clickFunction(myElement);

    }

    public void findTheElementFromThePageAndSendKeys(String elementName ,String value){

        switch (elementName) {

            case "nameInput":
                myElement = nameInput;
                break;
            case "codeInput":
                myElement = codeInput;
                break;
            case "shortName":
                myElement = shortName;
                break;
            case "IntegrationCode":
                myElement = IntegrationCode;
                break;
            case "Priority":
                myElement = Priority;
                break;
            case "Description":
                myElement = Description;
                break;

        }

        sendKeysFunction(myElement , value);

    }

    public void ClickOnTheButtonForTheElement(String position , String editOrDelete , String value) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> list1 = new ArrayList<>();

        if(position.equalsIgnoreCase("second")){
            list1 = ListOfName;
        }else{
            list1 = ListOfNamePosition3;
        }

        List<WebElement> list2 = new ArrayList<>();

        if(editOrDelete.equalsIgnoreCase("edit")){
            list2 = ListOfedit;
        }else{
            list2 = ListOfDelete;
        }

        clickOnButtonAccordingToName(list1 , list2 , value);

    }

    public void FindTheListAndClickOnExpectedElement(String listName , String expectedElement){

        List<WebElement> listOfObjects = new ArrayList<>();

        switch (listName){
            case "DropdownOptionsList":
                listOfObjects=DropdownOptionsList;
            break;

        }

        clickOnElementFromTheList(listOfObjects , expectedElement);
    }


}
