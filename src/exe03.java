
import java.util.Scanner;


public class exe03 {
    
    /*3. Dada a altura e o peso de uma pessoa,
determinar seu grau de obesidade. O grau de
obesidade é determinado pelo índice da massa
corpórea (Massa = Peso / Altura2 ) através da
tabela abaixo:
Massa Corpórea Grau de Obesidade
< 26 Normal
> 26 e < 30 Obeso
> 30 Obeso Mórbido*/
    
    public static void main(String[] args) {
        
        Scanner js= new Scanner(System.in);
        
        String nome;
       double altura, peso, massa;
        
        System.out.print(" digite nome: ");
        nome =js.nextLine();
        System.out.println( nome + " Digite a sua altura " );
        altura = js.nextDouble();
        System.out.println(" Digite peso ");
        peso = js.nextDouble();
        
        massa = peso / Math.pow(altura, altura);
        
        if( massa < 26d){
            System.out.println(" Seu peso esta NORMAL ");
        }else if(massa >= 26d && massa < 30d){
            System.out.println(" Você esta OBESO ");
            }else{
            System.out.println("OBSIDADE MORBIDA ");
        }
       
        
        
    }
    
}
