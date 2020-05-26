package com.mycompany.app.Main;

import com.mycompany.app.Modelo.LeerExcel;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        File f = new File("com/Resources/Libro1.xlsx");
        if (f.exists()){
            LeerExcel l = new LeerExcel(f);
        }/*else{


        }*/
    }
}
