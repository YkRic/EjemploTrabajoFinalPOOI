/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jpecho
 */
public class Servicio {
    private int id;
    private String descripcion; 
    private float costo;

    public Servicio(int id, String descripcion, float costo) {
        this.id = id;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Servicio{" + "id=" + id + ", descripcion=" + descripcion + ", costo=" + costo + '}';
    }
    
    
    
}
