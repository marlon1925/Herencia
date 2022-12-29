package Geometria2D;

public class Hexagono extends Figuras2D {

    public double areaHexagono(){
        return (((perimetro*6)*apotema)/2);
    }

    public double perimetroHexagono(){
        return (lado1)*6;
    }

    public double apotemaHexagono(){
        return (lado2/1.15); // el valor de 1.5 sale de 2*tan(180/6))
    }

}
