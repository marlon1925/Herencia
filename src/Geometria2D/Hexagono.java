package Geometria2D;

public class Hexagono extends Figuras2D {

    public double areaHexagono(){
        return (((perimetro*6)*apotema)/2);
    }

    public double perimetroHexagono(){
        return (lado1)*6;
    }

    public double apotemaHexagono(){
        return (lado2/1.15);
    }

}
