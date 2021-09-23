package Calendario;

public class CriarFeriado {
    public static void main(String[] args) {

        Feriado[] frs = {
            new Feriado("Dia da restauração da independência", 1, "Dezembro"),
            new Feriado("Dia de Natal", 25, "Dezembro"),
            new Feriado("Dia da liberdade", 25, "Abril")
        };

        // Feriado f1 = new Feriado("Dia da restauração da independência", 1, "Dezembro");
        // Feriado f2 = new Feriado("Dia de Natal", 25, "Dezembro");
        // Feriado f3 = new Feriado("Dia da liberdade", 25, "Abril");


        // f1.mostrar_feriado();
        // f2.mostrar_feriado();
        // f3.mostrar_feriado();

        if(frs[0].noMesmoMes(frs[1])){
            frs[0].mostrar_feriado();
            System.out.println(" está no mesmo mês que ");
            frs[1].mostrar_feriado();
        }else{
            frs[0].mostrar_feriado();
            System.out.println(" não está no mesmo mês que ");
            frs[1].mostrar_feriado();
        }

        if(frs[0].noMesmoMes(frs[2])){
            frs[0].mostrar_feriado();
            System.out.println(" está no mesmo mês que ");
            frs[2].mostrar_feriado();
        }else{
            frs[0].mostrar_feriado();
            System.out.println(" não está no mesmo mês que ");
            frs[2].mostrar_feriado();
        }
        
        System.out.println("A média é: " + Feriado.media_dia(frs));
    }
}
