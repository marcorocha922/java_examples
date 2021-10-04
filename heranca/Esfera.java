package heranca;

public class Esfera extends Circulo{

    public Esfera(double raio, String cor) {
        super(raio, cor);
    }

    public double getVolume(){
        return 4/3 * super.getArea() * raio;
    }

    public String toString() {
        return "Esfera --> Raio = " + raio
                + "; Cor = " + cor
                + "; Volume = " + getVolume();  
    }
    
}
