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
        Cliente cliente1 = new Cliente( 1 ,"Juan Carlos Hurtado", 'M',"30/01/1999", "965895869", "juancarlos@gmail.com", "8751545", "Avenida dos de diciembre SN");
        Cliente cliente2 = new Cliente( 2 ,"Cesar Gomez", 'M',"30/12/2003", "986596859", "cesargomez@gmail.com", "897689598", "Avenida los angeles 5665");
        Cliente cliente3 = new Cliente( 3 ,"Maria Salazar Contreras", 'F',"23/04/2001", "9875487484", "mariasalazar@gmail.com", "4154556", "Avenida santa maria 4574");
        

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
    
    }
}
