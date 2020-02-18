
package icoo.fes.poo;

public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    public Reloj() {
        
    }

    public Reloj(int hora, int minuto, int segundo) {
        
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    public void mostrarHora() {
       System.out.println(this.hora+":"+this.minuto+":"+this.segundo);
    }
    
    public void corregirTiempo(){
           
           if (hora<10){
              System.out.print(0);
           }
           
           System.out.print(hora+":");
          
           if (minuto<10){
              System.out.print(0);
           }
           
           System.out.print(minuto+":");
           
           if (segundo<10){
              System.out.print(0);
           }
           
           System.out.println(segundo);
        
    }
    /*Cada incremento por si solo funciona, pero al ejecutar los tres, minutos se 
    vuelve loco y no para en 60, sino que continua lo que provoca que el contador 
    de horas nunca avance
    */
    public void incrementarSegundo(){
        while(true){
            segundo++;
            if (segundo==60){
                segundo=0;
                minuto++;
            }
        corregirTiempo();
        
        }
        
    }
    public void incrementarMinuto(){
        while(true){
            minuto++;
            if (minuto==60){
                minuto=0;
                hora++;
            }
        corregirTiempo();
        incrementarSegundo();
        
        }
        
    }
    public void incrementarHora(){
        while(true){
            hora++;
            if (hora==12){
                hora=0;
                minuto++;
            }
        corregirTiempo();
        incrementarSegundo();
        
        }
        
    }
          
}  
  
       

    

        
    
            
