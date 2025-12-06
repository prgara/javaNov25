package Dec06;

public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b =20;
        int c = 30;
        int d =5;
        int e = 7;

        System.out.println(a>b && a>c); // False
        System.out.println(a>c && b>e); // False
        System.out.println(c<b || d>a); // false
        System.out.println(c>b || e <c); // true
        System.out.println(b<=a && a<=a); // false
        System.out.println(b<=d && e>=a); // false
        System.out.println(b<=a && b>=a); // false
        System.out.println(!(b<=a && a<=a)); // true


    }
}
