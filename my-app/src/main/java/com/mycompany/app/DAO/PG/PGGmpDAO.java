package com.mycompany.app.DAO.PG;

import com.mycompany.app.DAO.DAOException;
import com.mycompany.app.DAO.GrupoMateriaProfesorDAO;
import com.mycompany.app.Modelo.GrupoMateriaProfesor;

import java.sql.Connection;
import java.util.List;

public class PGGmpDAO implements GrupoMateriaProfesorDAO {

    Connection con;

    public PGGmpDAO(Connection con) {
        this.con = con;
    }

    @Override
    public void Insertar(GrupoMateriaProfesor p) throws DAOException {

    }

    @Override
    public void Modificar(GrupoMateriaProfesor p) throws DAOException {

    }

    @Override
    public void Eliminar(GrupoMateriaProfesor p) throws DAOException {

    }

    @Override
    public List<GrupoMateriaProfesor> All() throws DAOException {
        return null;
    }

    @Override
    public GrupoMateriaProfesor Buscar(GrupoMateriaProfesor.PKGMP id) throws DAOException {
        return null;
    }
}
