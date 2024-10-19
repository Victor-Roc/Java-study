//Exercicio 5//

import java.util.Scanner;

public class Main{
    public static void exibirdiaDaSemana(int numero){
    
    switch (numero){
    case 1: System.out.println("domingo");
    break;
    
    case 2: System.out.println("segunda");
    break;
    
    case 3: System.out.println("terça");
    break;
    
    case 4: System.out.println("quarta");
    break;
    
    case 5: System.out.println("quinta");
    break;
    
    case 6: System.out.println("sexta");
    break;
    
    case 7: System.out.println("sábado");
    break;
    
    default: System.out.println("Dia da semana inválido");
    break;
    }
}
    public static void main(String[]args){
    exibirdiaDaSemana(1);
    }
}