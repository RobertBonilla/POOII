/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udb.clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Robert Bonilla
 */
public class Controlador {
    private Connection cn;
    DefaultComboBoxModel modeloCombobox;
    private Rol rol;
    private Estado estado;
    private Facultad facultad;
    private Escuela escuela;
    private Combobox combobox;
    /*Listas*/
    private List<Rol> listRol;
    private List<Estado> listEstado;
    private List<Facultad> listFacultad;
    private List<Escuela> listEscuela;
    private List<Combobox> listCombo;
     private String sql;
    /*Iniciando Consultas*/    
   
    public Controlador(){
         this.cn = new Conexion().getCon();
    }

    public Connection getCn() {
        return cn;
    }
    
     public boolean cosultaCombo(String tabla){
        boolean resp = false;
        try{
            Statement cmd = this.cn.createStatement();
            ResultSet rs =cmd.executeQuery("SELECT * FROM "+tabla);
            this.listCombo = new ArrayList<>();
            while(rs.next()){
                //Lenguaje temp = new Lenguaje(rs.getInt(1), rs.getString(2),rs.getString(3));
                //this.listData.add(temp);
               this.listCombo.add(new Combobox(rs.getInt(1),rs.getString(2)));
               modeloCombobox.addElement(new Combobox(rs.getInt(1),rs.getString(2)));
            }
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
            resp=true;
        }
        catch(Exception e){
        System.err.println("Error" + e.getMessage());
        }
        return resp;
        }
     
     public boolean guardarRol()
    {
        boolean resp = false;
        try 
        {
            sql = "INSERT INTO roles (nombre) Values(?)";
            PreparedStatement cmd = this.cn.prepareStatement(sql);
            cmd.setString(1, this.rol.getNombre());
            cmd.executeUpdate();
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
            resp = true;
        } 
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return resp;
    }
     
     
     public boolean modificarRol()
    {
        boolean resp = false;
        try 
        {
            sql = "update roles set nombre = ? where id = ?";
            PreparedStatement cmd = this.cn.prepareStatement(sql);
            cmd.setString(1, this.rol.getNombre());
            cmd.setInt(2, this.rol.getId());
            cmd.executeUpdate();
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
            resp = true;
        } 
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return resp;
    }
    public boolean cosultarRol(){
        boolean resp = false;
        try{
            Statement cmd = this.cn.createStatement();
            ResultSet rs =cmd.executeQuery("SELECT r.id,r.nombre from roles r");
            this.listRol = new ArrayList<>();
            while(rs.next()){
               this.listRol.add(new Rol(rs.getInt(1),rs.getString(2)));
            }
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
            resp=true;
        }
        catch(Exception e){
        System.err.println("Error" + e.getMessage());
        }
        return resp;
        }
     
    public boolean eliminarRol()
    {
        boolean resp = false;
        try 
        {
            sql = "Delete From roles  where id = ? ";
            PreparedStatement cmd = this.cn.prepareStatement(sql);
            cmd.setInt(1, this.rol.getId());
            cmd.executeUpdate();
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
            resp = true;
        } 
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return resp;
    }
    
    public boolean guardarFacultad()
    {
        boolean resp = false;
        try 
        {
            sql = "INSERT INTO facultad (nombre) Values(?)";
            PreparedStatement cmd = this.cn.prepareStatement(sql);
            cmd.setString(1, this.facultad.getNombre());
            cmd.executeUpdate();
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
            resp = true;
        } 
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return resp;
    }
    
    public boolean modificarFacultad()
    {
        boolean resp = false;
        try 
        {
            sql = "update facultad set nombre = ? where id = ?";
            PreparedStatement cmd = this.cn.prepareStatement(sql);
            cmd.setString(1, this.facultad.getNombre());
            cmd.setInt(2, this.facultad.getId());
            cmd.executeUpdate();
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
            resp = true;
        } 
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return resp;
    }
    
    public boolean cosultarFacultad(){
        boolean resp = false;
        try{
            Statement cmd = this.cn.createStatement();
            ResultSet rs =cmd.executeQuery("SELECT f.id,f.nombre from facultad f");
            this.listFacultad = new ArrayList<>();
            while(rs.next()){
               this.listFacultad.add(new Facultad(rs.getInt(1),rs.getString(2)));
            }
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
            resp=true;
        }
        catch(Exception e){
        System.err.println("Error" + e.getMessage());
        }
        return resp;
        }
     
     public boolean eliminarFacultad()
    {
        boolean resp = false;
        try 
        {
            sql = "Delete From facultad  where id = ? ";
            PreparedStatement cmd = this.cn.prepareStatement(sql);
            cmd.setInt(1, this.facultad.getId());
            cmd.executeUpdate();
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
            resp = true;
        } 
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return resp;
    }
    public boolean guardarEstado()
    {
        boolean resp = false;
        try 
        {
            sql = "INSERT INTO estado (nombre) Values(?)";
            PreparedStatement cmd = this.cn.prepareStatement(sql);
            cmd.setString(1, this.estado.getNombre());
            cmd.executeUpdate();
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
            resp = true;
        } 
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return resp;
    }
    
    public boolean modificarEstado()
    {
        boolean resp = false;
        try 
        {
            sql = "update estado set nombre = ? where id = ?";
            PreparedStatement cmd = this.cn.prepareStatement(sql);
            cmd.setString(1, this.estado.getNombre());
            cmd.setInt(2, this.estado.getId());
            cmd.executeUpdate();
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
            resp = true;
        } 
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return resp;
    }
    
    public boolean cosultarEstado(){
        boolean resp = false;
        try{
            Statement cmd = this.cn.createStatement();
            ResultSet rs =cmd.executeQuery("SELECT e.id,e.nombre from estado");
            this.listEstado = new ArrayList<>();
            while(rs.next()){
               this.listEstado.add(new Estado(rs.getInt(1),rs.getString(2)));
            }
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
            resp=true;
        }
        catch(Exception e){
        System.err.println("Error" + e.getMessage());
        }
        return resp;
        }
    
     public boolean eliminarEstado()
    {
        boolean resp = false;
        try 
        {
            sql = "Delete From estado  where id = ? ";
            PreparedStatement cmd = this.cn.prepareStatement(sql);
            cmd.setInt(1, this.estado.getId());
            cmd.executeUpdate();
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
            resp = true;
        } 
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return resp;
    }
    
    public boolean guardarEscuela()
    {
        boolean resp = false;
        try 
        {
            sql = "INSERT INTO escuelas (nombre,facultad) Values(?,?)";
            PreparedStatement cmd = this.cn.prepareStatement(sql);
            cmd.setString(1, this.escuela.getNombre());
            cmd.setInt(2, this.escuela.getId_facultad());
            cmd.executeUpdate();
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
            resp = true;
        } 
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return resp;
    }
    
    public boolean modificarEscuela()
    {
        boolean resp = false;
        try 
        {
            sql = "update escuelas set nombre = ?,facultad = ? where id = ?";
            PreparedStatement cmd = this.cn.prepareStatement(sql);
            cmd.setString(1, this.escuela.getNombre());
            cmd.setInt(2, this.escuela.getId_facultad());
            cmd.setInt(3, this.escuela.getId());
            cmd.executeUpdate();
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
            resp = true;
        } 
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return resp;
    }
    
    public boolean cosultarEscuela(){
        boolean resp = false;
        try{
            Statement cmd = this.cn.createStatement();
            ResultSet rs =cmd.executeQuery("SELECT e.id,e.nombre,e.facultad from escuelas");
            this.listEscuela = new ArrayList<>();
            while(rs.next()){
               this.listEscuela.add(new Escuela(rs.getInt(1),rs.getString(2),rs.getInt(3)));
            }
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
            resp=true;
        }
        catch(Exception e){
        System.err.println("Error" + e.getMessage());
        }
        return resp;
        }
     public boolean eliminarEscuela()
    {
        boolean resp = false;
        try 
        {
            sql = "Delete From escuelas  where id = ? ";
            PreparedStatement cmd = this.cn.prepareStatement(sql);
            cmd.setInt(1, this.escuela.getId());
            cmd.executeUpdate();
            if(!this.cn.isClosed())
            {
                this.cn.close();
            }
            resp = true;
        } 
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return resp;
    }
    
}
