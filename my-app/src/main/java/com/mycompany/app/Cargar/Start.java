package com.mycompany.app.Cargar;

import com.mycompany.app.Conexion.ObtenerDatosConfiguracion;
import com.mycompany.app.ODATA.JSONData;
import com.mycompany.app.ODATA.LeerExcelv3;

import java.io.File;

public class Start{
    private final static File Excel = new File("src/main/Resources/Libro1.xlsx");
    private final static File Json = new File("src/main/Resources/Datos.json");
    private final static File Config = new File("src/main/Resources/Config.json");

    public static void cargar() {
        ObtenerDatosConfiguracion od = new ObtenerDatosConfiguracion(Config);
        /*JSONData j = new JSONData();
        if(Json.exists() || Excel.exists()){
        j.LeerJson(Json);
        LeerExcelv3 l = new LeerExcelv3(Excel);
        }*/
    }
}
