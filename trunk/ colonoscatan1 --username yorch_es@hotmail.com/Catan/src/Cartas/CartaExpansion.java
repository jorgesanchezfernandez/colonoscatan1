package Cartas;




public class CartaExpansion extends Carta {
	private int numCartas;

	/**
	 * Getter of the property <tt>numCartas</tt>
	 * @return  Returns the numCartas.
	 * @uml.property  name="numCartas"
	 */
	public int getNumCarta() {
		return numCartas;
	}

	/**
	 * Setter of the property <tt>numCartas</tt>
	 * @param numCartas  The numCartas to set.
	 * @uml.property  name="numCartas"
	 */
	public void setNumCartas(int numCartas) {
		this.numCartas = numCartas;
	}
	
	public CartaExpansion createCarta (){
		return null;
	}

}
