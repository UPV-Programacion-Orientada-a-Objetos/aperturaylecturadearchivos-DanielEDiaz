package com.mycompany.app.DAO.PG;

import com.mycompany.app.DAO.AulaEquipoDAO;
import com.mycompany.app.DAO.DAOException;
import com.mycompany.app.DAO.DisponibilidadDAO;
import com.mycompany.app.Modelo.AulaEquipo;
import com.mycompany.app.Modelo.Disponibilidad;

import java.sql.Connection;
import java.util.List;

public class PGAulaEquipoDAO implements AulaEquipoDAO {

    private Connection con;
    public PGAulaEquipoDAO(Connection con) {
        this.con = con ;
    }

    @Override
    public void Insertar(AulaEquipo p) throws DAOException {

    }

    @Override
    public void Modificar(AulaEquipo p) throws DAOException {

    }

    @Override
    public void Eliminar(AulaEquipo p) throws DAOException {

    }

    @Override
    public List<AulaEquipo> All() throws DAOException {
        return null;
    }

    @Override
    public AulaEquipo Buscar(AulaEquipo.PKAulaE id) throws DAOException {
        return null;
    }
}
