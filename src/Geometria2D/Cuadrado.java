package Geometria2D;

import java.util.Scanner;

public class Cuadrado extends Figuras2D{

    public double areaCuadrado(){
        return Math.pow(lado1,2);
    }

    public double perimetroCuadrado(){
        return cuadrado * lado2;
    }

    public double diagonalCuadrado(){
        return lado3 * Math.sqrt(2);
    }

}
