package Geometria2D;

public class Triangulo extends Figuras2D{

    public double perimetroTriangulo(){
        return lado1+lado2+lado3;
    }

    public double areaTrianngulo(){
        return (base*altura)/2;
    }

    public double alturaTrianguloEquilatero(){
        double lado;
        lado = lado1/2;
        return Math.sqrt(Math.pow(lado1,2)-Math.pow(lado,2));
    }
}
