package jan06;

public class CalculateMain {
    static void main() {
        Calculate calculate = new Calculate();

        System.out.println(calculate.add(4, 3));
        System.out.println(calculate.add(5.3, 5.7));
        System.out.println(calculate.add(4, 4, 4));
        System.out.println(calculate.add(5.7, 4));
    }
}
