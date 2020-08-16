package Steps;

import Pages.LeftNav;
import Pages.ReleaseNotes;
import Utilities.Day2_GetMultipleDataFromExcelReusableMethod;
import cucumber.api.java.en.And;

import java.util.List;

public class Day14_ApachePOI {

    LeftNav leftNav = new LeftNav();
    ReleaseNotes releaseNotes = new ReleaseNotes();

    @And("^Navigate to ReleaseNotes page$")
    public void navigate_to_ReleaseNotes_page()   {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        leftNav.findTheElementFromThePageAndClick("Release_Notes");

    }

    @And("^Verify release notes as expected$")
    public void verify_release_notes_as_expected(){

        List<String> releaseNotesFromExcel = Day2_GetMultipleDataFromExcelReusableMethod.reusableMethodForGetData("src/test/java/excelFiles/releaseNotes.xlsx" , "sheet1");

        releaseNotes.checkReleaseNotes(releaseNotesFromExcel);

    }

}
