/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.DAO.ClienteDAO;
import view.IFrmCliente;

/**
 *
 * @author jpecho
 */
public class ClienteController {
    private final IFrmCliente formCliente;
    private ClienteDAO clienteDao;

    public ClienteController(IFrmCliente formCliente) {
        this.formCliente = formCliente;
    }
    
    public DefaultTableModel cargarCliente(){
        clienteDao = new  ClienteDAO();
        ArrayList<Cliente> clientes = clienteDao.selectAll();
        DefaultTableModel dfm = new DefaultTableModel();
        for(int i = 0; i<clientes.size(); i++ ){
            Object datos[] ={clientes.get(i).getId(),
                            clientes.get(i).getNombre(),
                            clientes.get(i).getSexo(),
                            clientes.get(i).getFechaNacimiento(),
                            clientes.get(i).getTelefono(),
                            clientes.get(i).getEmail(),
                            clientes.get(i).getDni(),
                            clientes.get(i).getDireccion()};
            
            dfm.addRow(datos);
            
        }
        return dfm;        
    }
    
    
    
    
}
