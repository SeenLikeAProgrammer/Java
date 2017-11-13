package bstu.vt41.serdukov;

import java.util.Comparator;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    private static Construction[] inputInfo() {
        System.out.println("Введите количество объектов");
        Construction objects[] = new Construction[input.nextInt()];
        System.out.println("Choose the type of the build:\n1.Restaurant\n2.Hotel\n3.Private House\n4.MultiStroy House3");
        for (int i = 0; i < objects.length; i++) {
            objects[i] = chooseType(input.nextInt());
            objects[i].init(input);
        }
        return objects;
    }

    private static Construction chooseType(int n) {
        switch (n) {
            case 1: return new Restaurant();
            case 2: return new Hotel();
            case 3: return new PrivateHouse();
            case 4: return new MultiStoryHouse();
            default: return null;
        }
    }

    private static void sort(Construction objects[]) {
        Arrays.sort(objects, Comparator.comparingInt(Construction::getConstructionCost));
    }

    private static void PrintfInfo(Construction[] objects) {
        System.out.println("\n");
        for (Construction object : objects) {
            System.out.println(object.toString());
        }
    }

    public static void main(String[] args) {
        Construction[] objects = inputInfo();
        sort(objects);
        PrintfInfo(objects);
    }
}


