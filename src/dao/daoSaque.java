
package dao;

import Model.Cliente;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class daoSaque extends daoCliente{
         private Session session;
    
     public daoSaque(Session session) {
        super(session);
    }
    
    public void persistir(Cliente conta){
        Transaction transaction = session.beginTransaction();
        try{
          session.persist(conta);
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
    Model.Cliente conta = (Model.Cliente) session.load(Model.Cliente.class, id);
    return conta;
  }
  
  public List<Cliente> list() {
    Transaction transaction = session.beginTransaction();
    try{
      List<Cliente> lista = session.createQuery("from Contato").list();
      transaction.commit();
      return lista;
    }catch(Exception e){
      transaction.rollback();
      throw e;
    }
    }
  
  public Cliente verificaLogin (String login,String senha){
      Cliente u =
              (Cliente) session.createQuery("from cliente u where u.nconta = :login and u.senha = :senha")
              .setParameter("nconta", login)
              .setParameter("senha", senha)
              .uniqueResult();
      return u;
      
  }
  
  
}
