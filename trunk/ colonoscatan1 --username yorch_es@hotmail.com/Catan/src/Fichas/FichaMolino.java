package Fichas;


public abstract class FichaMolino extends Ficha {
	/**
	 * @uml.property  name="PuntosMolino"
	 */
	private int puntosMolino;

	/**
	 * Getter of the property <tt>PuntosMolino</tt>
	 * @return  Returns the puntosMolino.
	 * @uml.property  name="PuntosMolino"
	 */
	public int getPuntosMolino() {
		return puntosMolino;
	}

	/**
	 * Setter of the property <tt>PuntosMolino</tt>
	 * @param PuntosMolino  The puntosMolino to set.
	 * @uml.property  name="PuntosMolino"
	 */
	public void setPuntosMolino(int puntosMolino) {
		this.puntosMolino = puntosMolino;
	}

	}
