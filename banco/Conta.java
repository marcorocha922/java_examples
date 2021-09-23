package banco;

import java.util.Scanner;
import java.util.ArrayList;

class Conta {
    Scanner teclado = new Scanner(System.in);

    private double saldo = 0, valor_prov, saldo_prov;
    private int num_conta;
    private String nome;
    

    ArrayList<Double> valor = new ArrayList<Double>(); // 
    ArrayList<String> movimentos = new ArrayList<String>();


    //double[] valor = new double[5]; // Array para coloção dos valores em movimento.
    //String[] movimentos = new String[5]; //Array para definir se é depósito ou levantamento.
    
    /*public Conta(int i){
        num_conta = i;
    }*/

    void set_nome(){
        nome = teclado.next();
    }

    void num_conta(int i){
        num_conta = i;
    }

    int mostrar_num(){
        return num_conta;
    }

    String mostrar_nome(){
        return nome;
    }

    // Impressão do saldo
    void print_saldo(){ 
        System.out.println("\nO saldo actual é : " + saldo + "\n");
    }

    // Depósitos. Utilizar o arraycopy para recolocar todos os valores, e colocar o novo valor na posição 0.
    // Aumentar o saldo no valor de depósito. 
    //imprimir o saldo
    void deposito(){ 
        //System.arraycopy(valor, 0, valor, 1, 4);
        //System.arraycopy(movimentos, 0, movimentos, 1, 4);
        System.out.println("\nInsira a quantia que deseja depositar : ");
        valor.add(Math.abs(teclado.nextDouble()));
        //valor[0] = teclado.nextDouble();
        saldo += valor.get(valor.size()-1);
        movimentos.add("Deposito");
        //movimentos[0] = "Deposito";
        print_saldo();
    }
    void levantamento(){ // Levantamentos. Utilizar o arraycopy para recolocar todos os valores, e colocar o novo valor na posição 0.
        do{
            System.out.println("\nInsira a quantia que deseja levantar : ");
            valor_prov = Math.abs(teclado.nextDouble());
            saldo_prov = saldo;
            saldo_prov -= valor_prov;
            if(saldo_prov < 0){
                System.out.println("Não pode ter a sua conta abaixo de 0€(" + saldo_prov + "), por favor insira outro valor.");
            }
        }while(saldo_prov < 0);

        //System.arraycopy(valor, 0, valor, 1, 4);
        //System.arraycopy(movimentos, 0, movimentos, 1, 4);
        //valor[0] = valor_prov;
        valor.add(valor_prov);
        saldo -= valor.get(valor.size()-1);
        //saldo -= valor[0];
        movimentos.add("Levantamento");
        //movimentos[0] = "Levantamento";
        print_saldo();
    }

    void ult_movim(){
        System.out.println("\n\n5 últimos movimentos do mais recente para o mais antigo: ");
        for(int i = movimentos.size()-1; i >= movimentos.size()-5 && i >= 0; i--){
            /*if(movimentos[i] != null){
                System.out.println("- " + movimentos[i] + ": " + valor[i] + "€.");
            }*/
            System.out.println("- " + movimentos.get(i) + ": " + valor.get(i) + "€.");
        }
        print_saldo();
    }
}
