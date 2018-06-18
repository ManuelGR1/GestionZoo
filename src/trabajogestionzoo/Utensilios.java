package trabajogestionzoo;
 
/**
 *
 * @author victor
 */
public class Utensilios extends Materiales {

    private String nombre;

    public Utensilios(String refMaterial, String tipoMaterial, String nombre) {
        super(refMaterial, tipoMaterial);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Utensilios [nombre=" + nombre + ", getNombre()=" + getNombre() + ", getRefMaterial()="
                + getRefMaterial() + ", getTipoMaterial()=" + getTipoMaterial() + ", toString()=" + super.toString()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    }

}
