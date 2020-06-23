import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

@Entity
public class Druzyny {
    //czy to istotne ile osób gra w danej drużynie?
    //tu będzie odniesienie do bazy z zawodnikami
    //przyciski/funkcjonalności:
    //nowa drużyna
    //usun druzyne
    //zglos druzyne
    //wycofaj druzyne

    //ma być lista dostępych druzyn oraz lista grających drużyn
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int druzyna_id;
    @Column(name = "nazwaDruzyny",nullable = false,length = 30)

    private String nazwaDruzyny;

    @Enumerated(EnumType.STRING)
    @Column(name = "Dyscyplina", length = 30)
    private Dyscyplina dyscyplina;



}

