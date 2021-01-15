package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addToList(list, 0 , 30);
        addToList(list, 300 , 350);
        System.out.println(list.toString());
    }

    public static void addToList(List<Integer> list, int i , int x) {
        for (;i <= x; i++){
            if (i % 2 == 0){
                list.add(i);
            }
        }
    }

}
