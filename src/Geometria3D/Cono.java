package Geometria3D;

public class Cono extends Figuras3D {

    public double areaLateral() {
        areaLate = NPi * radio * inclinacion;
        return areaLate;
    }
    public double areaTotal(){
        area =(NPi * radio * inclinacion) + (NPi * (Math.pow(radio,2)));
        return area;
    }
    public double volumen() {
        volumen = (NPi * Math.pow(radio,2) * altura) / 3;
        return volumen;
    }

}
