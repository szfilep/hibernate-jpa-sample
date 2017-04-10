package hu.bme;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by szfilep.
 */
public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("myPU");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        List<Person> personList = createPersons(em);
        System.out.println("Person count: " + personList.size());

        em.getTransaction().commit();
        em.close();
        emf.close();


    }

    public static List<Person> createPersons(EntityManager em) {
        Country country = new Country(1L, "Hungary");
        em.persist(country);

        Person person = new Person(1L, "Pista", 32, country);
        em.persist(person);

        List<Person> resultList = em.createQuery("SELECT p FROM Person p", Person.class).getResultList();

        return resultList;
    }

}
