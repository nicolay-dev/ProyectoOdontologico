package main;

/**
 * @author Nicolay
 * @version 1.0
 * @created 06-abr.-2017 5:23:27 p. m.
 */
public abstract class  Decorator extends Paquete {

	public Paquete m_Paquete;

	public abstract String getDesc();
	public abstract int almacenamiento();
}//end Decorator