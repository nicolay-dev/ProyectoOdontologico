package logic;

/**
 *
 * @author
 */
public class Administrativo extends Funcionario{
    
    private String DNI;
    
    public Administrativo(String dni){
        this.DNI = dni;
    }

    @Override
    protected String obtenerCargo() {
      return "Me identifico como Administrador "; 
    }

    @Override
    protected String obtenerIdentificacion() {
        return DNI;
    }
    
}
