import java.util.Comparator;

public class OrdenamientoLento implements Comparator<Vehiculo> {

    @Override
    public int compare(Vehiculo o1, Vehiculo o2) {
        return o1.velocidad-o2.velocidad;
    }
}

