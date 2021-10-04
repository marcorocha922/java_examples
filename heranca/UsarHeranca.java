package heranca;

public class UsarHeranca {
    public static void main(String[] args) {
        Circulo c3 = new Circulo("laranja");
        System.out.println(c3);
        System.out.println(c3.getCor());
        System.out.println(c3.getRaio());

        Cilindro cil1 = new Cilindro(4.0, "roxo", 5.0);
        System.out.println(cil1);
        System.out.println(cil1.getRaio());
        System.out.println(cil1.getArea());
        System.out.println(cil1.getVolume());

        Cone con1 = new Cone(2.0, "verde",  8.0);
        System.out.println(con1);
        System.out.println(con1.getVolume());

        Esfera esf1 = new Esfera(1.8, "azul");
        System.out.println(esf1);
        System.out.println(esf1.getVolume());
    }
}
