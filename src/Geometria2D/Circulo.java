package Geometria2D;

public class Circulo extends Figuras2D{

    public double areaCirculo() {
        return VPi*Math.pow(radio,2);
    }

    public double diametroCircuo(){
        diametro = 2*radio;
        return diametro;
    }

    public double perimetroCirculo(){
        perimetro = VPi * diametro;
        return perimetro;
    }



}
