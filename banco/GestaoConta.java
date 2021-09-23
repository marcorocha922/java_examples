package banco;

import java.util.Scanner;
import java.util.ArrayList;

public class GestaoConta {
    public static void main(String[] args) {

        // Declaração de variáveis e objectos
        ArrayList<Conta> contas = new ArrayList<Conta>();

        //Conta[] contas = new Conta[10];
        int i = 0, num_conta = 0;
        char rep = 's', opcao, inicio = 'n';
        
        //String nome_conta;

        Scanner teclado = new Scanner(System.in); 
        /*contas[0] = new Conta();
        contas[1] = new Conta();
        contas[0].nome = "Marco";
        contas[1].nome = "André";
        for(int y = 0; y < 2; y++){
            System.out.println(contas[y].nome);
        }*/

        //Menú de criação e escolha de conta
        do{
            do{
                inicio = 'n';
                rep = 's';
                System.out.println("A. Criar uma conta.");
                System.out.println("B. Escolher conta a movimentar.");
                System.out.println("C. Sair.");
                System.out.println("----------------------------------");
                opcao = teclado.next().toUpperCase().charAt(0);
    
                switch(opcao){
                    case 'A':{
                        //contas[i] = new Conta();
                        
                        contas.add( new Conta());
                        contas.get(i).num_conta(i+1);
                        System.out.println("Insira o nome: ");
                        contas.get(i).set_nome();
                        
                        //conta1.nome = teclado.next();
                        //contas.set(i, conta1);
                        //contas.nome.set(i, teclado.next());
                        //contas.set(i, contas.get(i).nome = teclado.next());
                        //contas.get(i).nome = teclado.next();
                        i++;
                        break;
                    } 
                    case 'B':{
                        boolean found = false;
                        do{
                            System.out.println("\nEscolha o número da conta a movimentar: ");
                            
                            for( Conta cnt : contas){
                                System.out.println(cnt.mostrar_num() + " - " + cnt.mostrar_nome());
                            }
                            num_conta = teclado.nextInt();
    
                            for( Conta cnt : contas){
                                if( cnt.mostrar_num() == num_conta){
                                    found = true;
                                    break;
                                }else{
                                    System.out.println("\nConta não encontrada.");
                                    break;
                                }
                            }
                        }while(found == false);
                        

                        /*for(int y = 0; y < contas.size(); y++){
                            System.out.println(contas.get(y).mostrar_num() + " - " + contas.get(y).mostrar_nome());
                        }*/
                        
                        /*for(int y = 0; y < contas.size(); y++){
                            if(contas.get(y).mostrar_nome() == nome_conta){
                                num_conta = y;
                            }
                        }*/
                        break;
                    }
                    case 'C':{
                        rep = 'n';
                        break;
                    }
                    default:
                        System.out.println("Opção inválida.");
                }
            }while(opcao == 'A');
            
            //Menú de movimentação de conta
            if(rep == 's'){
                do{
                    System.out.println("A. Visualizar o saldo ");
                    System.out.println("B. Depositar valor");
                    System.out.println("C. Levantar valor");
                    System.out.println("D. Últimos movimentos");
                    System.out.println("E. Voltar ao menú inicial");
                    System.out.println("F. Sair");
                    System.out.println("----------------------------------");
                    opcao = teclado.next().toUpperCase().charAt(0);
        
                    switch(opcao){
                        case 'A': {
                            contas.get(num_conta - 1).print_saldo();
                            break;
                        }
                        case 'B': {
                            contas.get(num_conta - 1).deposito();
                            break;
                        }
                        case 'C': {
                            contas.get(num_conta - 1).levantamento();
                            break;
                        }
                        case 'D': {
                            contas.get(num_conta - 1).ult_movim();
                            break;
                        }
                        case 'E': {
                            inicio = 's';
                            rep = 'n';
                            break;
                        }
                        case 'F': {
                            rep = 'n';
                            break;
                        }
                    }
                }while(rep == 's');
            }
        }while(inicio == 's');
        teclado.close();
    }
}
