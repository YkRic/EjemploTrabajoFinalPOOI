/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jpecho
 */
public class Agenda {
    
    private int id;
    private Cliente cliente; 
    private Servicio servicio; 
    private float valor;
    private Date fecha; 
    private  String observacion;

    public Agenda(int id, Cliente cliente, Servicio servicio, String fecha) {
        this.id = id;
        this.cliente = cliente;
        this.servicio = servicio;
        
        try {
            this.fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return "Agenda{" + "id=" + id + ", cliente=" + cliente.getNombre() + ", servicio=" + servicio.getDescripcion() + ", valor=" + valor + ", fecha=" + fecha + ", observacion=" + observacion + '}';
    }
    
    
    
}
