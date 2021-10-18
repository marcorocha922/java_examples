package assoc_desp;

import java.util.Scanner;
import java.util.ArrayList;

public class Clube {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char op, rep, mod;
        // ArrayList pessoas, permite controlar todos os elementos através de uma só base de dados
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        // Criação de 3 sócios, e posterior criação de 2 atletas, 1 deles de um sócio criado
        
        pessoas.add(new Socio(new Pessoa("Marco", "Rocha", "123464545", 1992, 6, 9)));
        pessoas.add(new Socio(new Pessoa("André", "Alves", "987654231", 1994, 9, 6)));
        pessoas.add(new Socio(new Pessoa("Marco", "Alves", "545698745", 1993, 10, 15)));

        pessoas.add(new Atleta(new Socio(new Pessoa("Cristiano", "Ronaldo", "7777777777", 1980, 7, 7)),
                new Futsal("Pivot", "Destro")));
        
        pessoas.set(0, new Atleta(new Socio((Socio)pessoas.get(0)) , new Futsal("Fixo", "Ambidestro")));

        // inicio do menu principal
        do {
            do {
                System.out.println("[1] - Inserir elementos na base de dados; [2] - Ver elementos da base de dados:");
                op = teclado.next().toUpperCase().charAt(0);
            } while (op != '1' && op != '2');

            switch (op) {
                case '1': {
                    do {
                        do {
                            System.out.println("\n[1] - Inserir um novo Sócio; [2] -Inserir um novo Atleta: ");
                            op = teclado.next().toUpperCase().charAt(0);
                        } while (op != '1' && op != '2');

                        switch (op) {
                            case '1': {
                                String nome, apelido, nif;
                                int ano, mes, dia;

                                System.out.println("\nPrimeiro nome: ");
                                nome = teclado.next();

                                System.out.println("\nApelido: ");
                                apelido = teclado.next();

                                System.out.println("\nNIF: ");
                                nif = teclado.next();

                                do {
                                    System.out.println("\nAno Nascimento: yyyy");
                                    ano = teclado.nextInt();
                                } while (ano > 2021);

                                do {
                                    System.out.println("\nMês: mm");
                                    mes = teclado.nextInt();
                                } while (mes < 1 || mes > 12);

                                do {
                                    System.out.println("\nDia: dd");
                                    dia = teclado.nextInt();
                                } while (dia < 1 || dia > 31);

                                pessoas.add(new Socio(new Pessoa(nome, apelido, nif, ano, mes, dia)));
                                break;
                            }
                            case '2': {
                                do {
                                    System.out.println("\n[1] - Atleta já é sócio; [2] - Atleta ainda não é sócio: ");
                                    op = teclado.next().toUpperCase().charAt(0);
                                } while (op != '1' && op != '2');

                                do {
                                    System.out.println(
                                            "\nModalidade: [1] - Futsal, [2] - Ténis de mesa, [3] - Corrida: ");
                                    mod = teclado.next().toUpperCase().charAt(0);
                                } while (op != '1' && op != '2' && op != '3');

                                switch (op) {
                                    case '1': {
                                        int num_socio_escolhido = 0;
                                        ArrayList <Integer> nums_socio = new ArrayList<Integer>();
                                        Boolean found = false;

                                        do{

                                            for(Pessoa pes : pessoas){
                                                if( !(pes instanceof Atleta)){
                                                    System.out.println(pes.getNome() + " " + pes.getApelido() + " : "
                                                    + pes.getNumero_socio());
                                                    nums_socio.add(pes.getNumero_socio());
                                                }
                                            }

                                            System.out.println("\nInsira o número de sócio pretendido: ");
                                            num_socio_escolhido = teclado.nextInt();

                                            for(Integer i : nums_socio){
                                                if(i == num_socio_escolhido){
                                                    found = true;
                                                }
                                            }

                                            if(found == false){
                                                System.out.println("\nNúmero de sócio inválido. Escolha novamente\n");
                                            }
                                        } while (found == false);

                                        switch (mod) {
                                            case '1': {
                                                String posicao, tipo;

                                                System.out.println("\nPosição: ");
                                                posicao = teclado.next();

                                                System.out.println("\nPé dominante: ");
                                                tipo = teclado.next();

                                                pessoas.set(Socio.findIndexPessoa(pessoas, num_socio_escolhido), new Atleta(new Socio((Socio)pessoas.get(Socio.findIndexPessoa(pessoas, num_socio_escolhido))), new Futsal(posicao, tipo)));

                                                break;
                                            }
                                            case '2': {
                                                String tipo;
                                                int esq, dir;

                                                System.out.println("\nQual a mão de jogo (esquerda, direita): ");
                                                tipo = teclado.next();

                                                do {
                                                    System.out.println("\nSkill de esquerda (1-10): ");
                                                    esq = teclado.nextInt();
                                                } while (esq < 1 || esq > 10);

                                                do {
                                                    System.out.println("\nSkill de direita (1-10): ");
                                                    dir = teclado.nextInt();
                                                } while (dir < 1 || dir > 10);

                                                pessoas.set(Socio.findIndexPessoa(pessoas, num_socio_escolhido), new Atleta(new Socio((Socio)pessoas.get(Socio.findIndexPessoa(pessoas, num_socio_escolhido))), new TenisMesa(tipo, esq, dir)));

                                                break;
                                            }
                                            case '3': {
                                                String distancia, piso;

                                                System.out.println("\nQual a distância: ");
                                                distancia = teclado.next();

                                                System.out.println(
                                                        "\nQual o tipo de piso (corta-mato, estrada, pista): ");
                                                piso = teclado.next();

                                                pessoas.set(Socio.findIndexPessoa(pessoas, num_socio_escolhido), new Atleta(new Socio((Socio)pessoas.get(Socio.findIndexPessoa(pessoas, num_socio_escolhido))), new Corrida(distancia, piso)));

                                                char add;
                                                do {
                                                    System.out.println(
                                                            "\nAdicionar mais distâncias? [1] - Sim; [2] - Não:");
                                                    add = teclado.next().toUpperCase().charAt(0);
                                                    if (add == '1') {
                                                        System.out.println("\nQual a distância a adicionar: ");
                                                        String dist = teclado.next();

                                                        pessoas.get(Socio.findIndexPessoa(pessoas, num_socio_escolhido)).getModalidade().addDistancias(dist);

                                                    }
                                                } while (add == '1');
                                                break;
                                            }
                                        }
                                        break;
                                    }
                                    case '2': {

                                        switch (mod) {
                                            case '1': {
                                                String nome, apelido, nif, posicao, tipo;
                                                int ano, mes, dia;

                                                System.out.println("\nPrimeiro nome: ");
                                                nome = teclado.next();

                                                System.out.println("\nApelido: ");
                                                apelido = teclado.next();

                                                System.out.println("\nNIF: ");
                                                nif = teclado.next();

                                                do {
                                                    System.out.println("\nAno Nascimento: yyyy");
                                                    ano = teclado.nextInt();
                                                } while (ano > 2021);

                                                do {
                                                    System.out.println("\nMês: mm");
                                                    mes = teclado.nextInt();
                                                } while (mes < 1 || mes > 12);

                                                do {
                                                    System.out.println("\nDia: dd");
                                                    dia = teclado.nextInt();
                                                } while (dia < 1 || dia > 31);

                                                System.out.println("\nPosição: ");
                                                posicao = teclado.next();

                                                System.out.println("\nPé dominante: ");
                                                tipo = teclado.next();

                                                pessoas.add(new Atleta(new Socio(new Pessoa(nome, apelido, nif, ano, mes, dia)), new Futsal(posicao, tipo)));

                                                break;
                                            }
                                            case '2': {
                                                String nome, apelido, nif, tipo;
                                                int ano, mes, dia, esq, dir;

                                                System.out.println("\nPrimeiro nome: ");
                                                nome = teclado.next();

                                                System.out.println("\nApelido: ");
                                                apelido = teclado.next();

                                                System.out.println("\nNIF: ");
                                                nif = teclado.next();

                                                do {
                                                    System.out.println("\nAno Nascimento: yyyy");
                                                    ano = teclado.nextInt();
                                                } while (ano > 2021);

                                                do {
                                                    System.out.println("\nMês: mm");
                                                    mes = teclado.nextInt();
                                                } while (mes < 1 || mes > 12);

                                                do {
                                                    System.out.println("\nDia: dd");
                                                    dia = teclado.nextInt();
                                                } while (dia < 1 || dia > 31);

                                                System.out.println("\nQual a mão de jogo (esquerda, direita): ");
                                                tipo = teclado.next();

                                                System.out.println("\nSkill de esquerda (1-10): ");
                                                esq = teclado.nextInt();

                                                System.out.println("\nSkill de direita (1-10): ");
                                                dir = teclado.nextInt();

                                                pessoas.add(new Atleta(new Socio(new Pessoa(nome, apelido, nif, ano, mes, dia)), new TenisMesa(tipo, esq, dir)));

                                                break;
                                            }
                                            case '3': {
                                                String nome, apelido, nif, distancia, piso;
                                                int ano, mes, dia;

                                                System.out.println("\nPrimeiro nome: ");
                                                nome = teclado.next();

                                                System.out.println("\nApelido: ");
                                                apelido = teclado.next();

                                                System.out.println("\nNIF: ");
                                                nif = teclado.next();

                                                do {
                                                    System.out.println("\nAno Nascimento: yyyy");
                                                    ano = teclado.nextInt();
                                                } while (ano > 2021);

                                                do {
                                                    System.out.println("\nMês: mm");
                                                    mes = teclado.nextInt();
                                                } while (mes < 1 || mes > 12);

                                                do {
                                                    System.out.println("\nDia: dd");
                                                    dia = teclado.nextInt();
                                                } while (dia < 1 || dia > 31);

                                                System.out.println("\nQual a distância: ");
                                                distancia = teclado.next();

                                                System.out.println(
                                                        "\nQual o tipo de piso (corta-mato, estrada, pista): ");
                                                piso = teclado.next();

                                                pessoas.add(new Atleta(new Socio(new Pessoa(nome, apelido, nif, ano, mes, dia)), new Corrida(distancia, piso)));

                                                char add;
                                                do {
                                                    System.out.println(
                                                            "\nAdicionar mais distâncias? [1] - Sim; [2] - Não:");
                                                    add = teclado.next().toUpperCase().charAt(0);
                                                    if (add == '1') {
                                                        System.out.println("\nQual a distância a adicionar: ");
                                                        String dist = teclado.next();

                                                        pessoas.get(pessoas.size() - 1).getModalidade().addDistancias(dist);
                                                    }
                                                } while (add == '1');

                                                break;
                                            }
                                        }

                                        break;
                                    }
                                }
                                break;
                            }
                        }

                        do {
                            System.out.println("\nAdicionar mais elementos? [1] - Sim; [2] - Não: ");
                            rep = teclado.next().toUpperCase().charAt(0);
                        } while (rep != '1' && rep != '2');

                    } while (rep != '2');
                    break;
                }
                case '2': {
                    do {
                        System.out.println(
                                "\n[1] - Ver todos os sócios; [2] - Ver todos os atletas; [3] - Ver sócios que não são atletas:");
                        op = teclado.next().toUpperCase().charAt(0);
                    } while (op != '1' && op != '2' && op != '3');

                    switch(op){
                        case '1' : {
                            for(Pessoa pes : pessoas){
                                System.out.println(pes + "\n");
                            }
                            break;
                        }

                        case '2' : {
                            for(Pessoa pes : pessoas){
                                if(pes instanceof Atleta){
                                    System.out.println(pes+ "\n");
                                }
                            }
                            break;
                        }

                        case '3' : {
                            for(Pessoa pes : pessoas){
                                if( !(pes instanceof Atleta)){
                                    System.out.println(pes+ "\n");
                                }
                            }
                            break;
                        }
                    }

                    break;
                }
            }

            System.out.println("\n[1] - Voltar ao menú principal; [2] - Sair do programa:");
            rep = teclado.next().toUpperCase().charAt(0);

        } while (rep != '2');

        teclado.close();
    }
}
