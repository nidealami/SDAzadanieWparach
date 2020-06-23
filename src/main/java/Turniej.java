import javax.persistence.*;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor

public class Turniej {
    //kto z kim gra
    //jakie są zasady
    //Pierwsze 4 drużyny z największą liczbą zwycięstw przechodzą do półfinałów a ich zwycięzcy do finałów.
    //bedzie mozliwosc wybrania turnieju z tych trzech dyscypln
    //na tablicy wyswietlac sie bedzie:
    //Drużyna1, Drużyna2, Wynik, Sędzia Główny, Sędzie pomocniczy1, Sędzia pomocniczy2


    //enum dla danej dyscypliny
    @Id
    private int turniej_id;
    //tutaj będzie wyświetać się lista sędziów; coś jak List<Sędziowie> ListaSędziowie
    //jak wyżej z tym ze dla druzyn
    @Enumerated(EnumType.STRING)
    @Column(name = "Dyscyplina", length = 30)
    private Dyscyplina dyscyplina;

    @Transient
    List<Druzyny> teamsList;

    @Transient
    List<Sedziowie> judgesList;

}
