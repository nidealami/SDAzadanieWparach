import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

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

    @ManyToMany
    @JoinTable(
            name = "mecz_druzyna",
            joinColumns = {@JoinColumn(name = "mecz_id")},
            inverseJoinColumns = {@JoinColumn(name = "druzyna_id")}
    )
    private Set<Druzyny> druzyny = new HashSet<>();
    @Enumerated(EnumType.STRING)
    @Column(name = "dyscyplina", length = 20)
    private Dyscyplina dyscyplina;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sedzia_id")
    private Sedziowie sedziowie;
    @Column(name = "wynik")
    private String wynik;

    public void setDruzyna(Druzyny druzyna) {
        druzyny.add(druzyna);
    }
}
