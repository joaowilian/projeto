package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ContaPoupanca")
public class ContaPoupanca extends Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idContaPoupanca;
    
    private Deposito depositos[];

    private Saque saques[];
    
    @ManyToOne
    @JoinColumn(name = "idContaCorrente")
    private Cliente cliente;
   

    public Integer getIdContaPoupanca() {
        return idContaPoupanca;
    }

    public void setIdContaPoupanca(Integer idContaPoupanca) {
        this.idContaPoupanca = idContaPoupanca;
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
