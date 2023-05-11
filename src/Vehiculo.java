public class Vehiculo {
     String matricula;
     int potencia;
     int velocidad;

    public Vehiculo(String matricula, int potencia, int velocidad) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.velocidad = velocidad;
    }

    @Override
    public boolean equals(Object obj) {
        Vehiculo unidad =(Vehiculo) obj;
        if (this.matricula == ((Vehiculo) obj).matricula){ return true;}
        else return false;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", potencia=" + potencia +
                ", velocidad=" + velocidad +
                '}';
    }
}
