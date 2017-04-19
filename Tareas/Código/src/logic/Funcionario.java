package logic;

/**
 *
 * @author
 */
public abstract class Funcionario {
    
    
    public String verIndefificacion (){
        return obtenerCargo()+ " con código: " + obtenerIdentificacion();
    }
    
     protected abstract  String obtenerCargo();
     protected abstract  String obtenerIdentificacion();
     
    
}
