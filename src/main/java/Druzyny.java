import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor

@Entity
public class Druzyny {
    //czy to istotne ile osób gra w danej drużynie?
    //tu będzie odniesienie do bazy z zawodnikami

    //ma być lista dostępych druzyn oraz lista grających drużyn
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "druzyna_id")
    private int druzyna_id;

    @Column(name = "nazwaDruzyny", nullable = false, length = 30)
    private String nazwaDruzyny;

    @Enumerated(EnumType.STRING)
    @Column(name = "Dyscyplina", length = 30)
    private Dyscyplina dyscyplina;


//    @Override
//    public String toString() {
//        return "Druzyny{" +
//                "druzyna_id=" + druzyna_id +
//                ", nazwaDruzyny='" + nazwaDruzyny + '\'' +
//                                '}';
//    }
}



