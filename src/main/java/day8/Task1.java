package day8;

public class Task1 {
    public static void main(String[] args) {

        long before = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 20000; i++) {
            stringBuilder.append(i);
            stringBuilder.append(" ");
        }
        long after = System.currentTimeMillis();
        System.out.println(stringBuilder);
        System.out.println(after - before);
    }
}
