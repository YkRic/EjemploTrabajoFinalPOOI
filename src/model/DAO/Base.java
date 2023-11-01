/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import java.util.ArrayList;
import model.Agenda;
import model.Cliente;
import model.Servicio;
import model.Usuario;

/**
 *
 * @author jpecho
 */
public class Base {
    
    public static ArrayList<Usuario> usuarios;
    public static ArrayList<Cliente> clientes; 
    public static ArrayList<Servicio> servicios; 
    public static ArrayList<Agenda> agendas; 
    
    public static void inicia(){
        
        usuarios = new ArrayList<>();
        clientes  = new ArrayList<>();
        servicios = new ArrayList<>();
        agendas  = new ArrayList<>();
        
        Usuario usuario1 = new Usuario(1, "barbero", 'M', "09/05/1996", "30254645", "barbero@gmail.com", "656565656", "barbero", "administrador");
        Usuario usuario2 = new Usuario(2, "practicante", 'M', "09/05/1996", "58756866", "practicante@gmail.com", "899683368", "practicante", "practicante");
        
        usuarios.add(usuario1);
        usuarios.add(usuario2);
    
    }
}
