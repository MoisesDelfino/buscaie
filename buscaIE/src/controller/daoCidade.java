package controller;

import abstratas.dao;
import java.util.List;
import model.Cidade;

public class daoCidade extends dao<Cidade>{
    public List<Cidade> read(){
        String JPQL="select c from Cidade c order by c.nome";
        return super.read(JPQL); 
    }
    public List<Cidade> read(String filtro){
        String JPQL="select c from Cidade c where c.nome like ?1 order by c.nome";
        return super.read(JPQL,"%"+filtro.toUpperCase()+"%");
    }
}
