import java.util.Scanner;
public class Bai22f{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Double a = scan.nextDouble();
        Double b = scan.nextDouble();
        Double c = scan.nextDouble();
        Double d = scan.nextDouble();
        Double e = scan.nextDouble();
        Double f = scan.nextDouble();

        if(a/d == b/e && a/d == c/f){
            System.out.println("vosonghiem");
        }
        else if(a/d == b/e && a/d != c/f){
            System.out.println("vonghiem");
        }
        else{
            Double x,y;
            x = (c*e - b*f)/(a*e -b*d);
            y= (a*f - d*c) /(a*e - d*b);

            Double x1 = Math.round(x*100.0)/100.0;
            Double y1 = Math.round(y*100.0)/100.0;
            System.out.println("Nghiem xy lan luot la"+ x1 +"va"+ y1);
        }
    }
}