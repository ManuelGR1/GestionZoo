package trabajogestionzoo;

/**
 *
 * @author ManuelRamon
 */
public class Administrativo extends Empleados {

   private int SalarioMensual;

    public Administrativo(String nombre, String apellidos, int salarioMensual) {
        super(nombre, apellidos, salarioMensual);
    }

    public String setapellidos() {
        return getApellidos();
    }

    public int setSalarioMensual() {
        return SalarioMensual;
    }

}//Fin public abstract class Administrativo 
