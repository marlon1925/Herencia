package Geometria3D;

public class PiramedeCuadrangular extends Figuras3D {
    public double areaBase () {
        areaBase =Math.pow(base,2);
        return areaBase;
    }

    public double areaCarasLaterales(){
        areaCarasLate =(base*altura)/2;
        return areaCarasLate;
    }

    public double volumen (){
        areaCarasLate = (areaBase() * altura)/3;
        return areaCarasLate;
    }


}
