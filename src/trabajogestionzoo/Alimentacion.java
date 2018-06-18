package trabajogestionzoo;


/**
 *
 * @author ManuelRamon
 */
public class Alimentacion extends Materiales {

    private String animal;

    public Alimentacion(String animal, String refMaterial, String tipoMaterial) {
        super(refMaterial, tipoMaterial);
        this.animal = animal;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Alimentacion{" + "animal=" + animal + '}';
    }

   

}// Fin class

