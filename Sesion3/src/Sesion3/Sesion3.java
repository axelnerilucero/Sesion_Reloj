
package Sesion3;


import icoo.fes.poo.Reloj;


public class Sesion3 {
    public static void main(String[] args) {
        Reloj wacho=new Reloj(10, 1, 50);
        wacho.mostrarHora();
        wacho.corregirTiempo();
        //wacho.incrementarSegundo();
        wacho.incrementarMinuto();
        //wacho.incrementarHora();
                
        
        
     /* Aqui habia hecho el programa y con esta parte funcione, pero recorde que 
        debia de contener los metodos de la clase
        */   
        
        
        
    
       //Esto es para que inicie ahí el reloj jeje
      //int hora=11, minuto=59, segundo=59;
                  
       /*while (true){
           
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
          
           segundo++;
           
           if(segundo==60){
             segundo=0;
             minuto++;
             if(minuto==60){
                minuto=0;
                hora++;
                if(hora==12){
                     hora=0;
            }            
              }  
                } 
           
        }*/
    }   
}
   
  
        




