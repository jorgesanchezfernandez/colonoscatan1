package Dados;

import java.util.Random;


public class DadoProduccion extends Dado {

	
	Random rnd = new Random();
	
	public void tirarDado(){
		int puntuacion;
		puntuacion=(int) Math.random()*6+1;
		
	}

}
