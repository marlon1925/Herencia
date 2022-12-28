package Geometria3D;

public class PrismaRectangular extends  Figuras3D{

    public double area(){
        area = 2*(baseMayor*baseMenor + baseMenor*altura + altura*baseMayor);
        return area;
    }

    public double areaLateral (){
        areaLate = 2*(baseMenor+ baseMayor) * altura;
        return areaLate;
    }

    public double volumen(){
        volumen = baseMayor * baseMenor * altura;
        return volumen;
    }

}
