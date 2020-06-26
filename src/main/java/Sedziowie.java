import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Setter
@Getter
@NoArgsConstructor
public class Sedziowie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sedzia_id;

    @Column(name = "Imie sedziego", nullable = false, length = 30)
    private String sedzia_imie;

    @Column(name = "Nazwisko", nullable = false, length = 30)
    private String nazwisko;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "mecz_id")
    private List<Mecz> mecz = new LinkedList<>();


}





