package main.java;

public class Hangar {

    public static void main(String[] args) {

        Car clio = new Car("clio", 0);
        Boat titanic = new Boat("Titanic", -2);

        System.out.println(titanic.doStuff());
        System.out.println(clio.doStuff());
    }

}
