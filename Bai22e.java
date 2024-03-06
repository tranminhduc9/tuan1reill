import java.util.Scanner;
public class Bai22e {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            
            Double a = scan.nextDouble();
            Double b = scan.nextDouble();
            Double c = scan.nextDouble();
            Double delta = b*b - 4*a*c;
            
            if (a==0){
                if (b==0 && c!=0){
                System.out.println("vonghiem");
                }
                else if (b==0 & c ==0){
                System.out.println("vosonghiem");
                }
                else{
                Double x=-c/b;
                System.out.println("1nghiem"+ x);
                }
            }
            else if (delta > 0){
                Double x1= (-b+ Math.sqrt(delta))/(2*a);
                Double x2= (-b- Math.sqrt(delta))/(2*a);
                System.out.println("2nghiem" + x1 +"va"+ x2);
            }
            else if (delta == 0){
                Double xx= -b/(2*a);
                System.out.println("1nghiemkep" +xx);
            }
            else{
                System.out.println("vonghiem");
            }
        }
}
