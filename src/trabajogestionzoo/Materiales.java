package trabajogestionzoo;

/**
 *
 * @author ManuelRamon
 */
public abstract class Materiales {

    private String refMaterial;
    private String tipoMaterial;

    public Materiales(String refMaterial, String tipoMaterial) {
        this.refMaterial = refMaterial;
        this.tipoMaterial = tipoMaterial;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getRefMaterial() {
        return refMaterial;
    }

    public void setRefMaterial(String refMaterial) {
        this.refMaterial = refMaterial;
    }

    @Override
    public String toString() {
        return "Materiales{" + "refMaterial=" + refMaterial + ", tipoMaterial=" + tipoMaterial + '}';
    }

    
} //Fin clase materiales 

