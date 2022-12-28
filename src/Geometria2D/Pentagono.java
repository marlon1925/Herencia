package Geometria2D;

public class Pentagono extends Figuras2D{

    public double perimetroPentagono(){
        return lado1 * 5;
    }

    public double areaPentagono(){
        return ((perimetro) * apotema) / 2;
    }

    public double apotemaPentagono(){
        double a;
        a = Math.toRadians(angulo);
        return (mitadLado/2)/Math.tan(a);
    }
}
