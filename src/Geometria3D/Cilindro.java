package Geometria3D;

public class Cilindro extends Figuras3D {

    public double areaCilindro(){
        area = 2 * NPi * radio * (radio + altura);
        return area;
    }

    public double areaBaseInferior (){
        areaBase = NPi * Math.pow(radio,2);
        return  areaBase;
    }

    public double volumen () {
        volumen = NPi * Math.pow(radio,2);
        return volumen;
    }


}
