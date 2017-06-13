package main;

/**
 * @author Nicolay
 * @version 1.0
 * @created 06-abr.-2017 5:23:27 p. m.
 */
public class SSD extends Decorator {

	private Paquete paquete;

	public SSD(){
		this.m_Paquete = paquete;
	}
	public String getDesc(){
		return m_Paquete.getDesc() + " + SSD";
	}

	
	public int almacenamiento() {
		return paquete.almacenamiento()+ 125;
	}
}//end SSD