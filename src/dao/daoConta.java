
package dao;

import Model.Conta;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author joao
 */
public class daoConta {
     private Session session;
     public daoConta(Session session) {
        this.session = session;
    }
    
    public void persistir(Conta conta){
        Transaction transaction = session.beginTransaction();
        try{
          session.persist(conta);
          transaction.commit();
        }catch(Exception e){
          transaction.rollback();
          throw e;
        }
    }
    
    public void update(Conta contato){
        Transaction transaction = session.beginTransaction();
        try{
          session.update(contato);
          transaction.commit();
        }catch(Exception e){
          transaction.rollback();
          throw e;
        }
    } 
    
    public void delete(Conta contato){
        Transaction transaction = session.beginTransaction();
        try{
          session.delete(contato);
          transaction.commit();
        }catch(Exception e){
          transaction.rollback();
          throw e;
        }
    }
    
  
  public Conta getById(Integer id) {
    Model.Conta conta = (Model.Conta) session.load(Model.Conta.class, id);
    return conta;
  }
  
  public List<Conta> list() {
    Transaction transaction = session.beginTransaction();
    try{
      List<Conta> lista = session.createQuery("from Contato").list();
      transaction.commit();
      return lista;
    }catch(Exception e){
      transaction.rollback();
      throw e;
    }
  }
  
}
