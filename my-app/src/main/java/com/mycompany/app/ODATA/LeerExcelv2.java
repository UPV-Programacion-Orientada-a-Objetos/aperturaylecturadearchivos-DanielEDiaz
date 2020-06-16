package com.mycompany.app.ODATA;

import com.mycompany.app.Modelo.Profesor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class LeerExcelv2 {
    public ArrayList<Profesor> LeerDaatos(File file, ArrayList<Profesor> AProf){

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);
            for (int i = 0; i<wb.getNumberOfSheets(); i++){
                if(wb.getSheetName(i).equals("Profesores")){
                    XSSFSheet sheet = wb.getSheetAt(i);
                    HashMap<String, Profesor> mp = new HashMap<String, Profesor>();

                    Iterator<Row> rowIterator =sheet.iterator();
                    while (rowIterator.hasNext()){
                        Row row = rowIterator.next();
                        Iterator<Cell> cellIterator = row.cellIterator();
                        while (cellIterator.hasNext()){
                            Cell cell = cellIterator.next();

                            int j=0, k=0;
                            switch (cell.getCellType()){
                                case Cell.CELL_TYPE_NUMERIC:
                                    System.out.print(cell.getNumericCellValue()+"\t");
                                    j = Integer.parseInt(String.valueOf(cell.getNumericCellValue()));
                                    Profesor d = new Profesor();
                                    d.setIdcarrera((int) cell.getNumericCellValue());
                                    break;

                                case Cell.CELL_TYPE_STRING:
                                    System.out.print(cell.getStringCellValue()+"\t");
                                    if(j==0){
                                        Profesor prof = mp.get(i);
                                       // prof.setClv_usuario();
                                    }
                            }
                        }
                    }

                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


        return AProf;
    }
}
