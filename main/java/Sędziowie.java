package SDAzadanieWparach.main.java;

public class Sędziowie {
    //będą przyciski:
    //dodaj sedziego
    //usun sedziego
    //bedzie lista dostepnych sedziow

    //imie
    //nazwisko
    private int sedzia_id;
    private String sedzia_imie;
    private String nazwisko;
   //to będzie potrzebne do połączenia: private List<Mecz> matches = new LinkedList<>();
}



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
