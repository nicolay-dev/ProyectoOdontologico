package main;

/**
 * @author Nicolay
 * @version 1.0
 * @created 06-abr.-2017 5:23:27 p. m.
 */
public class Externo extends Decorator {

	private Paquete paquete;

	public Externo(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public int almacenamiento(){
		return paquete.almacenamiento() + 1000;
	}

	public String getDesc(){
		return "";
	}
}//end Externo