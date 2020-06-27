

public interface TurniejDAO {
    Turniej getByDyscyplina(String dyscylina);

    Turniej getByImieSedzia(String sedzia_imie);

    void modyfikujMecz(Mecz mecz);
    void generujFinaly(Mecz mecz);
}
