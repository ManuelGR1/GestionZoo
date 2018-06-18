package trabajogestionzoo;

/**
 *
 * @author ManuelRamon
 */
public class Cuidador extends Empleados {

    private int SalarioMensual;

    public Cuidador(String nombre, String apellidos, int salarioMensual) {
        super(nombre, apellidos, salarioMensual);
    }

    public String setapellidos() {
        return getApellidos();
    }

    public int setSalarioMensual() {
        return SalarioMensual;
    }
}// Fin class cuidador
