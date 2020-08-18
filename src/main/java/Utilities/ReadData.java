package Utilities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadData {

    Sheet sheet;

    public ReadData(String pathOfTheExcel , String sheetName){

        FileInputStream inStream = null;

        try {
            inStream = new FileInputStream( pathOfTheExcel );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Workbook workbook = null;
        try {
            workbook = WorkbookFactory.create( inStream );
        } catch (IOException e) {
            e.printStackTrace();
        }

        sheet = workbook.getSheet( sheetName );

        System.out.println(sheet.getPhysicalNumberOfRows());

    }

    public List<String> getAllDataFromExcel(){
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
        return allData;
    }

    public String GetSingleDataFromExcel(String whichData){

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

    public List<String> getSecondRow(){

        int maxRow = sheet.getPhysicalNumberOfRows();

        Row row;

        Cell cell;

        List<String> allData = new ArrayList<>(  );

        for(int i = 0 ; i<maxRow ; i++ ) {

            row = sheet.getRow( i );

            cell = row.getCell( 1 );

            allData.add( cell.toString() );

        }

        return allData;

    }

}
