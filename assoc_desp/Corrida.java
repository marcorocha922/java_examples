package assoc_desp;

import java.util.ArrayList;

public class Corrida extends Modalidade {
    ArrayList<String> distancias = new ArrayList<String>();
    String piso;

    public Corrida(String distancia, String piso){
        this.nome_modalidade = "Corrida";
        this.coletivo = false;
        this.distancias.add(distancia);
        this.piso = piso;
    }

    public ArrayList<String> getDistancias() {
        return distancias;
    }

    @Override
    public void addDistancias(String distancia) {
        this.distancias.add(distancia);
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String toString(){
        return super.toString() + " Distâncias: " + distancias + " Piso: "  + piso;
    }
}
