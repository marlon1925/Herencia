package Geometria3D;

public class Cubo extends Figuras3D {

    public double area (){
        area = 6 *(lado)*(lado);
        return area;
    }

    public double volumen(){
        volumen = Math.pow(lado,3);
        return volumen;
    }

    public double diagonal(){
        diagonal =  lado * Math.sqrt(3);
        return diagonal;
    }

}
