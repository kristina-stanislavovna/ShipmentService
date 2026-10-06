import java.util.List;

public class CargoServiceImpl implements CargoService {
    private List<Cargo> cargos;


    public CargoServiceImpl(List<Cargo> cargos) {
        this.cargos = cargos;
    }


    @Override
    public Cargo findById(Long id) {
        Cargo findId = null;
        String str = "";
        for (Cargo cargo : cargos) {
            if (cargo.getId() == id) {
                findId = cargo;
                str = "CARGO TICKET: " + findId.getId();
                System.out.println(str);
            }
        }
        return findId;
    }
}
