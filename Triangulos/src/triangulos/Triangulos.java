
package triangulos;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Servidor01
 */
public class Triangulos {
    public static void main(String[] args) {
        double a1=9, b1=7, c1=14, p1, area1=0;
        double a2=9, b2=6, c2=14, p2, area2=0;
       /* Scanner ler = new Scanner (System.in);
           
        System.out.print(" Informe o lado a do triangulo: ");
        a = ler.nextDouble();
        System.out.print(" Informe o lado b do triangulo: ");
        b = ler.nextDouble();
        System.out.print(" Informe o lado c do triangulo: ");
        c = ler.nextDouble(); */
        
        p1 = (a1+b1+c1)/2;
        
        System.out.println(p1);
         
        area1 = sqrt(p1*((p1-a1)*(p1-b1)*(p1-c1))); 
        
        System.out.printf("%.2f" , area1);
        System.out.print(" cm² ");
        System.out.println(" ");     
        
        
        p2 = (a2+b2+c2)/2;
        
        System.out.println(p2);
         
        area2 = sqrt(p2*((p2-a2)*(p2-b2)*(p2-c2))); 
        
        System.out.printf("%.2f" , area2);
        System.out.print(" cm² ");
        System.out.println(" "); 
        
        
        if (area1 > area2){
            System.out.println("A área do primeiro triangulo é a maior.");
        }
        if (area2 > area1){
            System.out.println("A área do segundo triangulo é a maior.");
        }
        if (area1 == area2){
            System.out.println("As áreas dos dois triangulos são iguais.");
        }
    }
    
}
