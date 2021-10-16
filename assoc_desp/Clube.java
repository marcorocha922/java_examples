package assoc_desp;

import java.util.Scanner;
import java.util.ArrayList;

public class Clube {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char op, rep, mod;
        // ArrayLists, para criação de sócios e de atletas
        ArrayList<Socio> socios = new ArrayList<Socio>();
        ArrayList<Atleta> atletas = new ArrayList<Atleta>();

        // Criação de 3 sócios, e posterior criação de 2 atletas, 1 deles de um sócio já
        // criado, e tirando esse sócio do ArrayList socios
        socios.add(new Socio(new Pessoa("Marco", "Rocha", "123464545", 1992, 6, 9)));
        socios.add(new Socio(new Pessoa("André", "Alves", "987654231", 1994, 9, 6)));
        socios.add(new Socio(new Pessoa("Marco", "Alves", "545698745", 1993, 10, 15)));

        atletas.add(new Atleta(new Socio(new Pessoa("Cristiano", "Ronaldo", "7777777777", 1980, 7, 7)),
                new Futsal("Pivot", "Destro")));
        atletas.add(new Atleta(socios.get(Socio.findIndexSocio(socios, 1)), new Futsal("Fixo", "Ambidestro")));
        socios.remove(Socio.findIndexSocio(socios, 1));

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

                                socios.add(new Socio(new Pessoa(nome, apelido, nif, ano, mes, dia)));
                                break;
                            }
                            case '2': {
                                do {
                                    System.out.println("\n[1] - Atleta já é sócio; [2] - Atleta ainda não é sócio: ");
                                    op = teclado.next().toUpperCase().charAt(0);
                                } while (op != '1' && op != '2');

                                do {
                                    System.out
                                            .println("\nModalidade: [1] - Futsal, [2] - Ténis de mesa, [3] - Corrida: ");
                                    mod = teclado.next().toUpperCase().charAt(0);
                                } while (op != '1' && op != '2' && op != '3');

                                switch (op) {
                                    case '1': {
                                        int num_socio_escolhido = 0;
                                        int maior_num_socio = 0;

                                        do {
                                            for (Socio soc : socios) {
                                                System.out.println(soc.getNome() + " " + soc.getApelido() + " : "
                                                        + soc.getNumero_socio());
                                                if (soc.getNumero_socio() > maior_num_socio) {
                                                    maior_num_socio = soc.getNumero_socio();
                                                }
                                            }

                                            System.out.println("\nInsira o número de sócio pretendido: ");
                                            num_socio_escolhido = teclado.nextInt();

                                        } while (num_socio_escolhido <= 0 || num_socio_escolhido > maior_num_socio);

                                        switch (mod) {
                                            case '1': {
                                                String posicao, tipo;

                                                System.out.println("\nPosição: ");
                                                posicao = teclado.next();

                                                System.out.println("\nPé dominante: ");
                                                tipo = teclado.next();

                                                atletas.add(new Atleta(
                                                        socios.get(Socio.findIndexSocio(socios, num_socio_escolhido)),
                                                        new Futsal(posicao, tipo)));
                                                socios.remove(Socio.findIndexSocio(socios, num_socio_escolhido));

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

                                                atletas.add(new Atleta(
                                                        socios.get(Socio.findIndexSocio(socios, num_socio_escolhido)),
                                                        new TenisMesa(tipo, esq, dir)));
                                                socios.remove(Socio.findIndexSocio(socios, num_socio_escolhido));

                                                break;
                                            }
                                            case '3': {
                                                String distancia, piso;

                                                System.out.println("\nQual a distância: ");
                                                distancia = teclado.next();

                                                System.out
                                                        .println("\nQual o tipo de piso (corta-mato, estrada, pista): ");
                                                piso = teclado.next();

                                                atletas.add(new Atleta(
                                                        socios.get(Socio.findIndexSocio(socios, num_socio_escolhido)),
                                                        new Corrida(distancia, piso)));
                                                socios.remove(Socio.findIndexSocio(socios, num_socio_escolhido));

                                                char add;
                                                do {
                                                    System.out.println(
                                                            "\nAdicionar mais distâncias? [1] - Sim; [2] - Não:");
                                                    add = teclado.next().toUpperCase().charAt(0);
                                                    if (add == '1') {
                                                        System.out.println("\nQual a distância a adicionar: ");
                                                        String dist = teclado.next();
                                                        atletas.get(atletas.size() - 1).corrida.addDistancias(dist);
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

                                                atletas.add(new Atleta(
                                                        new Socio(new Pessoa(nome, apelido, nif, ano, mes, dia)),
                                                        new Futsal(posicao, tipo)));

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

                                                atletas.add(new Atleta(
                                                        new Socio(new Pessoa(nome, apelido, nif, ano, mes, dia)),
                                                        new TenisMesa(tipo, esq, dir)));

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

                                                System.out
                                                        .println("\nQual o tipo de piso (corta-mato, estrada, pista): ");
                                                piso = teclado.next();

                                                atletas.add(new Atleta(
                                                        new Socio(new Pessoa(nome, apelido, nif, ano, mes, dia)),
                                                        new Corrida(distancia, piso)));

                                                char add;
                                                do {
                                                    System.out.println(
                                                            "\nAdicionar mais distâncias? [1] - Sim; [2] - Não:");
                                                    add = teclado.next().toUpperCase().charAt(0);
                                                    if (add == '1') {
                                                        System.out.println("\nQual a distância a adicionar: ");
                                                        String dist = teclado.next();
                                                        atletas.get(atletas.size() - 1).corrida.addDistancias(dist);
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

                    if (op == '1') {
                        for (Socio soc : socios) {
                            System.out.println(soc + "\n");
                        }
                        for (Atleta atl : atletas) {
                            System.out.println(atl.getInfoSocio() + "\n");
                        }
                    } else if (op == '2') {
                        for (Atleta atl : atletas) {
                            System.out.println(atl);
                            if(atl.modalidade_praticada == "Futsal"){
                                System.out.println(atl.futsal.toString());
                            }else if( atl.modalidade_praticada == "Ténis de Mesa"){
                                System.out.println(atl.tenisMesa.toString());
                            }else if( atl.modalidade_praticada == "Corrida"){
                                System.out.println(atl.corrida.toString());
                            }
                            System.out.println("\n");
                        }
                    } else if (op == '3') {
                        for (Socio soc : socios) {
                            System.out.println(soc + "\n");
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
