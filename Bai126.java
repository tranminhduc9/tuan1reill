import java.util.Scanner;
public class Bai126 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        int Sum = (a+b)*(b-a+1)/2;
        System.out.println(Sum);
    }
}
