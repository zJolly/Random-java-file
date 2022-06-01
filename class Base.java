import java.*;
class equazione {
    public static void main () {
        System.out.println("Inserisci argomenti A,B e C");
        double a,b,c,d;

        b=System.in.read();
        a=System.in.read();
        c=System.in.read();
        d=Math.pow(b,2)-4*a*c;
        System.out.println(d);
    }
}