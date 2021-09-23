package banco_v2;

import java.util.Scanner;
import java.util.ArrayList;

class Conta {
    Scanner teclado = new Scanner(System.in);

    private double saldo, valor_prov, saldo_prov;
    private int num_conta;
    private int num_cliente;
    

    ArrayList<Double> valor = new ArrayList<Double>();
    ArrayList<String> movimentos = new ArrayList<String>();


    Conta(int num_cnt, int num_clt){
        num_conta = num_cnt;
        num_cliente = num_clt;
        saldo = 0;
    }

    int mostrar_num_cliente(){
        return num_cliente;
    }

    int mostrar_num(){
        return num_conta;
    }

    double mostrar_saldo(){
        return saldo;
    }

    void deposito(){ 
        //System.out.println("\nInsira a quantia que deseja depositar : ");
        valor.add(Math.abs(teclado.nextDouble()));
        saldo += valor.get(valor.size()-1);
        movimentos.add("Deposito");
        mostrar_saldo();
    }

    void levantamento(){ 
        do{
            //System.out.println("\nInsira a quantia que deseja levantar : ");
            valor_prov = Math.abs(teclado.nextDouble());
            saldo_prov = saldo;
            saldo_prov -= valor_prov;
            if(saldo_prov < 0){
                System.out.println("Não pode ter a sua conta abaixo de 0€(" + saldo_prov + "), por favor insira outro valor.");
            }
        }while(saldo_prov < 0);

        valor.add(valor_prov);
        saldo -= valor.get(valor.size()-1);
        movimentos.add("Levantamento");
        mostrar_saldo();
    }

    void ult_movim(){
        System.out.println("\n5 últimos movimentos: ");
        for(int i = movimentos.size()-1; i >= movimentos.size()-5 && i >= 0; i--){
            System.out.println("- " + movimentos.get(i) + ": " + valor.get(i) + "€.");
        }
        mostrar_saldo();
    }
}
