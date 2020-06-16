package com.mycompany.app.DAO.PG;

import com.mycompany.app.DAO.DAOException;
import com.mycompany.app.DAO.UsoAulaGrupoDAO;
import com.mycompany.app.Modelo.UsoAulaGrupo;

import java.sql.Connection;
import java.util.List;

public class PGUsoAulaGrupoDAO implements UsoAulaGrupoDAO {

    private Connection con;
    public PGUsoAulaGrupoDAO(Connection con) {
        this.con = con;
    }

    @Override
    public void Insertar(UsoAulaGrupo p) throws DAOException {

    }

    @Override
    public void Modificar(UsoAulaGrupo p) throws DAOException {

    }

    @Override
    public void Eliminar(UsoAulaGrupo p) throws DAOException {

    }

    @Override
    public List<UsoAulaGrupo> All() throws DAOException {
        return null;
    }

    @Override
    public UsoAulaGrupo Buscar(UsoAulaGrupo.PKUag id) throws DAOException {
        return null;
    }
}
