package model;

import enums.Estados;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "CIDADES")
public class Cidade implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "estado", length = 2, nullable = false)
    private Estados estado;

    public Cidade() {
        this.setId(0);
        this.setNome("SEMNOME");
        this.setEstado(Estados.AC);
    }

    public Cidade(int id, String nome, Estados estado) {
        this.setId(id);
        this.setNome(nome);
        this.setEstado(estado);
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public Estados getEstado() {
        return this.estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cidade{" + "nome=" + nome + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
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
        final Cidade other = (Cidade) obj;
        return this.id == other.id;
    }
    
    
    
    
}
