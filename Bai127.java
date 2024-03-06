import java.util.Scanner;
public class Bai127 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int l = scan.nextInt();
        int r = scan.nextInt();
        int t = scan.nextInt();

        int Sum = 0;
        for (int i = l; i<=r ; i++){
            if(i%t == 0){
                Sum += i;  
            }
        }
        System.out.println(Sum);
    }
}
