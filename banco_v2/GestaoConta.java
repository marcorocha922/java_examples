package banco_v2;

import java.util.Scanner;
import java.util.ArrayList;

public class GestaoConta {
    public static void main(String[] args) {

        // Declaração de variáveis e objectos
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Conta> contas = new ArrayList<Conta>();

        //Teste da Classe ContaCliente ** Não relevante
        // Cliente clt1 = new Cliente(1000, "Marco", "Sobreda", "12345");
        // Conta cnt1 = new Conta(1000, clt1.mostrar_num_cliente());
        // ContaCliente cc1 = new ContaCliente(cnt1, clt1);
        // cc1.toString();

        int num_conta = 1000, num_cliente = 1000, n_cnt = 0, n_clt = 0;
        char rep = 's', opcao, inicio = 'n';
        

        Scanner teclado = new Scanner(System.in); 

        //Menú de criação e escolha de conta
        do{
            do{
                inicio = 'n';
                rep = 's';
                System.out.println("A. Criar um cliente.");
                System.out.println("B. Escolher cliente.");
                System.out.println("C. Sair.");
                System.out.println("----------------------------------");
                opcao = teclado.next().toUpperCase().charAt(0);
    
                switch(opcao){
                    case 'A':{
                        System.out.println("\nInsira o nome: ");
                        String n = teclado.next();
                        System.out.println("Insira a morada: ");
                        String m = teclado.next();
                        System.out.println("Insira o NIF: ");
                        String num = teclado.next();
                        System.out.println("\nNúmero de cliente atribuído: " + num_cliente + "\n");

                        clientes.add( new Cliente(num_cliente, n, m, num));
                        num_cliente++;
                        break;
                    }

                    case 'B':{
                        boolean found = false;
                        do{
                            System.out.println("\nInsira o número de cliente: ");
                            n_clt = teclado.nextInt();
    
                            for( Cliente clt : clientes){
                                if( clt.mostrar_num_cliente() == n_clt){
                                    found = true;
                                }
                            }

                            if( found == false){
                                System.out.println("\nCliente não encontrado.");
                            }

                        }while(found == false);
                        break;
                    }

                    case 'C':{
                        rep = 'n';
                        break;
                    }
                    default:
                        System.out.println("Opção inválida.\n");
                        opcao = 'A';
                }
            }while(opcao == 'A');


            if(rep == 's'){
                do{
                    boolean existe = false;
                    do{
                        for(Conta cnt : contas){
                            if(cnt.mostrar_num_cliente() == n_clt){
                                existe = true;
                            }
                        }
                        System.out.println("*** Nrº cliente: " + clientes.get(n_clt - 1000).mostrar_num_cliente() + " ***");
                        System.out.println("\nA. Criar conta");
                        System.out.println("B. Escolher conta");
                        System.out.println("C. Ver dados de cliente");
                        System.out.println("D. Sair");
                        System.out.println("----------------------------------");
                        opcao = teclado.next().toUpperCase().charAt(0);
                        if(opcao == 'B' && existe == false){
                            System.out.println("Não existe nenhuma conta criada para este cliente. Por favor crie uma conta primeiro");
                        }
                    }while(opcao == 'B' && existe == false);

                    switch(opcao){
                        case 'A': {
                            contas.add(new Conta(num_conta, n_clt));
                            System.out.println("\nConta criada com o número: " + num_conta + "\n\n");
                            num_conta++;
                            break;
                        }

                        case 'B': {
                            for(Conta cnt : contas){
                                if(cnt.mostrar_num_cliente() == n_clt){
                                    System.out.println(cnt.mostrar_num());
                                }
                            }
                            boolean found = false;
                        do{
                            System.out.println("\nInsira o número da conta: ");
                            n_cnt = teclado.nextInt();
                            for( Conta cnt : contas){
                                if(cnt.mostrar_num_cliente() == n_clt){
                                    if(cnt.mostrar_num() == n_cnt){
                                        found = true;
                                    }
                                }
                            }
                            if(found == false){
                                System.out.println("Conta não encontrada");
                            }
                        }while(found == false);
                            break;
                        }

                        case 'C': {
                            System.out.println("\nNome: " + clientes.get(n_clt - 1000).mostrar_nome());
                            System.out.println("Morada: " + clientes.get(n_clt - 1000).mostrar_morada());
                            System.out.println("NIF: " + clientes.get(n_clt - 1000).mostrar_nif());
                            System.out.println("Número de cliente: " + clientes.get(n_clt - 1000).mostrar_num_cliente() + "\n");
                            break;
                        }

                        case 'D': {
                            rep = 'n';
                            break;
                        }

                        default:
                        System.out.println("Opção inválida.");
                    }

                }while(opcao == 'A' || opcao == 'C');
            }
            
            //Menú de movimentação de conta
            if(rep == 's'){
                do{
                    System.out.println("\n\n*** Nrº conta: " + contas.get(n_cnt - 1000).mostrar_num() + " ***\n");
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
                            System.out.println("Saldo: " + contas.get(n_clt - 1000).mostrar_saldo());
                            break;
                        }
                        case 'B': {
                            System.out.println("\nValor a depositar: ");
                            contas.get(n_clt - 1000).deposito();
                            break;
                        }
                        case 'C': {
                            System.out.println("\nValor a levantar: ");
                            contas.get(n_clt - 1000).levantamento();
                            break;
                        }
                        case 'D': {
                            contas.get(n_clt - 1000).ult_movim();
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
