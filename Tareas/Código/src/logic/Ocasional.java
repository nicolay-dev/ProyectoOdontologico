package logic;

/**
 *
 * @author
 */
public class Ocasional extends Funcionario{

    private String DNI;

    public Ocasional(String dni) {
        this.DNI = dni;
    }

    @Override
    protected String obtenerCargo() {
        return "Me identifico como docente Ocasional";
    }

    @Override
    protected String obtenerIdentificacion() {
        return DNI;
    }

}
