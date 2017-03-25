
import java.util.Scanner;


public class exe02 {
    
/*2. Dados dois números, verificar se a divisão do
primeiro número pelo segundo é exata (o resto
da divisão deve ser igual a 0). Se for, o algoritmo
deve imprimir a mensagem “A divisão de (número
1) por (número 2) é exata”.*/
    
    public static void main(String[] args) {
        Scanner js = new Scanner(System.in);
        
        double numero1, numero2, divisao;
        
        System.out.println(" Digite numero 1 ");
        numero1 =  js.nextDouble();
        
        System.out.println(" Digite numero 2 ");
        numero2 = js.nextDouble();
        
        divisao = numero1 % numero2;
        
        if(divisao == 0 ){
            System.out.println("A divisão e EXATA");
            
         }else{
            System.out.println("Divisão não e exata");
        }
        
        
        
    }
    
}
