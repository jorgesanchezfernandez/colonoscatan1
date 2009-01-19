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
			createMazoEventoDado();
		else if (tipoMazo=="Ciudad")
			createMazoCiudad();
		else if (tipoMazo=="Poblado")
			createMazoPoblado();
		else if (tipoMazo=="Carretera")
			createMazoCarretera();
		else if (tipoMazo=="Arbol")
			createMazoArbol();
		else if (tipoMazo=="Expansion")
			createMazoExpansion();
		
	}
	
	
	public void createMazoEventoDado(){
		
		//Crea 1 mazo de 10 cartas de tipo Evento
		for (int i=0; i<NUMCEVENTOSDADO; i++){
			mazo.add(new CartaEvento());
		}
		
		
	}
	public void createMazoCiudad(){
		//Crea 1 mazo de 7 cartas de tipo ciudad
		for (int i=0; i<NUMCCIUDAD; i++){			
			mazo.add(new CartaCentralCiudad());
		}
		
	}
	public void createMazoPoblado(){

		//Crea 1 mazo de 5 cartas de tipo Poblado
		for (int i=0; i<NUMCPOBLADO; i++){
			mazo.add(new CartaCentralPoblado());
		}
	}
	public void createMazoCarretera(){

		//Crea 1 mazo de 7 cartas de tipo Carretera
		for (int i=0; i<NUMCCARRETERA; i++){
			mazo.add(new CartaCentralCarretera());
		}
		
	}
	public void createMazoArbol(){
		
		//Crea 1 mazo de 11 cartas de tipo Arbol
		for (int i=0; i<NUMCARBOL; i++){
			mazo.add(new CartaCentralArbol());
		}
	}
	
	public void createMazoExpansion(){
		
		//Crea 1 mazo de 62 cartas de tipo Expansion
		//Cartas de Acción
		for (int i=0; i<15; i++){
			mazo.add(new CartaAccion());
		}
		//Cartas de Evento
		for (int i=0; i<15; i++){
			mazo.add(new CartaEvento());
		}
		//Cartas de Expansion de Region
		for (int i=0; i<15; i++){
			mazo.add(new CartaExpansionRegion());
		}
		//Cartas de Ampliacion de Ciudad
		for (int i=0; i<17; i++){
			mazo.add(new CartaExpansionCiudad());
		}
		
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
