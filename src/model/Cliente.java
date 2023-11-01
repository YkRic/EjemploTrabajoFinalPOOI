/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jpecho
 */
public class Cliente extends Persona{    
  
    private String direccion;

    public Cliente(int id, String nombre) {
       super(id,nombre);
    }

    public Cliente(String direccion, int id, String nombre, char sexo, String fechaNacimiento, String telefono, String email, String dni) {
        super(id, nombre, sexo, fechaNacimiento, telefono, email, dni);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", email=" + email + ", dni=" + dni + ", direccion=" + direccion + '}';
    }
    
}
