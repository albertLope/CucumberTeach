package Pages;

import Utilities.Day10_DriverClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends _01_ParentClass {

    private WebDriver driver ;

    //    https://www.softwaretestinghelp.com/page-object-model-pom-with-pagefactory/#:~:text=The%20initElements%20is%20a%20static,java.lang.Class%20pageObjectClass)
    public LeftNav(){

        driver = Day10_DriverClass.GetDriver();
        PageFactory.initElements( driver , this );

    }

    @FindBy(xpath="//span[text()='Setup']")
    private WebElement setupOne;

    @FindBy(xpath="//span[text()='Parameters']")
    private WebElement Parameters;

    @FindBy(xpath="//span[text()='Countries']")
    private WebElement Country;

    @FindBy(xpath="//span[text()='Citizenships']")
    private WebElement Citizenships;

    @FindBy(xpath="//span[text()='Nationalities']")
    private WebElement Nationalities;

    @FindBy(xpath="//span[text()='Fees']")
    private WebElement Fees;

    @FindBy(xpath="//span[text()='Discounts']")
    private WebElement Discounts;

    @FindBy(xpath="//span[text()='Inventory']")
    private WebElement InventoryMain;

    @FindBy(xpath="//fuse-nav-vertical-collapsable[contains(@class,'nav-item ng-star-inserted open')]//span[text()='Setup']")
    private WebElement SetupUnderTheInventory;

    @FindBy(xpath="//span[text()='Item Categories']")
    private WebElement Item_Categories;

    @FindBy(xpath="//span[text()='Entrance Exams']")
    private WebElement Entrance_ExamsDropdownMain;

    @FindBy(xpath="//fuse-nav-vertical-item[contains(@class,'inserted')]//span[text()='Entrance Exams']")
    private WebElement Entrance_ExamsButton;

    @FindBy(xpath="//span[text()='Student']")
    private WebElement Student;

    @FindBy(xpath="//span[text()='Students']")
    private WebElement Students;

    @FindBy(xpath="//span[text()='Education']")
    private WebElement Education;

    @FindBy(xpath="//span[text()='Subject Categories']")
    private WebElement Subject_Categories;

    @FindBy(xpath="//span[text()='Subjects']")
    private WebElement Subjects;

    @FindBy(xpath="//span[text()='Release Notes']")
    private WebElement Release_Notes;


    WebElement myElement;

    public void findTheElementFromThePageAndClick(String elementName){

        switch (elementName){

            case "setupOne":
                myElement = setupOne;
                break;
            case "Parameters":
                myElement = Parameters;
                break;
            case "Country":
                myElement = Country;
                break;
            case "Citizenships":
                myElement = Citizenships;
                break;
            case "Nationalities":
                myElement = Nationalities;
                break;
            case "Fees":
                myElement = Fees;
                break;
            case "Discounts":
                myElement = Discounts;
                break;
            case "InventoryMain":
                myElement = InventoryMain;
                break;
            case "SetupUnderTheInventory":
                myElement = SetupUnderTheInventory;
                break;
            case "Item_Categories":
                myElement = Item_Categories;
                break;
            case "Entrance_ExamsDropdownMain":
                myElement = Entrance_ExamsDropdownMain;
                break;
            case "Entrance_ExamsButton":
                myElement = Entrance_ExamsButton;
                break;
            case "Student":
                myElement = Student;
                break;
            case "Students":
                myElement = Students;
                break;
            case "Education":
                myElement = Education;
                break;
            case "Subject_Categories":
                myElement = Subject_Categories;
                break;
            case "Subjects":
                myElement = Subjects;
                break;
            case "Release_Notes":
                myElement = Release_Notes;
                break;


            default:
                break;
        }

        clickFunction(myElement);

    }

    /*
        Clean -> Clean the target folder
        Validate -> Checking is your pom.xml file is created as expected is there any problem in the dependencies.
        Compile -> Compile of the source code of the project and test.
        Test -> Test the source code.



     */

}
