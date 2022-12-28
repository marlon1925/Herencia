package Geometria2D;

public class Rectangulo extends Figuras2D {

    public double areaRectangulo(){
        return base*altura;
    }

    public double alturaRectangulo(){
        return (area)/(base);
    }

    public double perimetroRectangulo(){
        return (lado1+lado2)*2;
    }

}
