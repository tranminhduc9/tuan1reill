import java.util.Scanner;
public class Bai22c {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int TuoiNam = scan.nextInt();
        int TuoiNu = scan.nextInt();

        boolean Check = TuoiNam >=20 && TuoiNu >=18;
        System.out.println(Check);
    }
}
