/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udb.clases;

/**
 *
 * @author Robert Bonilla
 */
public class Institucion {
    int id;
    String nombre;
    String direccion;
    String contacto1;
    String telefono1;
    String contacto2;
    String telefono2;

    public Institucion() {
    }

    public Institucion(int id, String nombre, String direccion, String contacto1, String telefono1) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto1 = contacto1;
        this.telefono1 = telefono1;
    }

    public Institucion(int id, String nombre, String direccion, String contacto1, String telefono1, String contacto2, String telefono2) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto1 = contacto1;
        this.telefono1 = telefono1;
        this.contacto2 = contacto2;
        this.telefono2 = telefono2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContacto1() {
        return contacto1;
    }

    public void setContacto1(String contacto1) {
        this.contacto1 = contacto1;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getContacto2() {
        return contacto2;
    }

    public void setContacto2(String contacto2) {
        this.contacto2 = contacto2;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }
    
    
}
