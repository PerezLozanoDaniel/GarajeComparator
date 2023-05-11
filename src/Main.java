public class Main {
    public static void main(String[] args) {

        Vehiculo coche1 =new Vehiculo("1234",100, 180);
        Vehiculo moto1 =new Vehiculo("1267",35,160);
        Vehiculo coche2 =new Vehiculo("4567", 54, 145);

        Garaje parking =new Garaje();

        System.out.println(coche1.toString() +parking.add(coche1));
        System.out.println(moto1.toString() +parking.add(moto1));
        System.out.println(coche2.toString() +parking.add(coche2));

        System.out.println("Por matricula");
        parking.aparcamientos.sort(new OrdenamientoMatricula());
        parking.muestra();

        System.out.println("Por potencia");
        parking.aparcamientos.sort(new OrdenamientoPotencia());
        parking.muestra();

        System.out.println("Por velocidad");
        parking.aparcamientos.sort(new OrdenamientoLento());
        parking.muestra();
    }
}
