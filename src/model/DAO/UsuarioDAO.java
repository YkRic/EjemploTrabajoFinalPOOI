/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import model.Usuario;



/**
 *
 * @author jpecho
 */
public class UsuarioDAO {
    
    public void insertar(Usuario usuario){
        Base.usuarios.add(usuario);
    }
    
    public Usuario seleccionaPorNombreContrasena(Usuario usuario){
        for(Usuario usuario_bd: Base.usuarios){
            if(usuario_bd.getNombre().equals(usuario.getNombre()) && usuario_bd.getContrasena().equals(usuario.getContrasena())){
                return usuario_bd;
            }
        }
         return null;
    }
}
