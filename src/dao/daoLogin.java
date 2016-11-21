
package dao;

import Model.Cliente;
import org.hibernate.Session;

public class daoLogin extends daoCliente{
    
    public daoLogin(Session se) {
        super(se);
    }
    
    public Cliente verificarLogin (String nConta , String senha){
        Session se = getSession();
        Cliente u =
                (Cliente) se.createQuery("from Cliente u where u.nConta = :nConta and u.senha = :senha")
                .setParameter("nConta", nConta)
                .setParameter("senha", senha)
                .uniqueResult();
        return u;
    }

   
    
}
