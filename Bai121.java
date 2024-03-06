import java.util.Scanner;
public class Bai121{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Double length = scan.nextDouble();
        Double width = scan.nextDouble();
        Double Area = length*width;
        Double Perimeter = (length+width)*2;
        scan.close();

        System.out.printf("%.2f\n",Area);
        System.out.printf("%.2f\n",Perimeter);
        
    }
}