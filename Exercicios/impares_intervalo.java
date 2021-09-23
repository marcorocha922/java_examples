package Exercicios;

import java.util.Scanner;

public class impares_intervalo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2;
        
        do{
            System.out.print("Introduza o primeiro valor:");
            num1 = teclado.nextInt();
        }while(num1<=0);
        
        do{
            System.out.print("Introduza o segundo valor:");
            num2 = teclado.nextInt();
        }while(num2<=0);

        teclado.close();

        if(num1>num2){
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }

        System.out.println("Primeiro número: " + num1 + "\nSegundo número: " + num2);
        System.out.print(num1 + " ---> ");
        for(int i = num1 + 1; i<num2; i++ ){
            if(i%2==1){
                System.out.print(i + " ");
            }
        }
        System.out.print(" <--- " + num2);
    }  

}
