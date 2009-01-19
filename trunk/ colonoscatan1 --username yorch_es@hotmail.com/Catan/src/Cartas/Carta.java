package Cartas;




public abstract class Carta {

	private String nombre = "";	
	private String estrategia = "";
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEstrategia() {
		return estrategia;
	}


	public void setEstrategia(String estrategia) {
		this.estrategia = estrategia;
	}
	
	public static void ejecutar(){
		
	}

}
