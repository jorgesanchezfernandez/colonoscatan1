package Dados;

import java.util.Collection;


/**
 * @uml.dependency   supplier="Evento"
 */
public class DadoEvento extends Dado {
	
	private DadoEvento cara;
	private Collection<DadoEvento> eventos;
	
	
		
	
	public DadoEvento(){
		//El dado tiene 5 eventos distintos
		
	}
	public DadoEvento getCara(){
		return cara;
	}

	public void createDado(){
	}
	
	public void tirarDado() {
		
	}
				

}
