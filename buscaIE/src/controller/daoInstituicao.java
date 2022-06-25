package controller;

import abstratas.dao;
import enums.Tipos;
import java.util.List;
import model.Instituicao;

public class daoInstituicao extends dao<Instituicao>{
    public List<Instituicao> read(){
        String JPQL="select i from Instituicao i order by i.nome";
        return super.read(JPQL); 
    }
    public List<Instituicao> read(String filtro){
        String JPQL="select i from Instituicao i where i.nome like ?1 order by i.nome";
        return super.read(JPQL,"%"+filtro.toUpperCase()+"%");
    }
    public List<Instituicao> read(Tipos tipo){
        String JPQL="select i from Instituicao i where i.tipo = ?1 order by i.nome";
        return super.read(JPQL, tipo);
    }
}
