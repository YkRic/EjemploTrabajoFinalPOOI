/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.DAO.UsuarioDAO;
import view.Login;
import model.Usuario;
/**
 *
 * @author jpecho
 */
public class LoginController {
    private final Login formLogin;   
    private UsuarioDAO userDao;
    
    public LoginController(Login view) {
        this.formLogin = view;
    }

    public Usuario loginSistema(Usuario usuario){
       Usuario u;
       userDao = new UsuarioDAO();
       u = userDao.seleccionaPorNombreContrasena(usuario);
       
        if(u != null){
           return u; 
       }
       return null; 
    }
    
    
}
