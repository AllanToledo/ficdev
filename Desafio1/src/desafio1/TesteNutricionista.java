package desafio1;

//@author Allan Toledo

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TesteNutricionista {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Desafio1PU");
        EntityManager em = factory.createEntityManager();
        
        Nutricionista nutri = new Nutricionista();
        nutri.setNome("Rafaela Cardoso");
        nutri.setCrn("1234567890");
        nutri.setUf("MT");
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(nutri);
        tx.commit();
        em.close();
        factory.close();
        
    }
}
