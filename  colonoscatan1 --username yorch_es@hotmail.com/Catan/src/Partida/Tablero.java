package Partida;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import Cartas.Carta;
import Dados.Dado;
import Dados.DadoEvento;
import Dados.DadoProduccion;
import Dados.IDado;
import Fichas.IFicha;

public class Tablero {

	private Tablero instance = null;
	private List<Jugador> jugadores;	
	private Jugador turno;
	private List<Mazo> mazos;
	private Collection<Dado> dados;
	private final static Integer NUMMAZOEXP = 5;
	
	//***********************************************************
	//Se debe de crear una sola instancia del Tablero (Singleton)
	//***********************************************************
	public Tablero (){
		jugadores= new ArrayList<Jugador>();
	    mazos= new ArrayList<Mazo>();
		dados= new ArrayList();
		this.inicializaPartida();
	}
	public Tablero getInstance(){
		
		if(instance == null)
			instance= new Tablero();
		
		return instance;
	}
	//***********************************************************
	//***********************************************************
	
	// Dar� el turno al siguiente jugador
	//La partida comenzar� siempre por el jugador1
	private void darTurnoSiguiente() {
		
		if (this.turno == null)
			this.turno = jugadores.get(0);

		else{
		if (this.turno.color == "Rojo"){
				this.turno = jugadores.get(1);
			}
			else{
				this.turno = jugadores.get(0);
			}		
		}	
	}
	
	private Carta robarDeMazo(Integer numMazo){
		
		if (mazos.get(numMazo).mazo.size()>=0){
			return mazos.get(numMazo).mazo.remove(0);
		}
		else{
			return null;
		}
		
		
	}
	private void pintaTablero() {
		// TODO Pinta en pantalla el tablero tal y como este la partida
		//Se llamar� cada vez que algun elemento del tablero cambie
		//Implementa el Patr�n Decorador
		
	}
	
	//Variaciones Protegidas: Se tirar�n todos los dados que haya en el juego
	//Se contempla si se implementan m�s en un futuro
	private void tirarDadoPartida(){
		//Tira los dados del juego
		for(Dado d:dados){
			d.tirarDado();
		}
	}

	

	
	//Inicializa los parametros para poder empezar a jugar
	public void inicializaPartida(){
		
		//Creamos los mundos
		Mundo mundo1 = new Mundo();
		Mundo mundo2 = new Mundo();
		
		//Creamos los jugadores
		Jugador jugador1 = new Jugador(mundo1);
		Jugador jugador2 = new Jugador(mundo2);
		jugadores.add(jugador1);
		jugadores.add(jugador2);
		
		//Elecci�n de colores
		
		try {
		/*El metodo elegirColor devuelve el color introducido por teclado por el jugador uno.
			El otro color no elegido se le asignar� al jugador 2*/
			jugador1.color=jugador1.elegirColor();
		if(jugador1.color.equals("RojoNegro")){
				jugador2.color="RojoBlanco";
			}else{
				jugador2.color="RojoNegro";
		}
			
		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	System.out.println("Color del Jugador 1: " +jugador1.color +". "+ "Color del Jugador 2: "+ jugador2.color);
	
		//Creamos los mazos
		Mazo mazo = new Mazo("Evento");
		mazos.add(mazo);
		mazo = new Mazo("Ciudad");
		mazos.add(mazo);
		mazo = new Mazo("Poblado");
		mazos.add(mazo);
		mazo = new Mazo("Carretera");
		mazos.add(mazo);
		for (int i=0;i<=NUMMAZOEXP; i++){
			mazo = new Mazo("Expansion");
			mazos.add(mazo);
		}
				
		//Creamos los dados
		DadoEvento dadoE = new DadoEvento ();
		dados.add(dadoE);
		DadoProduccion dadoP = new DadoProduccion ();
		dados.add (dadoP);
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public Jugador getTurno() {
		return turno;
	}

	public void setTurno(Jugador turno) {
		this.turno = turno;
	}

	public List<Mazo> getMazos() {
		return mazos;
	}

	public Collection<Dado> getDados() {
		return dados;
	}




}
