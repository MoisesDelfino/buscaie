package controller;

import abstratas.dao;
import java.util.List;
import model.Curso;

public class daoCurso extends dao<Curso>{
    public List<Curso> read(){
        String JPQL="select c from Curso c order by c.nome";
        return super.read(JPQL); 
    }
    public List<Curso> read(String filtro){
        String JPQL="select c from Curso c where c.nome like ?1 order by c.nome";
        return super.read(JPQL,"%"+filtro.toUpperCase()+"%");
    }
 }
