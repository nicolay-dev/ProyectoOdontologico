package logic;
/**
 *
 * @author
 */
public class Docente extends Funcionario {
    
     private String DNI;
    
    public Docente(String dni){
        this.DNI = dni;
    }

    @Override
    protected String obtenerCargo() {
      return "Me identifico como Docente "; 
    }

    @Override
    protected String obtenerIdentificacion() {
        return DNI;
    }
}
