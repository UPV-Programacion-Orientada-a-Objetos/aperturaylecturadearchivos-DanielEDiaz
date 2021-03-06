package com.mycompany.app.ODATA;

import com.mycompany.app.Modelo.Profesor;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LeerExcelv3 {

    public LeerExcelv3(File excel) {
        try {
            FileInputStream fis = new FileInputStream(excel);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            EscogerHoja(wb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void EscogerHoja(XSSFWorkbook wb) {

        for (int i = 0; i < wb.getNumberOfSheets(); i++) {
            if (wb.getSheetName(i).equals("Profesores")) {
                List list = new ArrayList();
                LeerExcel(i, list, wb);
                System.out.println(list);
            }
        }
    }

    public /*List*/ void LeerExcel(int n, List cellTemp, XSSFWorkbook wb) {
        XSSFSheet sheet = wb.getSheetAt(n);
        Iterator rowIterator = sheet.rowIterator();

        while (rowIterator.hasNext()) {
            XSSFRow row = (XSSFRow) rowIterator.next();
            Iterator iterator = row.cellIterator();
            while (iterator.hasNext()) {
                XSSFCell cell = (XSSFCell) iterator.next();
                cellTemp.add(cell);
            }
        }
        Obtener(cellTemp);
        //return cellTemp;
    }

    private void Obtener(List cellDataList) {
        for (int i = 0; i < cellDataList.size(); i++) {
            List cellTempList = (List) cellDataList.get(i);
            for (int j = 0; j < cellTempList.size(); j++) {
                XSSFCell hssfCell = (XSSFCell) cellTempList.get(j);
                String stringCellValue = hssfCell.toString();
                System.out.println(stringCellValue + " ");
            }
            System.out.println();
        }
    }
    /*System.out.println(list);
      int k=0;
      System.out.println(list.size());
      while (k<list.size()){
           AProf.add(new Profesor(
                 list.get(k).toString(),
                 Integer.parseInt(list.get(k).toString()),
                 list.get(k).toString(),
                 list.get(k).toString(),
                 list.get(k).toString()
                  )
             );
      k++;*/

}