package Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class Saque {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer valorSaque;    
    @ManyToOne
    @JoinColumn(name = "saque")
    private Cliente cliente;
	


    public Integer getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(Integer valorSaque) {
        this.valorSaque = valorSaque;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

	

	

}
