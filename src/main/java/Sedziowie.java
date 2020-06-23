import java.util.LinkedList;
import java.util.List;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
public class Sedziowie {

    //będą przyciski:
    //dodaj sedziego
    //usun sedziego
    //bedzie lista dostepnych sedziow


    //    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sedzia_id;

    //    @Column(name = "Imie sedziego", nullable = false, length = 30)
    private String sedzia_imie;

    //    @Column(name = "Nazwisko", nullable = false, length = 30)
    private String nazwisko;


    //    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "mecz_id")
    private List<Mecz> mecz = new LinkedList<>();


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


