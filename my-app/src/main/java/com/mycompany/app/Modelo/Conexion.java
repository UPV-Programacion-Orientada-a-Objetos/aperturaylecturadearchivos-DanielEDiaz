package com.mycompany.app.Modelo;

import java.sql.*;

public class Conexion {



    private Connection con;
    private Statement st;

    public Conexion(String driver, String cadenaconexion, String usuario, String passwort){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection("jdbc:"+cadenaconexion, usuario, passwort);
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (ClassNotFoundException e) {
            System.out.print("No se ha podido encontrar la clase "+e.getCause());
        }catch (SQLException ex){
            System.out.print("Codigo de Error: "+ ex.getErrorCode());
            ex.printStackTrace();
        }
    }

    public Conexion(){
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ProyectoHorarios", "postgres","1234");
            if(con != null){
                System.out.println("Conexion realizada");
                st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    forName: ClassNotFoundException,SQLException
    */

}