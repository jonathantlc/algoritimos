
import java.util.Scanner;


public class exe01 {
    
/*1. Dado um número, verificar se ele é maior que
100. Se for, o algoritmo deve somar 150 a esse
número. No final, imprimir o resultado da soma.*/
    
    public static void main(String[] args) {
      Scanner js = new Scanner(System.in);
      
      int numero, soma;
      
        System.out.print(" Digite numero ");
        numero = js.nextInt();
        
        if (numero > 100){
            soma = numero + 150;
            System.out.println("A soma do " + numero + " + 150 e " + soma );
        }else{
            System.out.println(" o numero digitado e " + numero);
        }
      
      
    }
    
}
