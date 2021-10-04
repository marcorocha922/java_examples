package heranca;

public class Cone extends Cilindro {

    public Cone(double raio, String cor, double altura) {
        super(raio, cor, altura);
    }

    public double getVolume() {
        return getArea() * altura / 3;
    }

    public String toString() {
        return "Cone --> Raio = " + raio
                + "; Cor = " + cor
                + "; Altura = " + altura;        
    }

}
