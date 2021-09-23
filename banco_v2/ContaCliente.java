package banco_v2;

public class ContaCliente {

    private Conta conta;
    private Cliente cliente;

    public ContaCliente(Conta cnt, Cliente clt){
        conta = cnt;
        cliente = clt;
    }


    public String toString(){
        return conta.mostrar_num() + " : " + cliente.mostrar_nome() + " (" + cliente.mostrar_num_cliente() + ").";
    }
    
}
