package Geometria3D;

public class PiramideRectangular extends Figuras3D{

    public double area(){
        area = baseMenor * baseMayor + baseMenor * Math.sqrt(Math.pow(altura,2) + (Math.pow(baseMayor,2))/4 ) +
                baseMayor * Math.sqrt(Math.pow(altura,2) + (Math.pow(baseMenor,2))/4);
        return area;
    }

    public double volumen(){
        volumen = (baseMenor * baseMayor * altura)/3;
        return volumen;
    }


}
