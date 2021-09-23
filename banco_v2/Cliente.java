package banco_v2;

public class Cliente {

    private int num_cliente;
    private String nome;
    private String morada;
    private String nif;

    Cliente(int num, String nom, String mor, String n){
        num_cliente = num;
        nome = nom;
        morada = mor;
        nif = n;
    }

    int mostrar_num_cliente(){
        return num_cliente;
    }

    String mostrar_nome(){
        return nome;
    }
    
    String mostrar_morada(){
        return morada;
    }

    String mostrar_nif(){
        return nif;
    }
}
