import java.util.Scanner;
public class Bai22g {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Double n = scan.nextDouble();

        boolean Check = Math.sqrt(n)==Math.ceil(Math.sqrt(n));
        System.out.println(Check);


    }
}
