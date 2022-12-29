package Geometria2D;

public class Paralelogramo extends Figuras2D{

    public double alturaParalelogramo(){
        double a = Math.toRadians(angulo);
        return (lado1)*Math.sin(a);
    }

    public double periParalelogramo(){
        return (lado2+lado3)*2;
    }

    public double areaParalelogramo(){
        return base*altura;
    }

}
