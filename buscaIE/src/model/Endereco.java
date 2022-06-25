package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "ENDERECOS")
public class Endereco implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    
    @Column(name = "nm_logradouro", length = 100, nullable = false)
    private String logradouro;
    
    @Column(name = "numero")
    private int numero;
    
    @ManyToOne(cascade = CascadeType.DETACH,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_bairro", nullable = false, referencedColumnName = "id")
    private Bairro bairro;

    public Endereco() {
        this.setId(0);
        this.setBairro(null);
        this.setLogradouro("Rua Jorge da Cunha");
        this.setNumero(10);
    }    

    public Endereco(int id, String logradouro, int numero, Bairro bairro) {
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
    }

    
    
    public void setId(int id) {
        this.id = id;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro.trim().isEmpty()?"SEMLOGRADOURO":logradouro.toUpperCase();
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public int getId() {
        return this.id;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public int getNumero() {
        return this.numero;
    }

    public Bairro getBairro() {
        return this.bairro;
    }

    @Override
    public String toString() {
        return "Endereco{" + "logradouro=" + logradouro + '}';
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Endereco other = (Endereco) obj;
        return this.id == other.id;
    }
    
    
    
    
}
