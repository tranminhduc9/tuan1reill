import java.util.Scanner;

public class Bai125 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String char1 = scan.next();
        String char2 = scan.next();
        int locationChar1 = char1.charAt(0);
        int locationChar2 = char2.charAt(0);
        int distance = Math.abs (locationChar1 - locationChar2);

        System.out.println(distance);
    }
}

