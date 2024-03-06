public class Bai11{
    public static void main(String[] args){
        Double a = Math.pow(Math.sin(Math.PI/16),2)+ Math.pow(Math.cos(Math.PI/16),2);
        Double b = Math.sin(Math.PI/3) - Math.cos(Math.PI/4);
        Double c = Math.pow(2,3) +17/18;
        Double d = Math.pow(Math.E, Math.pow(3,2)/Math.pow(5,3)+Math.pow(Math.sin(Math.PI),2));
        Double e = Math.sqrt(Math.log(Math.pow(6,2))/Math.log(5)+ Math.tan(Math.PI));

       
        System.out.println(Math.round(a*1000)/1000.0);
        System.out.println(Math.round(b*1000)/1000.0);
        System.out.println(Math.round(c*1000)/1000.0);
        System.out.println(Math.round(d*1000)/1000.0);
        System.out.println(Math.round(e*1000)/1000.0);
    }
}
