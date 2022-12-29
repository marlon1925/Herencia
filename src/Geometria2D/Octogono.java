package Geometria2D;

public class Octogono extends Figuras2D {

    public double perimetroOctogono(){
        return lado1*8;
    }

    public double areaOctogono(){
        return ((lado2*8)*apotema)/2;
    }

    public double apotemaOctogono(){
        double an=0,mitadLado=0;
        an = Math.toRadians(22.5); // Se saca de 360/8 = 45 y a los 45 se divide entre 2 = 22.5
        mitadLado = lado3/2;
        return (mitadLado/Math.tan(an));
    }


}
