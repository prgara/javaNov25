package jan03;

public class StringBufferExample {

    public static void main(String[] args) {
        String s = "Pragr";
        s.concat(" INC");
        System.out.println(s); // Prgara
        StringBuilder sb = new StringBuilder("Pragra");
        sb.append(" INC");
        System.out.println(sb);

        StringBuffer strb = new StringBuffer("Prgara");
        strb.append(" Inc");

        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuilder" + (endTime - startTime) + "ns");

        long startTime1 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            strb.append(i);
        }
        long endTime1 = System.nanoTime();
        System.out.println("StringBuffer" +(endTime1 - startTime1) + "ns");




    }
}
