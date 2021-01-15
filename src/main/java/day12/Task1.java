package day12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> models = new ArrayList<>(Arrays.asList("Kia", "BMW", "Lada", "RIO", "WW"));

        System.out.println(models.toString());

        models.add(3, "Datsun");
        models.remove(0);

        System.out.println(models.toString());

    }


}


