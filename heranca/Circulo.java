package heranca;

public class Circulo {
    double raio = 1.0;
    String cor = "verde";

    public Circulo(){
        super();
    }

    public Circulo(double raio, String cor){
        this.raio = raio;
        this.cor = cor;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo(String cor) {
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public double getRaio(){
        return raio;
    }

    public double getArea(){
        return 3.14 * raio * raio;
    }

    public String toString() {
        return "Circulo --> Raio = " + raio + "; Cor = " + cor;
    }
}
