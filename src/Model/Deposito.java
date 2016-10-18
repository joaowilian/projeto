package Model;

import java.util.Date;

public class Deposito {

	private float Valor;

	private Date Data;
       // private Conta conta;

	private Deposito deposito;

	public void Depositar(float Valor) {

	}

	public void setValor(float Valor) {
            this.Valor = Valor;
	}

	public void setData(Date Data) {
            this.Data = Data;
	}

	public void setConta(int conta) {
           // this.conta = conta;

	}

	public float getValor() {
		return 0;
	}

	public Date getData() {
		return null;
	}

	public int getConta() {
		return 0;
	}

}
