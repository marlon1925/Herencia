package Geometria3D;

public class Figuras3D {
    double NPi = Math.PI;
    double radio, inclinacion;
    double base,baseMayor, baseMenor;
    double alturabase, alturaCaraLateral, altura;
    double lado, apotema, areaBase;
    int caras, vertices;
    double area, volumen;
    double areaLate,diagonal,areaCarasLate;
    double aristas;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    public void setInclinacion(double inclinacion) {
        this.inclinacion = inclinacion;
    }

    public void setBase(double base) {
        this.base = base;
    }


    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }


    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }


    public void setAlturabase(double alturabase) {
        this.alturabase = alturabase;
    }

    public void setAlturaCaraLateral(double alturaCaraLateral) {
        this.alturaCaraLateral = alturaCaraLateral;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }


    public void setVertices(int vertices) {
        this.vertices = vertices;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

}
