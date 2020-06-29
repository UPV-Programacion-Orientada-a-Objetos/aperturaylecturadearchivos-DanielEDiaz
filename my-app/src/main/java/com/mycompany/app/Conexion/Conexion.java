package com.mycompany.app.Conexion;

import com.mycompany.app.Modelo.DatosConfig;

import java.sql.*;

public class Conexion {

    private Connection con;
    //private DatosConfig dc;

    public Conexion(){
        super();
    }

    public Conexion(String driver, String cadenaconexion, String usuario, String passwort){
        try {
            con = DriverManager.getConnection("jdbc:"+cadenaconexion, usuario, passwort);
        }catch (SQLException ex){
            System.out.print("Codigo de Error: "+ ex.getErrorCode());
            ex.printStackTrace();
        }
    }

    public Conexion(DatosConfig dc){
        try{
            con = DriverManager.getConnection("jdbc:"+dc.getGestor()+"://localhost:"+dc.getHost()+"/"+dc.getBaseDatos()+"", dc.getUser(), dc.getPasswort());
            if(con != null){
                System.out.println("Conexion realiazada en "+dc.getGestor());
            }else if(con == null){
                System.out.println("No jalo chaval:(");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Conexion(String url){
        try{
            con = DriverManager.getConnection("jdbc:sqlite:"+url);
            System.out.println("Conexion realizada en SQLite");
            System.out.println("Ruta de la base de datos: "+ url);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Connection getCon (){
        return con;
    }


}