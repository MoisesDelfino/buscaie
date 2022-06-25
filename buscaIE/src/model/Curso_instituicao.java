package model;

import enums.Turnos;
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
@Table(name = "CURSOS_INSTITUICOES")
public class Curso_instituicao implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    
    @ManyToOne(cascade = CascadeType.DETACH,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_curso", nullable = false, referencedColumnName = "id")
    private Curso curso;
    
    @ManyToOne(cascade = CascadeType.DETACH,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_instituicao", nullable = false, referencedColumnName = "id")
    private Instituicao instituicao;
    
    @Column(name = "carga_horaria")
    private int carga_horaria;
    
    @Column(name = "turno")
    private Turnos turno;
    
    @Column(name = "vagas")
    private int vagas;

    public Curso_instituicao() {
        
    }

    public Curso_instituicao(int id, Curso curso, Instituicao instituicao, int carga_horaria, Turnos turno, int vagas) {
        this.id = id;
        this.curso = curso;
        this.instituicao = instituicao;
        this.carga_horaria = carga_horaria;
        this.turno = turno;
        this.vagas = vagas;
    }
    
    
}
