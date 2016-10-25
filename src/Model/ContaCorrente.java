package Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ContaCorrente extends Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idContaCorrente;
    
    private Deposito depositos[];

    private Saque saques[];
    
    @ManyToOne
    @JoinColumn(name = "idContaCorrente")
    private Cliente cliente;

    public Integer getIdContaCorrente() {
        return idContaCorrente;
    }

    public void setIdContaCorrente(Integer idContaCorrente) {
        this.idContaCorrente = idContaCorrente;
    }

    public Deposito[] getDepositos() {
        return depositos;
    }

    public void setDepositos(Deposito[] depositos) {
        this.depositos = depositos;
    }

    public Saque[] getSaques() {
        return saques;
    }

    public void setSaques(Saque[] saques) {
        this.saques = saques;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
	


}
