import java.util.List;

public interface DruzynyDAO {
    Druzyny getByDruzyna_id(int druzyna_id);

    Druzyny getByNazwaDruzyny(String nazwaDruzyny);

    void nowaDruzyny(Druzyny druzyny);
    void usunuDruzyny(Druzyny nazwaDruzyny);
    void zglosDruzyny(Druzyny nazwaDruzyny);
    void wycofajDruzyny(Druzyny nazwaDruzyny);

    List<Druzyny> getAll();

}
