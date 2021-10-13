package clube;

import java.util.Date;

public class TestClube {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", "Cid", "123456789", new Date());
        System.out.println(p1);

        Pessoa p2 = new Pessoa("Jorge", "Ganhao", "987654321", new Date());
        System.out.println(p2);

        Pessoa p3 = new Pessoa("Joaquim", "Bom-nome", "564738291", new Date());
        System.out.println(p3);

        Socio s1 = new Socio(p1);
        System.out.println(s1);

        Socio s2 = new Socio(p2);
        System.out.println(s2);

        Socio s3 = new Socio(p3);
        System.out.println(s3);

        Atleta a1 = new Atleta(s1, "Futsal");
        System.out.println(a1);

        Atleta a2 = new Atleta(s2, "Corrida");
        System.out.println(a2);
    }
    
}
