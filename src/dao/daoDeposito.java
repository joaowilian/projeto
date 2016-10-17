
package dao;

import Model.Deposito;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class daoDeposito {
    private Session session;

    
    
    
    public void persistir(Deposito deposito){
        Transaction transaction = session.beginTransaction();
        try{
          session.persist(deposito);
          transaction.commit();
        }catch(Exception e){
          transaction.rollback();
          throw e;
        }
    }
    
    public void update(Deposito deposito){
        Transaction transaction = session.beginTransaction();
        try{
          session.update(deposito);
          transaction.commit();
        }catch(Exception e){
          transaction.rollback();
          throw e;
        }
    } 
    
  
}
    
  



