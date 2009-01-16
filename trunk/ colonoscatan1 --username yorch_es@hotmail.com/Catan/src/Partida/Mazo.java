package Partida;
import java.util.List;

import Cartas.Carta;
import Cartas.CartaAccion;
import Cartas.CartaCentralArbol;
import Cartas.CartaCentralCarretera;
import Cartas.CartaCentralCiudad;
import Cartas.CartaCentralPoblado;
import Cartas.CartaEvento;
import Cartas.CartaExpansionCiudad;
import Cartas.CartaExpansionRegion;



public class Mazo {
	
	private static final int NUMCEVENTOSDADO = 10;
	private static final int NUMCCIUDAD = 7;
	private static final int NUMCPOBLADO = 5;
	private static final int NUMCCARRETERA = 7;
	private static final int NUMCARBOL = 0;
	public List<Carta> mazo = null;
	public String tipoMazo;

	/**
	 * @uml.property  name="carta"
	 * @uml.associationEnd  multiplicity="(0 -1)" dimension="1" ordering="true" aggregation="composite" inverse="mazo:Carta"
	 */
	private Carta[] cartas;

	/**
	 * Getter of the property <tt>carta</tt>
	 * @return  Returns the cartas.
	 * @uml.property  name="carta"
	 */
	public Carta[] getCarta() {
		return cartas;
	}

	/**
	 * Setter of the property <tt>carta</tt>
	 * @param carta  The cartas to set.
	 * @uml.property  name="carta"
	 */
	public void setCarta(Carta[] carta) {
		cartas = carta;
	}

	
	//****************************************************************
	//Aplicamos el patron fabrica simple para crear los tipos de mazos
	//****************************************************************
	public Mazo (String tipoMazo){
		
		setTipoMazo(tipoMazo);
		
		if (tipoMazo=="EventoDado")
			mazo = createMazoEventoDado();
		else if (tipoMazo=="Ciudad")
			mazo = createMazoCiudad();
		else if (tipoMazo=="Poblado")
			mazo = createMazoPoblado();
		else if (tipoMazo=="Carretera")
			mazo = createMazoCarretera();
		else if (tipoMazo=="Arbol")
			mazo = createMazoArbol();
		else if (tipoMazo=="Expansion")
			mazo = createMazoExpansion();
		
	}
	
	
	public List<Carta> createMazoEventoDado(){
		List<Carta> mazoEvento = null;
		//Crea 1 mazo de 10 cartas de tipo Evento
		for (int i=0; i<NUMCEVENTOSDADO; i++){
			CartaEvento c = null;
			mazoEvento.add(c.createCarta());
		}
		
		return mazoEvento;
	}
	public List<Carta> createMazoCiudad(){
		List<Carta> mazoCiudad = null;
		//Crea 1 mazo de 7 cartas de tipo ciudad
		for (int i=0; i<NUMCCIUDAD; i++){
			CartaCentralCiudad c = null;
			mazoCiudad.add(c.createCarta());
		}
		
		return mazoCiudad;
	}
	public List<Carta> createMazoPoblado(){
		List<Carta> mazoPoblado = null;
		//Crea 1 mazo de 5 cartas de tipo Poblado
		for (int i=0; i<NUMCPOBLADO; i++){
			CartaCentralPoblado c = null;
			mazoPoblado.add(c.createCarta());
		}
		return mazoPoblado;
	}
	public List<Carta> createMazoCarretera(){
		List<Carta> mazoCarretera = null;
		//Crea 1 mazo de 7 cartas de tipo Carretera
		for (int i=0; i<NUMCCARRETERA; i++){
			CartaCentralCarretera c = null;
			mazoCarretera.add(c.createCarta());
		}
		
		return mazoCarretera;
	}
	public List<Carta> createMazoArbol(){
		List<Carta> mazoArbol = null;
		//Crea 1 mazo de 11 cartas de tipo Arbol
		for (int i=0; i<NUMCARBOL; i++){
			CartaCentralArbol c = null;
			mazoArbol.add(c.createCarta());
		}
		
		return mazoArbol;
	}
	
	public List<Carta> createMazoExpansion(){
		
		List<Carta> mazoExpansion = null;
		
		//Crea 1 mazo de 62 cartas de tipo Expansion
		//Cartas de Acción
		for (int i=0; i<0; i++){
			CartaAccion c = null;
			mazoExpansion.add(c.createCarta());
		}
		//Cartas de Evento
		for (int i=0; i<0; i++){
			CartaEvento c = null;
			mazoExpansion.add(c.createCarta());
		}
		//Cartas de Expansion de Region
		for (int i=0; i<0; i++){
			CartaExpansionRegion c = null;
			mazoExpansion.add(c.createCarta());
		}
		//Cartas de Ampliacion de Ciudad
		for (int i=0; i<0; i++){
			CartaExpansionCiudad c = null;
			mazoExpansion.add(c.createCarta());
		}
		
		return mazoExpansion;
	}
	//********************************************************
	//********************************************************
	 
	public List<Carta> getMazo() {
		return mazo;
	}

	public String getTipoMazo() {
		return tipoMazo;
	}
	public void setTipoMazo(String tipoMazo) {
		this.tipoMazo = tipoMazo;
	}

}
