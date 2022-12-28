package Geometria3D;

public class Esfera extends Figuras3D {

    public double area(){
        area = 4*NPi*Math.pow(radio,2);
        return area;
    }
    public double volumen(){
        volumen = (4*NPi*Math.pow(radio,3))/3;
        return volumen;
    }

    public double VolumenSector (){
        volumen = (2*NPi*(Math.pow(radio,2)*altura))/3;
        return volumen;
    }

}
