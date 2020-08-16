package Pages;

import Utilities.DriverClassCopy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPages extends _01_ParentClass {


    private WebDriver driver ;

    //    https://www.softwaretestinghelp.com/page-object-model-pom-with-pagefactory/#:~:text=The%20initElements%20is%20a%20static,java.lang.Class%20pageObjectClass)
    public FormPages(){

        driver = DriverClassCopy.getDriver();
        PageFactory.initElements( driver , this );

    }

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath="//ms-text-field[@formcontrolname='firstName']/input")
    private WebElement firstName;

    @FindBy(xpath="//input[@formcontrolname='firstName']")
    private WebElement PopUpFirstName;

    @FindBy(xpath="//input[@formcontrolname='lastName']")
    private WebElement PopUplastName;

    @FindBy(xpath="//input[@formcontrolname='phone']")
    private WebElement contactInfo;

    @FindBy(xpath="//ms-text-field[@formcontrolname='lastName']/input")
    private WebElement lastName;

    @FindBy(xpath="//ms-text-field[@formcontrolname='middleName']/input")
    private WebElement middleName;

    @FindBy(xpath="//input[@formcontrolname='documentNumber']")
    private WebElement documentNumber;

    @FindBy(xpath="//mat-select[@formcontrolname='gender']/div")
    private WebElement gender;

    @FindBy(xpath="//ms-date[@formcontrolname='registrationStartDate']//input[@placeholder='Reg.Start']")
    private WebElement RegStart;

    @FindBy(xpath="//ms-date[@formcontrolname='registrationEndDate']//input[@placeholder='Reg.End']")
    private WebElement RegEnd;

    @FindBy(xpath="//mat-select[@aria-label='Academic Period']/div")
    private WebElement Academic_Period;

        @FindBy(xpath="//span[text()=' 2019-2020 ']")
        private WebElement Option_2019_2020;

        @FindBy(xpath="//span[text()=' 2018-2019 ']")
        private WebElement Option_2018_2019;

    @FindBy(xpath="//mat-select[@aria-label='Grade Level']/div")
    private WebElement Grade_Level;

    @FindBy(xpath="//mat-select[@aria-label='Document Type']/div")
    private WebElement DocumentType;

    @FindBy(xpath="//mat-select[@aria-label='Section']/div")
    private WebElement Section;

        @FindBy(xpath="(//mat-option[@role='option'])[1]")
        private WebElement Option1;

        @FindBy(xpath="(//mat-option[@role='option'])[2]")
        private WebElement Option2;

        @FindBy(xpath="(//mat-option[@role='option'])[3]")
        private WebElement Option3;

        @FindBy(xpath="(//mat-option[@role='option'])[4]")
        private WebElement Option4;

        @FindBy(xpath="(//mat-option[@role='option'])[5]")
        private WebElement Option5;

        @FindBy(xpath="(//mat-option[@role='option'])[6]")
        private WebElement Option6;

    @FindBy(xpath="//span[text()='Add']")
    private WebElement AddButton;

    @FindBy(xpath="//span[text()=' Add ']")
    private WebElement AddButtonPopUp;

    @FindBy(xpath="//ms-add-button[@tooltip='GENERAL.BUTTON.ADD_REPRESENTATIVE']//button")
    private WebElement plusIconAddRepresentative;

    @FindBy(xpath="//span[text()='Save']")
    private WebElement SaveButton;

    @FindBy(xpath="//ms-dialog-buttons//button")
    private WebElement SaveButtonPopUp;

    @FindBy(xpath="//mat-select[@aria-label='School Department']/div")
    private WebElement SchoolDepartment;

    @FindBy(xpath="//mat-select[@aria-label='Citizenship']/div")
    private WebElement Citizenship;

    @FindBy(xpath="//mat-select[@aria-label='Nationality']/div")
    private WebElement Nationality;

    @FindBy(xpath="//mat-select[@aria-label='Document Type']/div")
    private WebElement Document_Type;

        @FindBy(xpath="//span[text()=' Лицей ']")
        private WebElement SchoolDepartmentOptions1;

        @FindBy(xpath="//span[text()=' Колледж ']")
        private WebElement SchoolDepartmentOptions2;

    @FindBy(xpath="//div[text()='Representatives']")
    private WebElement Representatives;

    @FindBy(xpath="//mat-select[@aria-label='Representative']/div")
    private WebElement RepresentativeDropdown;

    @FindBy(xpath="//mat-select[@aria-label='Entry From']/div")
    private WebElement entryType;


    WebElement myElement;

    public void findTheElementFromThePageAndClick(String elementName){

        switch (elementName){
            case "Academic_Period":
                myElement = Academic_Period;
                break;
            case "Option_2019_2020":
                myElement = Option_2019_2020;
                break;
            case "Option_2018_2019":
                myElement = Option_2018_2019;
                break;
            case "Grade_Level":
                myElement = Grade_Level;
                break;
            case "DocumentType":
                myElement = DocumentType;
                break;
            case "AddButton":
                myElement = AddButton;
                break;
            case "SaveButton":
                myElement = SaveButton;
                break;
            case "gender":
                myElement = gender;
                break;
            case "SchoolDepartment":
                myElement = SchoolDepartment;
                break;
            case "SchoolDepartmentOptions1":
                myElement = SchoolDepartmentOptions1;
                break;
            case "SchoolDepartmentOptions2":
                myElement = SchoolDepartmentOptions2;
                break;
            case "Option1":
                myElement = Option1;
                break;
            case "Option2":
                myElement = Option2;
                break;
            case "Option3":
                myElement = Option3;
                break;
            case "Option4":
                myElement = Option4;
                break;
            case "Option5":
                myElement = Option5;
                break;
            case "Option6":
                myElement = Option6;
                break;
            case "Section":
                myElement = Section;
                break;
            case "Citizenship":
                myElement = Citizenship;
                break;
            case "Nationality":
                myElement = Nationality;
                break;
            case "Document_Type":
                myElement = Document_Type;
                break;
            case "Representatives":
                myElement = Representatives;
                break;
            case "plusIconAddRepresentative":
                myElement = plusIconAddRepresentative;
                break;
            case "RepresentativeDropdown":
                myElement = RepresentativeDropdown;
                break;
            case "AddButtonPopUp":
                myElement = AddButtonPopUp;
                break;
            case "entryType":
                myElement = entryType;
                break;
            case "SaveButtonPopUp":
                myElement = SaveButtonPopUp;
                break;
        }
        clickFunction(myElement);
    }

    public void findTheElementFromThePageAndSendKeys(String elementName ,String value){

        switch (elementName) {
            case "nameInput":
                myElement = nameInput;
                break;
            case "RegStart":
                myElement = RegStart;
                break;
            case "RegEnd":
                myElement = RegEnd;
                break;
            case "firstName":
                myElement = firstName;
                break;
            case "lastName":
                myElement = lastName;
                break;
            case "middleName":
                myElement = middleName;
                break;
            case "documentNumber":
                myElement = documentNumber;
                break;
            case "PopUpFirstName":
                myElement = PopUpFirstName;
                break;
            case "PopUplastName":
                myElement = PopUplastName;
                break;
            case "contactInfo":
                myElement = contactInfo;
                break;

        }
        sendKeysFunction(myElement , value);
    }


}
