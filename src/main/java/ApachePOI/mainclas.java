package ApachePOI;

import Utilities.Day2_GetMultipleDataFromExcelReusableMethod;

import java.util.List;

public class mainclas {

    public static void main(String[] args) {

        List<String> aa = Day2_GetMultipleDataFromExcelReusableMethod.reusableMethodForGetData("src/test/java/excelFiles/releaseNotes.xlsx" , "sheet1");

        System.out.println(aa);

    }

}
