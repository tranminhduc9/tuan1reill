import java.util.Scanner;
public class Bai122 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Double side1 = scan.nextDouble();
        Double side2 = scan.nextDouble();
        Double angle = scan.nextDouble() * Math.PI / 180;
        Double Area = side1 * side2 * Math.sin(angle) /2;
  
        scan.close();
        System.out.printf("%.2f\n", Area);

    }
}
