
import java.util.Scanner;


public class exe04 {
    
    /*4. Calcular a conta de consumo de energia elétrica
de um consumidor, dado o kWh consumido, de
acordo com a tabela abaixo:
KW Consumido Valor do kWh
< 150 kWh R$ 0,20
> 150 e < 500 R$ 0,25
> 500 R$ 0,30
Valor mínimo da conta R$ 11,90*/
    
    public static void main(String[] args) {
        Scanner js = new Scanner(System.in);
        
          double consumo, valor1, valor2, valor3;
       
        
        System.out.println(" Dgite KWh ");
        consumo = js.nextDouble();
        
        if(consumo < 150d){
            valor1 = 11.90d * 0.20d;
            System.out.println(" O valor da sua conta de energia e de " + valor1 );
        }else if(consumo > 150d && consumo < 500d){
            valor2 = 11.90 * 0.25d;
            System.out.println(" O valor da sua conta de energia e de " + valor2);
            
        }else{
            valor3 = 11.90 * 0.30;
            System.out.println(" O valor da sua conta de energia e de " + valor3);
            
            
            
        }
        
        
        
        
    }
}
