package Dados;

import java.util.Collection;

public class DadoEvento extends Dado {
	
	public void DadoEvento(){
		
	}
	
	public int tirarDado(){ // Este dado toma valores entre 1 y 5
		double valor = 0;
		int puntuacion = 0; // Con esta variable truncamos los decimales.
		valor = Math.random()*5+1;
		puntuacion = (int)valor;
				
		return puntuacion;
	}
}