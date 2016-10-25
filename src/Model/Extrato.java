package Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "extrato")
public class Extrato {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private float Quantia;
    private int dias;
    private Date data;
    @ManyToOne
    @JoinColumn(name = "Extrato")
    private Cliente cliente;

  
    
  

	public int Movimentacao(int Dias) {
		return 0;
	}

	public void Imprimir() {
            

	}

	public void SetQuantia(float Quantia) {
            this.Quantia = Quantia;
	}

	public void SetData(Date Data) {
            this.data = Data;
	}

	public void SetDias(int Dias) {
            this.dias = Dias;
	}

	public float GetQuantia() {
		return Quantia;
	}

	public Date GetData() {
		return data;
	}

	public int GetDias() {
		return dias;
	}

	public Extrato(Conta conta) {

	}

}
