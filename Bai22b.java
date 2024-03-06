import java.util.Scanner;
public class Bai22b {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int Year = scan.nextInt();
        boolean LeapYear = (Year % 4 == 0) && ((Year % 100 == 0)&&(Year % 400 == 0));
        System.out.println(LeapYear);
    }
    
}
