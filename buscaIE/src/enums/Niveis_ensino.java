package enums;

public enum Niveis_ensino {
    EB("Educação Básica"),
    ES("Ensino Superior");
    //
    private String descricao;
    //alt+ins
    private Niveis_ensino(String descricao) {
        this.descricao = descricao;
    }
    //
    @Override
    public String toString(){
        return descricao;
    }
}
