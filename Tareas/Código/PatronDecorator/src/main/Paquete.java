package main;

/**
 * Clase que define las caracteristicas de un paquete
 * @author Nicolay
 * @version 1.0
 * @created 06-abr.-2017 5:23:27 p. m.
 */
public abstract class Paquete {

	public String descripcion = "";

	public int almacenamiento(){
		return 0;
	}

	public String getDesc(){
		return descripcion;
	}
}//end Paquete