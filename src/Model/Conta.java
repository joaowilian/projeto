package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "conta")

public class Conta {   
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Integer idConta;
    @ManyToOne
    @JoinColumn(name = "idconta")    
    private Conta conta;
   
   

	public Conta buscarPorId(int id) {
		return conta;
	}

}
