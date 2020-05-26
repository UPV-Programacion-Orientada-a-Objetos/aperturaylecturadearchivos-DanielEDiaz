package com.mycompany.app.Modelo;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LeerExcel {

    public LeerExcel(File filename){
        System.out.println("Hola");
        List cellData = new ArrayList<>();
        try{
            FileInputStream fileInputStream = new FileInputStream(filename);
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

            XSSFSheet hssfSheet = workbook.getSheetAt(0);
            Iterator rowIterator = hssfSheet.rowIterator();

            while (rowIterator.hasNext()){
                XSSFRow hssfRow = (XSSFRow)rowIterator.next();
                Iterator iterator = hssfRow.cellIterator();
                List cellTemp = new ArrayList();
                while (iterator.hasNext()){
                    XSSFCell hssfCell = (XSSFCell)iterator.next();
                    cellTemp.add(hssfCell);
                }
                cellData.add(cellTemp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Obtener(cellData);
    }

    private void Obtener(List cellDataList){
        System.out.println("Hola");
        for (int i=0; i<cellDataList.size(); i++){
            List cellTempList = (List)cellDataList.get(i);
            for (int j=0; j<cellTempList.size(); j++){
                XSSFCell hssfCell = (XSSFCell)cellTempList.get(j);
                String stringCellValue = hssfCell.toString();
                System.out.println(stringCellValue+" ");
            }
            System.out.println();
        }
    }
}
