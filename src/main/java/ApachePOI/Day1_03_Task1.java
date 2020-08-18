package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Day1_03_Task1 {

    /*
        First create a task excel in the excel files package.

        Task1:
                Print the value of password.


        Task2:
                Print all the values in the task excel sheet.

     */

    public static void main(String[] args) {

        String path = "src/test/java/excelFiles/task.xlsx";

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

        int maxRow = sheet.getPhysicalNumberOfRows();

        Row row;

        Cell cell;

        String result = "";

        for(int i = 0 ; i<maxRow ; i++ ) {

            row = sheet.getRow( i );

            cell =  row.getCell( 0 );

            if(cell.toString().equalsIgnoreCase("password")){
                int cellCount= row.getPhysicalNumberOfCells();
                    for( int j = 1 ; j < cellCount ;j++){

                    cell =  row.getCell( j );

                    result = cell.toString();
                        System.out.println(result);
                    }
            }
        }
    }
}
