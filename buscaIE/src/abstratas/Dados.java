package abstratas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

abstract public class Dados {
    private static EntityManager manager = null;
    //
    public static EntityManager getManager(){
        if (manager == null) {
            //Localização do arquivo de configuração
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.senac_buscaiePU");
            //Criar sessão para persistir objetos
            manager = factory.createEntityManager();
        }
        return manager;
    }
}
