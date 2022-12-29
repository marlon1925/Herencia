package Geometria2D;

public class Rectangulo extends Figuras2D {

    public double areaRectangulo(){
        return base*altura;
    }

    public double diagonalRectangulo(){
        double b,a;
        b = Math.pow(base,2);
        a = Math.pow(altura,2);
        return Math.sqrt(a+b);
    }

    public double perimetroRectangulo(){
        return (lado1+lado2)*2;
    }

}
