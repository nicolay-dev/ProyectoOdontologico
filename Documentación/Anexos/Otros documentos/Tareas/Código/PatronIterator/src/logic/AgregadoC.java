package logic;

import java.util.Vector;

public class AgregadoC implements Agregado{
     protected Vector datos = new Vector();
   
    public AgregadoC() {
        this.llenar();
    }
   
    @Override
     public Iterador getIterador(){
        return new IteradorC( this );
    }
    public void llenar(){
        this.datos.add( new Carro("XXX123", "Hiunday", 90000000));
        this.datos.add( new Carro("ABC456", "Audi", 100000000));
        this.datos.add( new Carro("ASD789", "Porche", 160000000));
        this.datos.add( new Carro("QWE963", "Chevrolet", 40000000));
        this.datos.add( new Carro("RTY147", "Mazda", 60000000));
        this.datos.add( new Carro("YUS321", "Hiunday", 90000000));
    }
}