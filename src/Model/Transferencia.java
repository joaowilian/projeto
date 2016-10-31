package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Tranferencia")
public class Transferencia {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)    
        private Cliente cliente;
	private float ValorTrans;
	private int ContaTrans;

        @ManyToOne
        @JoinColumn(name = "Transferencia")

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getValorTrans() {
        return ValorTrans;
    }

    public void setValorTrans(float ValorTrans) {
        this.ValorTrans = ValorTrans;
    }

    public int getContaTrans() {
        return ContaTrans;
    }

    public void setContaTrans(int ContaTrans) {
        this.ContaTrans = ContaTrans;
    }
       
	

}
