import java.util.Scanner;

    public class Main{
        
        public static void main (String[]args){
            
            Scanner sc = new Scanner(System.in);
            
            double[] nota = new double[5];
            
            for ( int i = 0; i < 5 ; i++){
                System.out.println("Digite sua nota" + (i+1));
                nota[i] = sc.nextDouble();
            }
            
                System.out.println("Notas armazenadas");
            for (int i = 0 ; i < nota.length ; i++){
                System.out.println("Nota" + (i+1) + ": " + nota[i]);
            }
        }
    }