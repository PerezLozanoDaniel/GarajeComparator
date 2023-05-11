import java.util.ArrayList;
import java.util.Comparator;

public class Garaje {

    ArrayList<Vehiculo> aparcamientos= new ArrayList<Vehiculo>();

    boolean add(Vehiculo unidad){
        if (aparcamientos.contains(unidad)){
            return false;
        }
        else {
            aparcamientos.add(unidad);
            return true;
        }
    }

    public void muestra() {
        for (Vehiculo unidad: aparcamientos){
            System.out.println(unidad.toString());
        }
    }
}
