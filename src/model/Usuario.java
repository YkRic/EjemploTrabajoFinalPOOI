/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author jpecho
 */
public class Usuario extends Persona{
   
    private String contrasena;
    private String nivelAcceso;

    public Usuario(int id, String nombre, String contrasena, String nivelAcceso) {
        super(id, nombre);
        this.contrasena = contrasena;
        this.nivelAcceso = nivelAcceso;
    }

    public Usuario(int id, String nombre, char sexo, String fechaNacimiento, String telefono, String email, String dni, String contrasena, String nivelAcceso) {
        super(id, nombre, sexo, fechaNacimiento, telefono, email, dni);
        this.contrasena = contrasena;
        this.nivelAcceso = nivelAcceso;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getNivelAcceso() {
        return nivelAcceso;
    }    

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setNivelAcceso(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", email=" + email + ", dni=" + dni + ", contrasena=" + contrasena + ", nivelAcceso=" + nivelAcceso + '}';
    }
    
    
}
