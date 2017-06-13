package logic;

/**
 *
 * @author
 */
public class Main {
    
    public static void main(String[] args) {
        Funcionario f = new Administrativo("100");
        System.out.println(f.verIndefificacion());
        f = new Docente("AC500");
        System.out.println(f.verIndefificacion()); 
        f = new Ocasional("DZ1000");
        System.out.println(f.verIndefificacion());
        
    }
    
}
