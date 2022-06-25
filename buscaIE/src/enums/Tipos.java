
package enums;

public enum Tipos {
    PU("Público"),
    PR("Privado");
    //
    private String descricao;
    //alt+ins
    private Tipos(String descricao) {
        this.descricao = descricao;
    }
    //
    @Override
    public String toString(){
        return descricao;
    }
}
