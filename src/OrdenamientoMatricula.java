import java.util.Comparator;

public class OrdenamientoMatricula implements Comparator<Vehiculo> {

    @Override
    public int compare(Vehiculo o1, Vehiculo o2) {
        return o1.matricula.compareTo(o2.matricula);
    }
}

