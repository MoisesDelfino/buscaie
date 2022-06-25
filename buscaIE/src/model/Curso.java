package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CURSOS")
public class Curso implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;
    
    @Column(name = "descricao", length = 100, nullable = false)
    private String descricao;

    public Curso() {
        this.setId(0);
        this.setNome("SEMNOME");
        this.setDescricao("SEMDESCRICAO");
    }

    public Curso(int id, String nome, String descricao) {
        this.setId(id);
        this.setNome(nome);
        this.setDescricao(descricao);
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty()?"SEMNOME":nome.toUpperCase();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao.trim().isEmpty()?"SEMDESCRICAO":descricao.toUpperCase();
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.id;
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
        final Curso other = (Curso) obj;
        return this.id == other.id;
    }
    
    
    
    
    
}
