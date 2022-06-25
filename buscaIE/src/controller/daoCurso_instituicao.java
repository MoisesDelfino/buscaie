package controller;

import abstratas.dao;
import java.util.List;
import model.Curso_instituicao;

public class daoCurso_instituicao extends dao<Curso_instituicao>{
    public List<Curso_instituicao> read(){
        String JPQL="select c from Curso_instituicao c order by c.nome";
        return super.read(JPQL); 
    }
    public List<Curso_instituicao> read(String filtro){
        String JPQL="select c from Curso c where c.nome like ?1 order by c.nome";
        return super.read(JPQL,"%"+filtro.toUpperCase()+"%");
    }
}
