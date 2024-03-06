import java.util.Scanner;
public class Bai23c {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch(month){
            case 1,2,3:
                System.out.println("Spring");
                break;
            case 4,5,6:
                System.out.println("Summer");
                break;
            case 7,8,9:
                System.out.println("Fall");
                break;
            case 10,11,12:
                System.out.println("Winter");
                break;
        }
    }
}
