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
