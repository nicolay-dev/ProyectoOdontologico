package main;

/**
 * @author Nicolay
 * @version 1.0
 * @created 06-abr.-2017 5:23:27 p. m.
 */
public class Pendrive extends Decorator {

	private Paquete paquete;

	public Pendrive(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public int almacenamiento(){
		return paquete.almacenamiento() + 32;
	}

	public String getDesc(){
		return "";
	}
}//end Pendrive