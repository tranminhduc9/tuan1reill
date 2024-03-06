import java.util.Scanner;
public class Bai22d{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Double a = scan.nextDouble();
        Double b = scan.nextDouble();

        if (a==0 & b==0){
            System.out.println("Phuong trinh vo so nghiem");
        }
        else if(a==0 & b!=0){
            System.out.println("Phuong trinh vo nghiem");
        }
        else{
            Double x = -b/a;
            System.out.println("Phuong trinh co 1 nghiem" + x);

        }
    }   
}