package bstu.vt41.serdukov;

import java.util.Scanner;
abstract class Construction {
    int Cost;

    public abstract void init(Scanner info);

    int getConstructionCost() {
        return this.Cost;
    }
}

abstract class Build extends Construction {
    @Override
    public abstract void init(Scanner info);
}

abstract class House extends Construction {

    @Override
    public abstract void init(Scanner info);
}

class Restaurant extends Build {
    String restauranName, owner, type;

    @Override
    public String toString() {
        return "Restaurant " + restauranName;
    }

    @Override
    public void init(Scanner info) {
        System.out.println("Enter the name of owner:");
        this.owner = info.next();
        System.out.println("Enter the name of restaurent:");
        this.restauranName = info.next();
        System.out.println("Enter the type of restaurent:");
        this.type = info.next();
        System.out.println("Enter the cost of restaurent:");
        super.Cost = info.nextInt();
    }
}

class Hotel extends Build {
    String owner, hotelName, material;

    @Override
    public String toString() {
        return "Hotel " + hotelName;
    }

    @Override
    public void init(Scanner info) {
        System.out.println("Enter the name of owner:");
        this.owner = info.next();
        System.out.println("Enter the name of hotel:");
        this.hotelName = info.next();
        System.out.println("Enter the type of the building material:");
        this.material = info.next();
        System.out.println("Enter the cost of hotel:");
        super.Cost = info.nextInt();
    }
}

class MultiStoryHouse extends House {
    private int floorNumber;
    private String material;

    @Override
    public String toString() {
        return "House number " + floorNumber;
    }

    @Override
    public void init(Scanner info) {
        System.out.println("Enter the number of house");
        this.floorNumber = info.nextInt();
        System.out.println("Enter the type of the building material");
        this.material = info.next();
        System.out.println("Enter the cost of build");
        super.Cost = info.nextInt();
    }
}

class PrivateHouse extends House {
    private int floorNumber;
    private String material, owner;

    @Override
    public String toString() {
        return "House number " + floorNumber;
    }

    @Override
    public void init(Scanner info) {
        System.out.println("Enter the number of house");
        this.floorNumber = info.nextInt();
        System.out.println("Enter the type of the building mterial");
        this.material = info.next();
        System.out.println("Enter the name of owner");
        this.owner = info.next();
        System.out.println("Enter the cost of build");
        super.Cost = info.nextInt();
    }
}
