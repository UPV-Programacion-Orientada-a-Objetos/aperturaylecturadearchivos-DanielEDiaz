package com.mycompany.app.ODATA;

import com.mycompany.app.DAO.DAO;
import com.mycompany.app.DAO.PG.PGAulaDAO;
import com.mycompany.app.Modelo.Aula;
import com.mycompany.app.Conexion.Conexion;
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

public class ExcelvFinal extends Conexion {

    private int numhoja;
    private ArrayList<Aula> AAula = new ArrayList<>();

    private DAO daoAula = new PGAulaDAO(getCon());
    public ExcelvFinal(File Excel){

        List cellData = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(Excel);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            for (int i=0; i<wb.getNumberOfSheets(); i++){
                EscogerHoja(wb, numhoja);
                XSSFSheet Hoja = wb.getSheetAt(numhoja);
                Iterator rowIterator = Hoja.rowIterator();
                while (rowIterator.hasNext()){
                    XSSFRow fila = (XSSFRow)rowIterator.next();
                    Iterator celdas = fila.cellIterator();
                    List cellTemp = new ArrayList();
                    while(celdas.hasNext()){
                        XSSFCell celda = (XSSFCell)celdas.next();
                        cellTemp.add(celda);
                    }
                    cellData.add(cellTemp);
                }

            }
            CrearInstancias(cellData, numhoja);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int EscogerHoja(XSSFWorkbook wb, int hoja){
        for (int i = 0; i < wb.getNumberOfSheets(); i++) {
            if (wb.getSheetName(i).equals("Aulas")) {
                System.out.println(wb.getSheetName(i));
                hoja = i;
                break;
            }else if(wb.getSheetName(i).equals("AulaEquipo")){
                hoja = i;
                break;
            }else if (wb.getSheetName(i).equals("Carrera")){
                hoja = i;
                break;
            }else if (wb.getSheetName(i).equals("CategoriasEquipo")){
                hoja = i;
                break;
            }else if (wb.getSheetName(i).equals("Disponibilidad")){
                hoja = i;
                break;
            }else if (wb.getSheetName(i).equals("Equipo")){
                hoja = i;
                break;
            }else if(wb.getSheetName(i).equals("Grupo")){
                hoja = i;
                break;
            }else if (wb.getSheetName(i).equals("GrupoMateriaProfesor")){
                hoja = i;
                break;
            }else if (wb.getSheetName(i).equals("Login")){
                hoja = i;
                break;
            }else if(wb.getSheetName(i).equals("Materia")){
                hoja = i;
                break;
            }else if (wb.getSheetName(i).equals("MateriaUsuario")){
                hoja = i;
                break;
            }else if (wb.getSheetName(i).equals("PlanDeEstudios")){
                hoja = i;
                break;
            }else if (wb.getSheetName(i).equals("Prestamos")){
                hoja = i;
                break;
            }else if (wb.getSheetName(i).equals("Usuarios")){
                hoja = i;
                break;
            }else if(wb.getSheetName(i).equals("UsoAulaGrupo")){
                hoja = i;break;
            }
        }
        return hoja;
    }

    private void CrearInstancias(List celdasData, int hoja){
        for (int i=0; i<celdasData.size(); i++) {
            switch (numhoja) {
                case 1:
                    AAula.add(new Aula(
                            celdasData.get(1).toString(),
                            celdasData.get(2).toString(),
                            celdasData.get(3).toString(),
                            Integer.parseInt(celdasData.get(4).toString()),
                            celdasData.get(5).toString(),
                            celdasData.get(6).toString()
                    ));
            }
        }

    }
}
