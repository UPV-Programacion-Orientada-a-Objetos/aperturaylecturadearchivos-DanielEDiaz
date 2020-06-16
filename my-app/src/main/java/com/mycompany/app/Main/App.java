package com.mycompany.app.Main;

import com.mycompany.app.ODATA.JSONData;

import java.io.File;

public class App 
{
    public static void main_2( String[] args )
    {
        Start();
    }

    private static void Start (){
        final File Excel = new File("src/main/Resources/Libro1.xlsx");
        final File Json = new File("src/main/Resources/Datos.json");
        JSONData j = new JSONData();

        //if(Json.exists() || Excel.exists()){
            j.LeerJson(Json);
            //LeerExcelv3 l = new LeerExcelv3(f);
        //}


    }
}

