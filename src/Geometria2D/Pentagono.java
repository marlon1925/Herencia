package Geometria2D;

public class Pentagono extends Figuras2D{

    public double perimetroPentagono(){
        return lado1 * 5;
    }

    public double areaPentagono(){
        return ((lado2*5) * apotema) / 2;
    }

    public double apotemaPentagono(){
        double a;
        a = Math.toRadians(36); // El 36 sale de 360/5 =  72 y despues el 72/2 = 36
        return (lado3/2)/Math.tan(a);
    }
}
