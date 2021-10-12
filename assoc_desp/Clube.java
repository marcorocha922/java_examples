package assoc_desp;

import java.util.Scanner;
import java.util.ArrayList;

public class Clube {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char op, rep;

        ArrayList<Socio> socios = new ArrayList<Socio>();
        ArrayList<Atleta> atletas = new ArrayList<Atleta>();
        // ArrayList <Modalidade> modalidades = new ArrayList<Modalidade>();
        // ArrayList <Futsal> j_futsal = new ArrayList<Futsal>();

        Socio s1 = new Socio(new Pessoa("Marco", "Rocha", "123464545", 1992, 5, 9));

        do {

            System.out.println("Pretende inserir um novo Sócio [1] ou um novo Atleta[2]?: ");
            op = teclado.next().toUpperCase().charAt(0);

            switch (op) {
                case '1': {
                    String nome, apelido, nif;
                    int ano, mes, dia;
                    System.out.println("Primeiro nome: ");
                    nome = teclado.next();
                    System.out.println("Apelido: ");
                    apelido = teclado.next();
                    System.out.println("NIF: ");
                    nif = teclado.next();
                    System.out.println("Ano Nascimento: ");
                    ano = teclado.nextInt();
                    System.out.println("Mês: ");
                    mes = teclado.nextInt();
                    System.out.println("Dia: ");
                    dia = teclado.nextInt();
                    socios.add(new Socio(new Pessoa(nome, apelido, nif, ano, mes, dia)));
                    break;
                }
                case '2': {
                    System.out.println("O atleta já é sócio[1] ou não é sócio[2]: ");
                    op = teclado.next().toUpperCase().charAt(0);

                    switch (op) {
                        case '1': {
                            String posicao, tipo;
                            System.out.println("Posição: ");
                            posicao = teclado.next();
                            System.out.println("Pé dominante: ");
                            tipo = teclado.next();
                            atletas.add(new Atleta(s1, new Futsal(posicao, tipo)));
                            break;
                        }
                        case '2': {
                            String nome, apelido, nif, posicao, tipo;
                            int ano, mes, dia;
                            System.out.println("Primeiro nome: ");
                            nome = teclado.next();
                            System.out.println("Apelido: ");
                            apelido = teclado.next();
                            System.out.println("NIF: ");
                            nif = teclado.next();
                            System.out.println("Ano Nascimento: ");
                            ano = teclado.nextInt();
                            System.out.println("Mês: ");
                            mes = teclado.nextInt();
                            System.out.println("Dia: ");
                            dia = teclado.nextInt();
                            System.out.println("Posição: ");
                            posicao = teclado.next();
                            System.out.println("Pé dominante: ");
                            tipo = teclado.next();
                            atletas.add(new Atleta(new Socio(new Pessoa(nome, apelido, nif, ano, mes, dia)),
                                    new Futsal(posicao, tipo)));
                            break;
                        }
                    }
                    break;
                }
            }

            System.out.println("Pretende adicionar mais elementos[1], ou sair do programa[2]: ");
            rep = teclado.next().toUpperCase().charAt(0);
        } while (rep != '2');

        for (Socio soc : socios) {
            System.out.println(soc.toString());
        }

        for (Atleta atl : atletas) {
            System.out.println(atl.toString());
        }

        // Socio s2 = new Socio(new Pessoa("Marco", "Rocha", "127765868345", 1998, 6,
        // 10));
        // Socio s3 = new Socio(new Pessoa("Marco", "Rocha", "1245654654645345", 1997,
        // 7, 10));

        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);

        // Atleta a1 = new Atleta(s1, new Futsal("Fixo", "Destro"));
        // Atleta a2 = new Atleta(s2, new Futsal("Pivot", "Esquerdino"));

        // System.out.println(a1);
        // System.out.println(a2);

        teclado.close();
    }
}
