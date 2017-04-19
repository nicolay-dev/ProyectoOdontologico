package main;

import logic.AgregadoC;
import logic.Carro;
import logic.Iterador;

public class Run {

	public static void main(String[] args) {
        
		System.out.println("Test del patron Iterator");
		System.out.println("-------------------------");
		
        AgregadoC agregado = new AgregadoC();
        Iterador iterador = agregado.getIterador();

        Carro test = (Carro) iterador.primero();
        System.out.println("Primer Vehiculo:\n" + test);

        System.out.println("Todos los vehiculos agregados");
        iterador.primero();
        while( iterador.haySiguiente() == true ) {
            System.out.println(iterador.siguiente() );
        }
  
   
	    

	}

}
