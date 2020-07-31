package Utilities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Day2_GetSingleDataFromExcelReusableMethod {

   public static String GetSingleDataFromExcel(String pathName , String sheetName , String whichData){

       FileInputStream inStream = null;
       try {
           inStream = new FileInputStream( pathName );
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }

       Workbook workbook = null;
       try {
           workbook = WorkbookFactory.create( inStream );
       } catch (IOException e) {
           e.printStackTrace();
       }

       Sheet sheet = workbook.getSheet( sheetName );

       int maxRow = sheet.getPhysicalNumberOfRows();

       Row row;

       Cell cell;

       String result = "";

       for(int i = 0 ; i<maxRow ; i++ ) {

           row = sheet.getRow( i );

           cell =  row.getCell( 0 );

           if(cell.toString().equalsIgnoreCase(whichData)){

               cell =  row.getCell( 1 );

               result = cell.toString();

               break;
           }

       }

      return result;

   }

}
