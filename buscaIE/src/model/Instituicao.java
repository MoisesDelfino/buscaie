package model;

import enums.Niveis_ensino;
import enums.Tipos;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "INSTITUICOES")
public class Instituicao implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    
    @Column(name = "cnpj", nullable = false)
    private Long cnpj;
    
    @Column(name = "nm_instituicao", length = 100, nullable = false)
    private String nome;
    
    @Column(name = "telefone", length = 20, nullable = false)
    private String telefone;
    
    @Column(name = "email", length = 200, nullable = false)
    private String email;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", length = 2, nullable = false)
    private Niveis_ensino nivel_ensino;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", length = 2, nullable = false)
    private Tipos tipo;
    
    @ManyToOne(cascade = CascadeType.DETACH,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_endereco", nullable = false, referencedColumnName = "id")
    private Endereco endereco;

    public Instituicao() {
        this.setCnpj(123456789101112L);
    }

    public Instituicao(int id, long cnpj, String nome, String telefone, String email, Niveis_ensino nivel_ensino, Tipos tipo, Endereco endereco) {
        this.id = id;
        this.cnpj = cnpj;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.nivel_ensino = nivel_ensino;
        this.tipo = tipo;
        this.endereco = endereco;
    }

    public int getId() {
        return this.id;
    }

    public long getCnpj() {
        return this.cnpj;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public Niveis_ensino getNivel_ensino() {
        return this.nivel_ensino;
    }

    public Tipos getTipo() {
        return this.tipo;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    
    
    public void setId(int id) {
        this.id = id;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty()?"SEMNOME":nome.toUpperCase();
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone.trim().isEmpty()?"SEMTELEFONE":telefone.toUpperCase();
    }

    public void setEmail(String email) {
        this.email = email.trim().isEmpty()?"SEMEMAIL":email.toUpperCase();
    }

    public void setNivel_ensino(Niveis_ensino nivel_ensino) {
        this.nivel_ensino = nivel_ensino;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id;
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
        final Instituicao other = (Instituicao) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Instituicao{" + "nome=" + nome + '}';
    }


    
    
    
    
}
