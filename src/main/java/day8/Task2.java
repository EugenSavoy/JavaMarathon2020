package day8;

public class Task2 {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        String string = "";
        for (int i = 0; i < 20000; i++) {
            string = string + i +" ";
        }
        long after = System.currentTimeMillis();
        System.out.println(string);
        System.out.println(after - before);
    }
}
