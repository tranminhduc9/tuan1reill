public class Bai21{
    public static void main(String[] args){
        boolean a = 2 > 1;
        boolean b = 3<=2 && 10>5;
        boolean c =7<8 || 1000<1;
        boolean d = 6<7 && 10>5 || false && 4<3;
        boolean e = (!(10<=9)|| !(true && (10>3)))&&(1<=-5 && (!(10>11)||true));

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}