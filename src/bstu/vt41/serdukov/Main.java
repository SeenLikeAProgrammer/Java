package bstu.vt41.serdukov;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Scanner;




public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
   }

   public static int inputNumberObjects(){
       Scanner input= new Scanner(System.in);
       System.out.println("Введите количество объектов");
       int n=input.nextInt();
       return n;
   }

public static Construction[] inputInfo(int n){
    Construction objects[];
    Scanner input= new Scanner(System.in);
    objects = new Construction[n];
    for (int i = 0; i < n; i++)
    {
        System.out.println("Choose the type of the build:\n1.Restaurant\n2.Hotel\n3.Private House\n4.MultiStroy House3");
        int tmp = input.nextInt();
        switch (tmp){
            case 1:
                objects[i]=new Restaurant();
                objects[i].init(input);
                break;
            case 2:
                objects[i]=new Hotel();
                objects[i].init(input);
                break;
            case 3:
                objects[i]=new PrivateHouse();
                objects[i].init(input);
                break;
            case 4:
                objects[i]=new MultiStoryHouse();
                objects[i].init(input);
                break;
            default:
                System.out.println("You cant do it, better luck next time");
                i--;
                break;
        }

    }
return objects;
}

public static void sort(Construction objects[], int n){
    for(int i = n-1 ; i > 0 ; i--)
    {
        for(int j = 0 ; j < i ; j++)
        {
            if( objects[j].getConstructionCost() > objects[j+1].getConstructionCost() )
            {
                Construction tmp = objects[j];
                objects[j] = objects[j+1];
                objects[j+1] = tmp;
            }
        }
    }
    System.out.println("\n");
    for (int i = 0; i<n; i++)
        System.out.println(objects[i].toString());

}

    public static void main(String[] args) {
       int n = inputNumberObjects();
        sort(inputInfo(n),n);
    }
}


