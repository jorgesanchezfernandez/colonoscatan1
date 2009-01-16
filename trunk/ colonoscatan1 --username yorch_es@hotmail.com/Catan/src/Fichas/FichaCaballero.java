package Fichas;


public abstract class FichaCaballero extends Ficha {
	private int puntosCaballero;

	/**
	 * Getter of the property <tt>PuntosCaballero</tt>
	 * @return  Returns the puntosCaballero.
	 * @uml.property  name="PuntosCaballero"
	 */
	public int getPuntosCaballero() {
		return puntosCaballero;
	}

	/**
	 * Setter of the property <tt>PuntosCaballero</tt>
	 * @param PuntosCaballero  The puntosCaballero to set.
	 * @uml.property  name="PuntosCaballero"
	 */
	public void setPuntosCaballero(int puntosCaballero) {
		this.puntosCaballero = puntosCaballero;
	}

}
