package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Task3 {
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

        ArrayList<String > a1 = new ArrayList<>();

        for(int i = 0 ; i<maxRow ; i++ ) {

            row = sheet.getRow( i );

            cell =  row.getCell( 1 );

            result = cell.toString();

            a1.add(result);
        }

        System.out.println(a1);
    }
}
