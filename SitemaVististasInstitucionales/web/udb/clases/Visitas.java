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
public class Visitas {
    int id_usuario;
    int id_institucion;
    int id_usuarioAsigno;
    String fechaInicio;
    String fechaFin;
    boolean visitaRealizada;
    int id_estado;
    String comentarios;

    public Visitas(int id_usuario, int id_institucion, int id_usuarioAsigno, String fechaInicio, String fechaFin, boolean visitaRealizada, int id_estado, String comentarios) {
        this.id_usuario = id_usuario;
        this.id_institucion = id_institucion;
        this.id_usuarioAsigno = id_usuarioAsigno;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.visitaRealizada = visitaRealizada;
        this.id_estado = id_estado;
        this.comentarios = comentarios;
    }

    public Visitas() {
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_institucion() {
        return id_institucion;
    }

    public void setId_institucion(int id_institucion) {
        this.id_institucion = id_institucion;
    }

    public int getId_usuarioAsigno() {
        return id_usuarioAsigno;
    }

    public void setId_usuarioAsigno(int id_usuarioAsigno) {
        this.id_usuarioAsigno = id_usuarioAsigno;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean isVisitaRealizada() {
        return visitaRealizada;
    }

    public void setVisitaRealizada(boolean visitaRealizada) {
        this.visitaRealizada = visitaRealizada;
    }

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    
    
    
}
