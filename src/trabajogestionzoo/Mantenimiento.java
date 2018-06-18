package trabajogestionzoo;

/**
 *
 * @author ManuelRamon
 */
public class Mantenimiento extends Empleados {

    public Mantenimiento(String nombre, String apellidos, int salarioMensual) {
        super(nombre, apellidos, salarioMensual);
    }

    String setapellidos() {
        return getApellidos();
    }

    public int SalarioMensual(int SalarioMensual) {
        return SalarioMensual;
    }

}//Fin class Mantenimiento
