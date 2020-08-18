package ApachePOI;

import Utilities.Day2_GetAllDataFromExcelReusableMethod;

import java.util.List;

public class mainclas {

    public static void main(String[] args) {

        List<String> aa = Day2_GetAllDataFromExcelReusableMethod.reusableMethodForGetData("src/test/java/excelFiles/releaseNotes.xlsx" , "sheet1");

        System.out.println(aa);

    }

}
