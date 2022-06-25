package abstratas;

import java.util.List;
import javax.persistence.Query;

public class dao<T> {
    public void create(T objeto) {
        Dados.getManager().getTransaction().begin();
        Dados.getManager().persist(objeto);
        Dados.getManager().getTransaction().commit();
    }
    public void update(T objeto) {
        Dados.getManager().getTransaction().begin();
        Dados.getManager().merge(objeto);
        Dados.getManager().getTransaction().commit();
    }
    public void delete(T objeto) {
        Dados.getManager().getTransaction().begin();
        Dados.getManager().remove(objeto);
        Dados.getManager().getTransaction().commit();
    }
    public T read(Class<T> classToReturn, int id){
        return Dados.getManager().find(classToReturn, id);
    }
    public List<T> read(String JPQL, Object... args){
        Query query = Dados.getManager().createQuery(JPQL);
        for(int i = 0; i < args.length; i++){
            query.setParameter((i + 1), args[i]);
        }
        return query.getResultList();
    }
}
