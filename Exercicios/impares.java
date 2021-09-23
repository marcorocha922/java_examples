package Exercicios;

import java.util.Scanner;

public class impares {
    public static void main(String[] args) {
        //variáveis
        int val1, val2; 
        
        //Scanner do teclado
        Scanner teclado = new Scanner(System.in); 
        
        //Introdução do primeiro valor
        System.out.print("Introduza o 1º valor: ");
        val1 = teclado.nextInt();
        while(val1<0){
            System.out.print("AVISO! O valor tem de ser positivo: ");
            val1 = teclado.nextInt();
        }
        
        //Introdução do segundo valor
        System.out.print("Introduza o 2º valor: ");
        val2 = teclado.nextInt();
        while(val2<0){
            System.out.print("AVISO! O valor tem de ser positivo: ");
            val2 = teclado.nextInt();
        }
        
        //Desligar scanner
        teclado.close();

        //Troca valores
        if(val1 > val2){
            int aux = val2;
            val2 = val1;
            val1 = aux;
        }

        //apresentação dos valores
        System.out.print(val1 + " ---> ");
        for(int i=val1+1; i<val2; i++){
             if(i%2!=0){
                 System.out.print(i + " ");
             }
        }
        System.out.print(" <--- " + val2);
    }
}
