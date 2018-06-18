package trabajogestionzoo;


/**
 *
 * @author ManuelRamon
 */
public abstract class Animales {

    private String nombreAnimal, raza, tipoComida, tipoBebida;

    public Animales(String nombreAnimal, String raza, String tipoComida, String tipoBebida) {
        super();
        this.nombreAnimal = nombreAnimal;
        this.raza = raza;
        this.tipoComida = tipoComida;
        this.tipoBebida = tipoBebida;
    }

	/**
	 * @return the nombreAnimal
	 */
	public String getNombreAnimal() {
		return nombreAnimal;
	}

	/**
	 * @param nombreAnimal the nombreAnimal to set
	 */
	public void setNombreAnimal(String nombreAnimal) {
		this.nombreAnimal = nombreAnimal;
	}

	/**
	 * @return the raza
	 */
	public String getRaza() {
		return raza;
	}

	/**
	 * @param raza the raza to set
	 */
	public void setRaza(String raza) {
		this.raza = raza;
	}

	/**
	 * @return the tipoComida
	 */
	public String getTipoComida() {
		return tipoComida;
	}

	/**
	 * @param tipoComida the tipoComida to set
	 */
	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}

	/**
	 * @return the tipoBebida
	 */
	public String getTipoBebida() {
		return tipoBebida;
	}

	/**
	 * @param tipoBebida the tipoBebida to set
	 */
	public void setTipoBebida(String tipoBebida) {
		this.tipoBebida = tipoBebida;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Animales{\nNombre = " +nombreAnimal+ "\n" + "Raza = " + raza + "\n" +"Tipo de comida = " + tipoComida + "\n" +"Tipo de bebida: " + tipoBebida + "\n"+'}';
	}
} //Fin public abstract class Animales 
