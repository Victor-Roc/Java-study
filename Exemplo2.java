import java.util.Scanner;
    public class Exemplo2 {
    
        public static void main (String[]args){
        
            Scanner sc = new Scanner(System.in);
            
            int maior = 0;
            int [] numeros = new int[] {50, 90 , 56 , 85 , 100};
            
            for ( int i = 0; i < 5; i++){
                if (numeros[i] > maior){
                    maior = numeros[i];
                }
            }
            
            System.out.println("O maior numero é : " + maior );
    }
}