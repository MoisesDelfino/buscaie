package controller;

import model.Endereco;
import abstratas.dao;
import java.util.List;

public class daoEndereco extends dao<Endereco>{
    public List<Endereco> read(){
        String JPQL="select e from Endereco e order by e.nome";
        return super.read(JPQL); 
    }
    public List<Endereco> read(String filtro){
        String JPQL="select e from Endereco e where e.nome like ?1 order by e.nome";
        return super.read(JPQL,"%"+filtro.toUpperCase()+"%");
    }
}
