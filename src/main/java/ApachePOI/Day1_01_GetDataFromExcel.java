package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Day1_01_GetDataFromExcel {

//      First day of the Apache POI.

    public static void main(String[] args) {

        String path = "src/test/java/excelFiles/releaseNotes.xlsx";

        FileInputStream inStream = null;
            try {
                inStream = new FileInputStream( path );
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        Workbook workbook = null;
            try {
                workbook = WorkbookFactory.create( inStream );
            } catch (IOException e) {
                e.printStackTrace();
            }

        Sheet sheet = workbook.getSheet( "Sheet1" );

        Row row = sheet.getRow( 0 );

        Cell cell = row.getCell( 0 );

        System.out.println(cell);

    }
}
