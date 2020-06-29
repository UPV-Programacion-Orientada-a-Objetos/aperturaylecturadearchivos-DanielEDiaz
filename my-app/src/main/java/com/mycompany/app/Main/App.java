package com.mycompany.app.Main;

import com.mycompany.app.DAO.DAOException;
import com.mycompany.app.Cargar.Start;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class App extends Start {

    public static void main( String[] args ) throws FileSystemException, FileNotFoundException {
        cargar();
    }

}

