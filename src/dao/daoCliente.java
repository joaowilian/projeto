/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.Cliente;
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
     
     public daoCliente(Session se) {
        this.session = se;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
    
    public void persistir(Cliente cliente){
        Transaction tr = session.beginTransaction();
        try{
          session.persist(cliente);
          tr.commit();
        }catch(Exception e){
          tr.rollback();
          throw e;
           
        }
    }
    
    public void salvar(Cliente contato){
        Transaction tr = session.beginTransaction();
        try{
          session.saveOrUpdate(contato);
          tr.commit();
          
        }catch(Exception e){
          tr.rollback();
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
    
  
  public Cliente getById(long id) {
    Model.Cliente cli = (Model.Cliente) session.load(Model.Cliente.class, id);      
    return cli;
  }
  
  public List<Cliente> lendo(){
      Transaction tr = session.beginTransaction();
      
  
      try {
          List<Cliente> l = session.createQuery("from Cliente").list();
          tr.commit();
          return  l;
      } catch (Exception e) {
          tr.rollback();
          throw e;
         
      }
      
}
  

}
