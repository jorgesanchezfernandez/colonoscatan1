package Cartas;


public class CartaAccion extends Carta {
	
	public CartaAccion createCarta (){
		return null;
	}
	public void ejecutaAccion(int puntosJ1, int puntosJ2) {
		if(puntosJ1<7 || puntosJ2<7){
			System.out.println("La carta de acción solo se puede usar cuando ambos jugadores sumen 7 ptos.");
		}
		//Hacer la estrategia
		
	}
}
