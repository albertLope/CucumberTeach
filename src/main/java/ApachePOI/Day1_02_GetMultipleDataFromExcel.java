package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day1_02_GetMultipleDataFromExcel {

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

        Sheet sheet = workbook.getSheetAt( 0 );

        System.out.println(sheet.getPhysicalNumberOfRows());

        int maxRow = sheet.getPhysicalNumberOfRows();

        Row row;

        Cell cell;

        List<String> allData = new ArrayList<>(  );

        for(int i = 0 ; i<maxRow ; i++ ) {

            row = sheet.getRow( i );

            int cellCount= row.getPhysicalNumberOfCells();

            for(int j = 0 ; j<cellCount ; j++){

                cell = row.getCell( j );

                allData.add( cell.toString() );

            }

        }

        System.out.println(allData);

    }

}

    /*

            for (int n = 0; n < workbook.getNumberOfSheets(); n++) { // iterate over all existing sheets
                Sheet sheet = workbook.getSheetAt(n); // get reference to each sheet
                for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) { // iterate over all existing rows in a sheet
                    Row row = sheet.getRow(i); // get reference to each row
                    for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) { // iterate over all existing cell in a row
                        Cell cell = row.getCell(j); // get reference to each cell
                        System.out.print(cell.getStringCellValue() + " "); // get the string value of each cell
                    }
                    System.out.println();
                }
                System.out.println();
                System.out.println();
            }
     */
