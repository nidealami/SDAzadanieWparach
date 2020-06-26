import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Mecz {
    //zasady dla danego meczu
    //Toczą oni mecze/spotkania na zasadzie każdy z każdym.
    //Każde ze spotkań sędziuje sędzia, a dodatkowo w siatkówce 2 sędziów pomocniczych
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mecz_id;

    @OneToOne
    @JoinColumn(referencedColumnName = "mecz_id", name = "druzyna1_id")
    private Druzyny druzyna1;

    @OneToOne
    @JoinColumn(referencedColumnName = "mecz_id", name = "druzyna2_id")
    private Druzyny druzyna2;

    @OneToOne
    @JoinColumn(referencedColumnName = "mecz_id", name = "zwyciesca_id")
    private Druzyny zwyciesca;

    @Enumerated(EnumType.STRING)
    @Column(name = "dyscyplina", length = 20)
    private Dyscyplina dyscyplina;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sedzia_id")
    private Sedziowie sedziowie;

    @Column(name = "wynik")
    private String wynik;

}
