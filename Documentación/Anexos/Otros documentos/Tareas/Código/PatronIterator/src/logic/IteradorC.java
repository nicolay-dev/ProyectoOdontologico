package logic;

public class IteradorC implements Iterador
{
     private AgregadoC agregado;
     private int posicion = 0;
  
    public IteradorC( AgregadoC agregado ){
         this.agregado = agregado;
    }
    
    @Override
     public Object primero(){
        Object obj = null;
        if(this.agregado.datos.isEmpty() == false ){
            this.posicion = 0;
            obj = this.agregado.datos.firstElement();
        }return obj;
    }
    
    @Override
     public Object siguiente(){
        Object obj = null;
        if((this.posicion ) < this.agregado.datos.size() ){
            obj = this.agregado.datos.elementAt(this.posicion);
            this.posicion = this.posicion + 1;
        }return obj;
    }
   
    @Override
     public boolean haySiguiente(){
        boolean result = false;
        if(this.posicion < (this.agregado.datos.size() ) ){
            result = true;
        }return result;
    }
   
    @Override
     public Object getActual(){
        Object obj = null;
        if(this.posicion < this.agregado.datos.size() ){
            obj = this.agregado.datos.elementAt( this.posicion );
        }return obj;
    }
}