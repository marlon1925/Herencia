package Geometria2D;

public class Trapecio extends Figuras2D{

    public double areaTrapecioIsoceles(){
        return (((baseMAyor+baseMenor)*altura)/2);
    }

    public double perimetroTrapecio(){
        double  resul=0,baseT=0,re=0;
        resul = baseMAyor-baseMenor;
        baseT = resul/2;
        re = Math.sqrt(Math.pow(baseT,2)+Math.pow(altura,2));
        return baseMenor+baseMAyor+(2*re);
    }

    public double alturaTrapecioIsoceles(){
        double r=0,vr=0,alturaT=0;
        r = baseMAyor - baseMenor;
        vr= r / 2;
        alturaT = Math.sqrt(Math.pow(longLateral,2)-Math.pow(vr,2));
        return  altura;
    }
}
