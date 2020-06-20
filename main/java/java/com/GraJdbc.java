package SDAzadanieWparach.main.java.java.com;


public class GraJdbc {

    //do sprawdzenia - wzorowalam się na starych projektach
    private EntityManagerFactory managerFactory;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    private EntityManager entityManager;

    public void openConnetion() {
        managerFactory = Persistence.createEntityManagerFactory("mySQL");
        entityManager = managerFactory.createEntityManager();
        System.out.println("Is open: " + entityManager.isOpen());

    }

    public void closeConnection() {

    }
entityManager.close();
managerFactory.close();

}
