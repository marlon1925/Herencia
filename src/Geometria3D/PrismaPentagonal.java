package Geometria3D;

public class PrismaPentagonal extends Figuras3D{

    public double area(){
        area = 5 * lado * (apotema+altura);
        return area;
    }

    public double areaBase(){
        areaBase =(5*lado*apotema)/2;
        return areaBase;
    }

    public double volumen(){
        volumen = (areaBase() * altura);
        return volumen;
    }

}
