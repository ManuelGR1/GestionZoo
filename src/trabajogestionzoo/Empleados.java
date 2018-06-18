package trabajogestionzoo;

/**
 *
 * @author ManuelRamon
 */
public class Empleados {

    private String nombre;
    private String apellidos;
    private int salarioMensual;

    public Empleados(String nombre, String apellidos, int salarioMensual) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salarioMensual = salarioMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(int salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", salarioMensual=" + salarioMensual + '}';
    }

}//Fin public class Empleados
