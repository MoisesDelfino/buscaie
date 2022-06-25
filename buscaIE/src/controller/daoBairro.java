package controller;

import model.Bairro;
import abstratas.dao;
import java.util.List;

public class daoBairro extends dao<Bairro>{
    public List<Bairro> read(){
        String JPQL="select b from Bairro b order by b.nome";
        return super.read(JPQL); 
    }
    public List<Bairro> read(String filtro){
        String JPQL="select b from Bairro b where b.nome like ?1 order by b.nome";
        return super.read(JPQL,"%"+filtro.toUpperCase()+"%");
    }
}
