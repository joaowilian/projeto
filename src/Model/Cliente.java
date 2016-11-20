package Model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    //private long idconta; // numero da conta
    private String nome;
    private String telefone;
       
    @OneToMany(mappedBy = "cliente",cascade = CascadeType.ALL,orphanRemoval = true)    
    private List<Cliente> cliente = new ArrayList<>();
        

    public boolean Autenticar() {
	return false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

 

 
   

    
/*
    public long getIdconta() {
        return idconta;
    }

    public void setIdconta(long idconta) {
        this.idconta = idconta;
    }

 
    public void setIdconta(int idconta) {
        this.idconta = idconta;
    }
*/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }



    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


}
