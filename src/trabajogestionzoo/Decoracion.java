package trabajogestionzoo;


/**
 *
 * @author ManuelRamon
 */
public class Decoracion extends Materiales {

    private String paisaje;

    public Decoracion(String paisaje, String refMaterial, String tipoMaterial) {
        super(refMaterial, tipoMaterial);
        this.paisaje = paisaje;
    }

    public String getPaisaje() {
        return paisaje;
    }

    public void setPaisaje(String paisaje) {
        this.paisaje = paisaje;
    }

    @Override
    public String toString() {
        return "Caractericticas decoracion: \n" + "paisaje=" + paisaje + "\n";
    }

}// Fin clase Decoracion
