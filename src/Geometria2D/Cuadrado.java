package Geometria2D;

import java.util.Scanner;

public class Cuadrado extends Figuras2D{

    public double areaCuadrado(){
        return Math.pow(area,2);
    }

    public double perimetroCuadrado(){
        return cuadrado * perimetro;
    }

    public double diagonalCuadrado(){
        return diametro * Math.sqrt(2);
    }

}
