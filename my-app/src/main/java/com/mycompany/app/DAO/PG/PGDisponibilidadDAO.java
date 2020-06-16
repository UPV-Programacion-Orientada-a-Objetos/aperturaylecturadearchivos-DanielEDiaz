package com.mycompany.app.DAO.PG;

import com.mycompany.app.DAO.DAOException;
import com.mycompany.app.DAO.DisponibilidadDAO;
import com.mycompany.app.Modelo.Disponibilidad;

import java.sql.Connection;
import java.util.List;

public class PGDisponibilidadDAO implements DisponibilidadDAO {

    static final String INSERT = "INSERT INTO disponibilidad VALUES (?, ?, ?)";
    static final String UPDATE = "UPDATE disponibilidad SET dia= ?, espacio_tiempo = ?, clv_usuario = ? WHERE clv_usuario = ? espacio_tiempo = ?, clv_usuario = ?";
    static final String DELETE = "DELETE FROM disponibilidad WHERE clv_usuario = ? espacio_tiempo = ?, clv_usuario = ?";
    static final String ALL = "SELECT * FROM disponibilidad";
    static final String BUSCAR = "SELECT * FROM disponibilidad WHERE clv_usuario = ? espacio_tiempo = ?, clv_usuario = ?";

    Connection con;

    public PGDisponibilidadDAO(Connection con) {
        this.con = con;
    }

    @Override
    public void Insertar(Disponibilidad p) throws DAOException {

    }

    @Override
    public void Modificar(Disponibilidad p) throws DAOException {

    }

    @Override
    public void Eliminar(Disponibilidad p) throws DAOException {

    }

    @Override
    public List<Disponibilidad> All() throws DAOException {
        return null;
    }

    @Override
    public Disponibilidad Buscar(Disponibilidad.PKDis id) throws DAOException {
        return null;
    }

}
