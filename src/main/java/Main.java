import java.util.List;

public class Main {
    public static void main(String[] args) {
        //nawiązanie do hibernate podobnie jak bylo na ostatnich zajeciach
        //start
        //stop
        //userInterfaceService
        //zobaczListeDruzyn funkcjonalnosc
        //zobaczTurieje funkcjonalnosc
        //zobaczListeSedziow
        //wszystkie funkcjonalnosci typu dodaj/usun ktore
//czy to będzie okej??? :
        Runner connection = new Runner();
        connection.openConnetion();

        Sedziowie sedzia1 = new Sedziowie();
        sedzia1.setSedzia_imie("Megan");
        sedzia1.setNazwisko("Bum");

        Sedziowie sedzia2 = new Sedziowie();
        sedzia2.setSedzia_imie("Robert");
        sedzia2.setNazwisko("Cmyk");

        Sedziowie sedzia3 = new Sedziowie();
        sedzia3.setSedzia_imie("Franek");
        sedzia3.setNazwisko("Kolanko");

        Sedziowie sedzia4 = new Sedziowie();
        sedzia4.setSedzia_imie("Edmund");
        sedzia4.setNazwisko("Kwas");
//        List<Sedziowie> sedziowie = connection.findSedzia("new");
//        sedziowie.forEach(System.out::println);
        Druzyny druzyna1 = new Druzyny();
        druzyna1.setNazwaDruzyny("piraci");
        druzyna1.setDyscyplina(Dyscyplina.SIATKOWKA);
        druzyna1.setDyscyplina(Dyscyplina.DWA_OGNIE);
        druzyna1.setDyscyplina(Dyscyplina.PRZECIAGANIE_LINY);
        Druzyny druzyna2 = new Druzyny();
        druzyna2.setNazwaDruzyny("chlopakiZpaki");
        druzyna2.setDyscyplina(Dyscyplina.SIATKOWKA);
        druzyna2.setDyscyplina(Dyscyplina.DWA_OGNIE);
        druzyna2.setDyscyplina(Dyscyplina.PRZECIAGANIE_LINY);
        Druzyny druzyna3 = new Druzyny();
        druzyna3.setNazwaDruzyny("tygryski");
        druzyna3.setDyscyplina(Dyscyplina.SIATKOWKA);
        druzyna3.setDyscyplina(Dyscyplina.DWA_OGNIE);
        druzyna3.setDyscyplina(Dyscyplina.PRZECIAGANIE_LINY);
        Druzyny druzyna4 = new Druzyny();
        druzyna4.setNazwaDruzyny("puchatki");
        druzyna4.setDyscyplina(Dyscyplina.SIATKOWKA);
        druzyna4.setDyscyplina(Dyscyplina.DWA_OGNIE);
        druzyna4.setDyscyplina(Dyscyplina.PRZECIAGANIE_LINY);//
        // Druzyny druzyna5 = new Druzyny();
//        druzyna5.setNazwaDruzyny("gwiazdaPolnocy");
//        druzyna5.setDyscyplina(Dyscyplina.SIATKOWKA);
//        druzyna5.setDyscyplina(Dyscyplina.DWA_OGNIE);
//        druzyna5.setDyscyplina(Dyscyplina.PRZECIAGANIE_LINY);
        Mecz mecz1 = new Mecz();
        mecz1.setDruzyna(druzyna1);
        mecz1.setDruzyna(druzyna2);
        mecz1.setDyscyplina(Dyscyplina.SIATKOWKA);
        mecz1.setDyscyplina(Dyscyplina.DWA_OGNIE);
        mecz1.setDyscyplina(Dyscyplina.PRZECIAGANIE_LINY);
        mecz1.setSedziowie(sedzia1);
//        mecz1.setZwyciesca(druzyna1);
        mecz1.setWynik("2:1");
        Mecz mecz2 = new Mecz();
        mecz2.setDruzyna(druzyna3);
        mecz2.setDruzyna(druzyna4);
        mecz2.setDyscyplina(Dyscyplina.SIATKOWKA);
        mecz2.setDyscyplina(Dyscyplina.DWA_OGNIE);
        mecz2.setDyscyplina(Dyscyplina.PRZECIAGANIE_LINY);
        mecz2.setSedziowie(sedzia1);
//        mecz2.setZwyciesca(druzyna4);
        mecz2.setWynik("2:5");
        connection.getEntityManager().getTransaction().begin();
        connection.getEntityManager().persist(sedzia1);
        connection.getEntityManager().persist(sedzia2);
        connection.getEntityManager().persist(sedzia3);
        connection.getEntityManager().persist(druzyna1);
        connection.getEntityManager().persist(druzyna2);
        connection.getEntityManager().persist(mecz1);
        connection.getEntityManager().persist(druzyna3);
        connection.getEntityManager().persist(druzyna4);
        connection.getEntityManager().persist(mecz2);
        connection.getEntityManager().getTransaction().commit();
        connection.closeConnection();
        //connection.closeConnection() czy jednak lepiej connection.stop();?

    }
}
//to będzie potrzebne do połączenia: private List<Mecz> matches = new LinkedList<>();
//jakiś pomysł na bazę:
//CREATE TABLE IF NOT EXISTS `sedziowie` (
//  `sedzia_id` int(10) NOT NULL AUTO_INCREMENT,
//  `sedzia_imie` varchar(2000) DEFAULT NULL,
//  `sedzia_nazwisko` varchar(2000) DEFAULT NULL,
//  PRIMARY KEY (`sedzia_id`)
//) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
//
//INSERT INTO `users` (`sedzia_id`, `sedzia_imie`, `sedzia_nazwisko`) VALUES
//	(1, 'Edmund', 'Kwas'),
//	(2, 'Megan', 'Bum'),
//	(3, 'Robert', 'Cmyk'),
//  (4, 'Baltazar', 'Gabka'),
//  (5, 'Franek', 'Kolanko');