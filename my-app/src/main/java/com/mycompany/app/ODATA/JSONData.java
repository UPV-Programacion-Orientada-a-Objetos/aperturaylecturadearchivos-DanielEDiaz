package com.mycompany.app.ODATA;

import com.mycompany.app.Modelo.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class JSONData {

    private ArrayList<Profesor> AProf = new ArrayList<>();
    private ArrayList<Materia> AMat = new ArrayList<Materia>();
    private ArrayList<Aula> AAula = new ArrayList<>();
    private ArrayList<Carrera> ACarrera = new ArrayList<>();
    private ArrayList<Equipo> AEquipo = new ArrayList<>();
    private ArrayList<Grupo> AGrupo = new ArrayList<>();
    private ArrayList<PlanEstudios> APEst = new ArrayList<>();
    private ArrayList<Categoria> ACat = new ArrayList<>();


    public void LeerJson(File JsonArch){

        ArrayList<JSONObject> json = new ArrayList<JSONObject>();
        JSONObject obj;
        String linea = null;

        try {
            FileReader fileReader = new FileReader(JsonArch);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((linea = bufferedReader.readLine()) != null){
                obj = (JSONObject) new JSONParser().parse(linea);
                try {
                    /*if(obj.get("Tipo").toString().equals("Profesor")){
                        AProf.add(new Profesor(
                                obj.get("clvCarrera").toString(),
                                Integer.parseInt(obj.get("idCarrera").toString().trim()),
                                obj.get("Nombre").toString(),
                                obj.get("nivelAds").toString(),
                                obj.get("Contrato").toString()
                            )
                        );
                    }else if(obj.get("Tipo").toString().equals("Materia")){
                        AMat.add(new Materia(
                                obj.get("nombre_materia").toString(),
                                obj.get("clv_materia").toString(),
                                Integer.parseInt(obj.get("creditos").toString()),
                                Integer.parseInt(obj.get("cuatrimestre").toString()),
                                Integer.parseInt(obj.get("posicion").toString()),
                                obj.get("clv_plan").toString(),
                                Integer.parseInt(obj.get("horasxsemana").toString()),
                                obj.get("tipo_materia").toString()
                                )
                        );
                    }else if(obj.get("Tipo").toString().equals("Equipo")){
                        /*AEquipo.add( new Equipo(
                            Integer.parseInt(obj.get("id").toString()),
                            obj.get("nombre").toString(),
                            obj.get("descripcion").toString(),
                            Integer.parseInt(obj.get("id_categoria").toString())
                            )
                        );
                    }else if (obj.get("Tipo").toString().equals("Categoria")){
                        ACat.add(new Categoria(
                            Integer.parseInt(obj.get("id").toString()),
                            obj.get("nombre").toString(),
                            obj.get("descripcion").toString()
                            )
                        );
                    }else if (obj.get("Tipo").toString().equals("Aula")){
                        AAula.add(new Aula(
                                obj.get("id_aula").toString(),
                                obj.get("nombre").toString(),
                                obj.get("tipo").toString(),
                                Integer.parseInt(obj.get("capacidad").toString())
                                )
                        );
                    }else if (obj.get("Tipo").toString().equals("PlanDeEstudios")){
                        APEst.add(new PlanEstudios(
                                obj.get("clv_plan").toString(),
                                obj.get("nombre_plan").toString(),
                                obj.get("nivel").toString(),
                                Integer.parseInt(obj.get("id_carrera").toString())
                                )
                        );
                    }
                    else if(obj.get("Tipo").toString().equals("Grupo")){
                        AGrupo.add(new Grupo(
                                obj.get("clv_grupo").toString(),
                                Boolean.parseBoolean("turno")
                                )
                        );
                    }else if(obj.get("Tipo").toString().equals("Carrera")){
                        ACarrera.add(new Carrera(
                            Integer.parseInt(obj.get("idcarrera").toString()),
                            obj.get("nombre_carrera").toString()
                            )
                        );
                    }
                    */
                }catch (NumberFormatException ne){
                    System.out.print("Hay un caracter no aceptado en el usuario" );
                    ne.printStackTrace();
                }

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.print("No se ha encontrado el archivo, verifique la ruta.");
        } catch (ParseException e) {
            e.printStackTrace();
        }catch (IOException e) {
            System.out.print("Error leyendo la linea: '"+linea+"'");
            e.getCause();
        }
        System.out.println("Lista de Profesores");
        /*for (int i=0; i<AProf.size();i++){
            System.out.println(AProf.get(i).getClv_usuario()+" "+AProf.get(i).getNivel_ads()+" "+AProf.get(i).getNombre_usuario()+" "+AProf.get(i).getNivel_ads()+" "+AProf.get(i).getContrato());
        }*/
        System.out.println("Lista de Materias");
        /*for(int i=0;i<AMat.size(); i++){
            //System.out.println(AMat.get(i).getNombre_materia()+" "+AMat.get(i).getClv_materia()+" "+AMat.get(i).get);
            Conexion con = new Conexion();
            int FA = con.Guardar("UPDATE ")
        }*/
        /*for(int i=0;i<AMat.size(); i++){}
        for(int i=0;i<AMat.size(); i++){}
        for(int i=0;i<AMat.size(); i++){}
        for(int i=0;i<AMat.size(); i++){}*/
        for(int i=0;i<AEquipo.size(); i++){
            Conexion con = new Conexion();
           /* try{
                /*PreparedStatement ps = con.getCon().prepareStatement("INSERT INTO equipo VALUES (?,?,?,?)");
                ps.setInt(1, AEquipo.get(i).getId());
                ps.setInt(2, AEquipo.get(i).getId_categoria());
                ps.setString(3,AEquipo.get(i).getNombre());
                ps.setString(4, AEquipo.get(i).getDescripcion());
                ps.executeUpdate();
            }catch (SQLException e){
                e.printStackTrace();
            }*/
        }

    }





}
