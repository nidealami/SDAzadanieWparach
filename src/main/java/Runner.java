import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Runner {

    //do sprawdzenia - wzorowalam się na starych projektach
    private EntityManagerFactory managerFactory;

    private EntityManager entityManager;
    //public Runner() {openConnetion();}

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void openConnetion() {
        managerFactory = Persistence.createEntityManagerFactory("mysqlPU");
        entityManager = managerFactory.createEntityManager();
        System.out.println("Is open: " + entityManager.isOpen());

    }

    public void closeConnection() {
        entityManager.close();
        managerFactory.close();
    }
}






// ściąga do połączenia SWINGA:
//public City update(City city) {
//        manager.getTransaction().begin();
//        manager.persist(city);
//        manager.flush(); // wymuszenie zapisu
//        manager.refresh(city); // odświeżenie
//        manager.getTransaction().commit();
//        return city;
//    }
//
//    public City save(City city) {
//        manager.getTransaction().begin();
//        manager.persist(city);
//        manager.getTransaction().commit();
//        return city;



