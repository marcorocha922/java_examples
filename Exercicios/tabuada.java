package Exercicios;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        
    int numero;

    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduza um valor: ");
    numero = teclado.nextInt();
    teclado.close();

    for( int i=1; i<=10; i++){
        System.out.println(numero + " X " + i + " = " + numero*i);
    }
        
    }
}
