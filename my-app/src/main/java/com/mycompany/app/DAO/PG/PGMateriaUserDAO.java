package com.mycompany.app.DAO.PG;

import com.mycompany.app.DAO.DAOException;
import com.mycompany.app.DAO.MateriaUsuarioDAO;
import com.mycompany.app.Modelo.MateriaUsuario;

import java.sql.Connection;
import java.util.List;

public class PGMateriaUserDAO implements MateriaUsuarioDAO {

    private Connection con;

    public PGMateriaUserDAO(Connection con) {
        this.con = con;
    }

    @Override
    public void Insertar(MateriaUsuario p) throws DAOException {

    }

    @Override
    public void Modificar(MateriaUsuario p) throws DAOException {

    }

    @Override
    public void Eliminar(MateriaUsuario p) throws DAOException {

    }

    @Override
    public List<MateriaUsuario> All() throws DAOException {
        return null;
    }

    @Override
    public MateriaUsuario Buscar(MateriaUsuario.PKMatU id) throws DAOException {
        return null;
    }
}
