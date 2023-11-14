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
    
    public void cargarClientes(){
        clienteDao = new  ClienteDAO();
        ArrayList<Cliente> clientes = clienteDao.selectAll();
        DefaultTableModel tableModel = (DefaultTableModel)formCliente.getTablaClientes().getModel();
        tableModel.setRowCount(0);
        for (Cliente cliente : clientes) {
            tableModel.addRow(new Object[]{
            cliente.getId(),
            cliente.getNombre(),
            cliente.getSexo(),
            cliente.getFechaNacimiento(),
            cliente.getTelefono(),
            cliente.getEmail(),
            cliente.getDni(),
            cliente.getDireccion()
            });
        }        
             
    }
    
    
    
    
}
