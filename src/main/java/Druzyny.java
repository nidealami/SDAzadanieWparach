import javax.persistence.*;

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

    public int getDruzyna_id() {
        return druzyna_id;
    }

    public void setDruzyna_id(int druzyna_id) {
        this.druzyna_id = druzyna_id;
    }

    public String getNazwaDruzyny() {
        return nazwaDruzyny;
    }

    public void setNazwaDruzyny(String nazwaDruzyny) {
        this.nazwaDruzyny = nazwaDruzyny;
    }

    public Druzyny(int druzyna_id, String nazwaDruzyny) {
        this.druzyna_id = druzyna_id;
        this.nazwaDruzyny = nazwaDruzyny;
    }

    public Druzyny() {

    }
}

