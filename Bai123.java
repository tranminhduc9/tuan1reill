import java.util.Scanner;
public class Bai123 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Double x = scan.nextDouble();
        Double y = scan.nextDouble();
        Double z = scan.nextDouble();
        Double a = scan.nextDouble();
        Double b = scan.nextDouble();
        Double c = scan.nextDouble();

        Double distance = Math.sqrt(Math.pow(x-a,2)+Math.pow(y-b,2)+Math.pow(z-c,2));
        System.out.printf("%.2f\n", distance);
    }
    
}
