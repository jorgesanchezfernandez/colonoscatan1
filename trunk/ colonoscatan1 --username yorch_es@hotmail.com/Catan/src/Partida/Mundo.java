package Partida;
import java.util.Collection;
import java.util.Iterator;

import Cartas.Carta;



public class Mundo {

	public Collection carta;

	public Mundo(){
		//Crea la coleccion de cartas del mundo
		//6 cartas de recursos
		//2 poblados
		//1 carretera
	}
	public Collection getCarta() {
		return carta;
	}

	public Iterator cartaIterator() {
		return carta.iterator();
	}

	public boolean isCartaEmpty() {
		return carta.isEmpty();
	}

	public boolean containsCarta(Carta carta) {
		return this.carta.contains(carta);
	}

	public boolean containsAllCarta(Collection carta) {
		return this.carta.containsAll(carta);
	}


	public int cartaSize() {
		return carta.size();
	}

	public Carta[] cartaToArray() {
		return (Carta[]) carta.toArray(new Carta[carta.size()]);
	}

	public Carta[] cartaToArray(Carta[] carta) {
		return (Carta[]) this.carta.toArray(carta);
	}

	public boolean addCarta(Carta carta) {
		return this.carta.add(carta);
	}

	public void setCarta(Collection carta) {
		this.carta = carta;
	}

	public boolean removeCarta(Carta carta) {
		return this.carta.remove(carta);
	}

	public void clearCarta() {
		this.carta.clear();
	}

	public void expandirMundo (){
		
	}
	//Estrategias a desarrollar en el Mundo

}
