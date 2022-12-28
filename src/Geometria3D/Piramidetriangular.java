package Geometria3D;

public class Piramidetriangular extends Figuras3D{

    public double areaBase(){
        areaBase =(lado * alturabase)/2;
        return areaBase;
    }

    public double areaCaraLateral(){
        areaCarasLate =(lado * alturaCaraLateral)/2;
        return (lado * alturaCaraLateral)/2;
    }

    public double areaTotal(){
        area = (areaBase()+areaCaraLateral());
        return area;
    }

}
