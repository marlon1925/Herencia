package Geometria2D;

public class Rombo extends Figuras2D{


    public double perimetroRombo(){
        return lado1 * 4;
    }

    public double areaRombo(){
        return (diagonalMayorR*diagonalMenorR)/2;
    }

    public double ladoRombo(){
        double dM,dME;
        dM=diagonalMayorR/2;
        dME=diagonalMenorR/2;
        return (Math.sqrt(Math.pow((dM),2)+Math.pow((dME),2)));
    }
}
