
package calculadora;

import java.util.Scanner;

public class calculos {
    
    static float n1;
    static float n2;
    static float resta, suma, division, multiplicacion;
    
    public void ingreso(){
      Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el primer numero: ");
        n1 = entrada.nextFloat();
        System.out.print("ingrese el segundo numero: ");
        n2 = entrada.nextFloat();
    }
        
     public void suma() {
        suma=n1+n2;
        System.out.println("la suma es "+suma);
    }
     
     public void resta(){
     resta=n1-n2;
         System.out.println("La resta es: "+resta);
     }
     
     public void division(){
     division=n1/n2;
         System.out.println("La division es: "+division);
     }
     
     public void multiplicacion(){
     multiplicacion=n1*n2;
         System.out.println("La multiplicacion es: "+multiplicacion);
     }
    
    
}
