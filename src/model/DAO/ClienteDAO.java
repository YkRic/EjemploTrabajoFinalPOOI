/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author jpecho
 */
public class ClienteDAO {
    
    /*Retorna todos los clientes de la base de datos*/
    public ArrayList<Cliente> selectAll(){
        return Base.clientes; 
    }
    
     
    
         
}
