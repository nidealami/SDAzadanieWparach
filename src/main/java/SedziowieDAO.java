import java.util.List;

public interface SedziowieDAO {

    Sedziowie getBySedzia_id(int sedzia_id);

    Sedziowie getByImieSedzia(String sedzia_imie);

    void dodajSedzia(Sedziowie sedziowie);
    void usunuSedzia(Sedziowie sedzia_id);
    void modyfikujSedzia(Druzyny sedzia_id);

    List<Sedziowie> getAll();

}
