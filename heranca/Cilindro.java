package heranca;

public class Cilindro extends Circulo {
    double altura = 1.0;

    public Cilindro() {
        super();
    }

    public Cilindro(double raio, String cor) {
        super(raio, cor);
    }

    public Cilindro(double raio, String cor, double altura) {
        super(raio, cor);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getVolume() {
        return getArea() * altura;
    }

    public String toString() {
        return "Cilindro --> Raio = " + raio
                + "; Cor = " + cor
                + "; Altura = " + altura;        
    }
}
