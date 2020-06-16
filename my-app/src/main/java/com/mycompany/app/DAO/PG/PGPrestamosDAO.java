package com.mycompany.app.DAO.PG;

import com.mycompany.app.DAO.DAOException;
import com.mycompany.app.DAO.PrestamosDAO;
import com.mycompany.app.Modelo.Prestamos;

import java.sql.Connection;
import java.util.List;

public class PGPrestamosDAO implements PrestamosDAO {
    private Connection con;

    public PGPrestamosDAO(Connection con) {
        this.con = con ;
    }

    @Override
    public void Insertar(Prestamos p) throws DAOException {

    }

    @Override
    public void Modificar(Prestamos p) throws DAOException {

    }

    @Override
    public void Eliminar(Prestamos p) throws DAOException {

    }

    @Override
    public List<Prestamos> All() throws DAOException {
        return null;
    }

    @Override
    public Prestamos Buscar(Prestamos.PKPres id) throws DAOException {
        return null;
    }
}
