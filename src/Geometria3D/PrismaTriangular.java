package Geometria3D;

public class PrismaTriangular extends Figuras3D {

    public double aristas(){
        aristas = caras + vertices - 2;
        return aristas;
    }

    public double area(){
        area = lado *(((Math.sqrt(3))/2) * lado + 3 * altura);
        return area;
    }

    public double volumen(){
        volumen = ((Math.sqrt(3)/4) * Math.pow(lado,2) * altura);
        return volumen;
    }

}
