package logic;

public class Carro {
	
	private String placa;
	private String marca;
	private int costo;
	
	public Carro() {
		// TODO Auto-generated constructor stub
	}
	public Carro(String placa, String marca, int costo) {
		// TODO Auto-generated constructor stub
		
		this.costo = costo;
		this.marca = marca;
		this.placa = placa;
	}
	
	@Override
	public String toString() {
		String result = "carro: " + placa + "\nmarca:"+ marca+ "\ncosto:"+costo +"\n****************";
		return result;
	}
}
