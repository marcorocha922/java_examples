package Calendario;

public class Feriado {

    private String nome;
    private int dia;
    private String mes;

    public Feriado (String nome1, int dia1, String mes1){
        nome = nome1;
        dia = dia1;
        mes = mes1;
    }

    public void mostrar_feriado(){
        System.out.println(nome + " : " + dia + " de " + mes);
    }

    public boolean noMesmoMes(Feriado f2){
        return (mes == f2.mes);
        /*if(mes == f2.mes){
            return true;
        }else{
            return false;
        }*/
    }

    public static double media_dia(Feriado [] arr){
        double mediaDia = 0;

        for(int i = 0; i < arr.length; i++){
            mediaDia = mediaDia + arr[i].dia;
        }
        mediaDia = mediaDia / arr.length;
        return mediaDia;
    }
}
