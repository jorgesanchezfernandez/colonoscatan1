package Partida;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import Cartas.Carta;
import Cartas.CartaAccion;
import Cartas.CartaEvento;
import Cartas.CartaExpansionCiudad;
import Cartas.CartaExpansionRegion;



public class Jugador {

	//ATRIBUTOS
	public Mundo mundo1;
	public int puntos; //Puntos de cada jugador
	String color;
	private List<Carta> mano; /*Lista para saber las cartas que tengo en la mano. Tendrá dimension 3 siempre*/
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Para introducir color
	
	//El tablero crea los jugadores
	//Jugador j1 = new Jugador();
	//Jugador j2 = new Jugador(); //Jugadores de la partida

	
	
	public Jugador(Mundo m){
		puntos=2;
		color=null;
		mano= new ArrayList();//Cada jugador comienza con 2 puntos
		mundo = m;
	}
	
	
	

	//METODOS
	
	/**
	 * @uml.property  name="mundo"
	 * @uml.associationEnd  aggregation="composite" inverse="jugador:Mundo"
	 */
	private Mundo mundo;

	/**
	 * Getter of the property <tt>mundo</tt>
	 * @return  Returns the mundo.
	 * @uml.property  name="mundo"
	 */
	public Mundo getMundo() {
		return mundo;
	}

	/**
	 * Setter of the property <tt>mundo</tt>
	 * @param mundo  The mundo to set.
	 * @uml.property  name="mundo"
	 */
	public void setMundo(Mundo mundo) {
		this.mundo = mundo;
	}

	/** 
	 * @uml.property name="carta"
	 * @uml.associationEnd multiplicity="(0 -1)" dimension="1" ordering="true" aggregation="composite" inverse="jugador:Carta"
	 * @uml.association name="CartasMano"
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



	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color=color;
	}
	
	public int getPuntos(){
		return puntos;
	}
	
	public void setPuntos (int puntos){
		this.puntos=puntos;
	}
	
	public List<Carta> getMano (){
		return mano;
	}
	
	public String elegirColor() throws IOException{
	
		System.out.println("Por favor, escoja un color. RojoNegro o RojoBlanco");	
		try{
			
		color = (String)br.readLine();
		
		System.out.println("El color introducido es:" +color);
		
		if(!(color.equals("RojoNegro")|| color.equals("RojoBlanco"))){
			System.out.println("El valor no es válido. Por favor, vuelva a elegir correctamente");
			elegirColor();
		}
		
		}catch(Exception e){ 
			e.printStackTrace();}
		
	return color;
	}

	public void addCarta (Carta C){
		
		//Si el numero de cartas es 3 no podrá coger ninguna.
		
		if((mano).size()>=3){
			System.out.println("No puedes añadair la carta, ya tienes tres en tu mano");
		}else{
			
			while(mano.size()<=3){
				mano.add(C);
				}
		}
		}
		//El jugador podrá ver las tres cartas que tiene en la mano. 
	
	public void VerCartas (){
		
		for(Carta c:mano){
			
			System.out.println("Tus cartas son:"+c);
	
		}
	}
	
	public void utilizaCarta(Carta c,Jugador j2){
		
		/*Si la carta está en la mano*/
		
		if(mano.contains(c)){

				/*Si la carta es de acción podrá jugarse siempre y 
				cuando estén en la mano y cuando ambos jugadores sumen 7 puntos en total.*/
				
			//************************************************************
			//Variaciones Protegidas

			if (c instanceof CartaAccion){
				//Ejecuta la Accion ya que la carta es de Accion
				CartaAccion c1 = (CartaAccion)c;
				c1.ejecutar();
			}
			
			if (c instanceof CartaExpansionCiudad){
				//Ejecuta la AmpliaciónCiudad ya que la carta es de AmpliacionCiudad
				CartaExpansionCiudad c1 = (CartaExpansionCiudad)c;
				c1.ejecutar();
			}
				
			if (c instanceof CartaExpansionRegion){
				//Ejecuta la ExpansionRegion ya que la carta es de ExpansionRegion
				CartaExpansionRegion c1 = (CartaExpansionRegion)c;
				c1.ejecutar();
			}
			
			if (c instanceof CartaEvento){
				//Ejecuta el Evento por ser carta de Evento
				CartaEvento e= (CartaEvento)c;
				e.ejecutar();
			}
	
			mano.remove(c);	
		}
		
		else{
			System.out.println("La carta que quiere usar no la posee");
		}
		
	}
	
	public void NegociarMPConBanca(){
		
		/*Si se quiere negociar con la banca hay que tener 3 materias primas iguales para
		intercambiarlas por una*/
		//Llama a materias primas de mundo para comprobar que tengo 3 de un mismo tipo
		
		
		//Tu pierdes 3 materias primas a cambio de una
		
				
	}
	
}
