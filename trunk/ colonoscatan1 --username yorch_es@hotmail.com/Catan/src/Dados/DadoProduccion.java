package Dados;

import java.math.*;


public class DadoProduccion extends Dado {

	public void DadoProduccion(){
		
	}
	
	public  int tirarDado(){
		double valor = 0;
		int puntuacion = 0; // Con esta variable truncamos los decimales.
		valor = Math.random()*6+1;
		puntuacion = (int)valor;
		
		return puntuacion;
	}

}
