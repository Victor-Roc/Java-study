//Exercicio 4//

import java.util.Scanner;

public class Main {
    
    
    public static void isPar(int numero){
        
    if (numero % 2 == 0){
        System.out.println("true");
    }
    else {
        System.out.println("False");
    }
    
        
    }
    
    public static void main (String[]args){
        
    Scanner sc = new Scanner(System.in);
           
    System.out.println("Digite um nuemro inteiro tmj");
    int numero = sc.nextInt();
    isPar(numero);
        
    }
}