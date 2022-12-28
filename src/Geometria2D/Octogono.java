package Geometria2D;

public class Octogono extends Figuras2D {

    public double perimetroOctogono(){
        return lado1*8;
    }

    public double areaOctogono(){
        return ((lado1*8)*apotema)/2;
    }

    public double apotemaOctogono(){
        double an=0,mitadLado=0;
        an = Math.toRadians(angulo);
        mitadLado = lado1/2;
        return (mitadLado/Math.tan(an));
    }


}
