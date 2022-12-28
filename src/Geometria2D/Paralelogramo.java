package Geometria2D;

public class Paralelogramo extends Figuras2D{

    public double alturaParalelogramo(){
        double a = Math.toRadians(angulo);
        return (altura2)*Math.sin(a);
    }

    public double periParalelogramo(){
        return (lado1+lado2)*2;
    }

    public double areaParalelogramo(){
        return base*altura;
    }

}
