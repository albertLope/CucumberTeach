package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Day2_01_WriteInExcel {

//      Second day of the Apache POI.
    public static void main(String[] args) {

        String path = "src/test/java/excelFiles/writeInTheExcel.xlsx";

        FileInputStream inStream = null;

        try{
            inStream =new FileInputStream( path );
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        Workbook workbook = null;
        
        try{
            workbook = WorkbookFactory.create( inStream );
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        Sheet sheet = workbook.getSheet( "Sheet1" );

        Row row = sheet.createRow( 0 );

//       you need to create the each cell to write data in the excel
        Cell cell = row.createCell( 0 );

//       you need to create the each cell to write data in the excel
        cell.setCellValue( "Hello world2");

//            save the changes
        FileOutputStream outStream= null;
        try{
            outStream = new FileOutputStream( path );
            workbook.write( outStream );

            outStream.close();
            workbook.close();
            inStream.close();

        }catch(Exception e ){
            System.out.println(e.getMessage());
        }

    }

}
