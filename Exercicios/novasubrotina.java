package Exercicios;

import java.util.Scanner;

public class novasubrotina {

    static double calc_media(double[] arg_notas){
        double soma = 0;
        int num_notas = arg_notas.length;
        for(int i = 0; i < num_notas; i++){
            soma += arg_notas[i];
        }
        return (soma / num_notas);
    }

    static String aprov(double arg_media){
        if(arg_media >=12){
            return "Aprovado";
        }else if(arg_media < 8){
            return "Reprovado";
        }else{
            return "Oral";
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double[] notas = new double[5];
        double media;

        for(int i = 0; i<5; i++){
            do{
                System.out.println("Insira a nota do " + (i+1) + "º teste: ");
                notas[i] = teclado.nextDouble();
            }while(notas[i]<0 || notas[i]>20);
            
        }
        teclado.close();

        media = calc_media(notas);
        System.out.println(aprov(media));
    }
}
