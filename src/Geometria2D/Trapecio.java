package Geometria2D;

public class Trapecio extends Figuras2D{

    public double areaTrapecioIsoceles(){
        return (((baseMAyor+baseMenor)*altura)/2);
    }

    public double perimetroTrapecio(){
        double  resul=0,base=0,re=0;
        resul = baseMAyor-baseMenor;
        base = resul/2;
        re = Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
        return baseMenor+baseMAyor+(2*re);
    }

    public double alturaTrapecioIsoceles(){
        double r=0,vr=0,altura=0;
        r = baseMAyor - baseMenor;
        vr= r / 2;
        altura = Math.sqrt(Math.pow(longLateral,2)-Math.pow(vr,2));
        return  altura;
    }
}
