/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.Cliente;
//import Model.Conta;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author joao
 */
public class daoCliente {
    private Session session;
     
     public daoCliente(Session session) {
        this.session = session;
    }
    
    public void persistir(Cliente cliente){
        Transaction transaction = session.beginTransaction();
        try{
          session.persist(cliente);
          transaction.commit();
        }catch(Exception e){
          transaction.rollback();
          throw e;
           
        }
    }
    
    public void update(Cliente contato){
        Transaction transaction = session.beginTransaction();
        try{
          session.update(contato);
          transaction.commit();
        }catch(Exception e){
          transaction.rollback();
          throw e;
        }
    } 
    
    public void delete(Cliente contato){
        Transaction transaction = session.beginTransaction();
        try{
          session.delete(contato);
          transaction.commit();
        }catch(Exception e){
          transaction.rollback();
          throw e;
        }
    }
    
  
  public Cliente getById(Integer id) {
    Model.Cliente cli = (Model.Cliente) session.load(Model.Cliente.class, id);
    return cli;
  }
  
  public List<Cliente> list() {
    Transaction transaction = session.beginTransaction();
    try{
      List<Cliente> lista = session.createQuery("from Cliente").list();
      transaction.commit();
      return lista;
    }catch(Exception e){
      transaction.rollback();
      throw e;
    }
  }
}
