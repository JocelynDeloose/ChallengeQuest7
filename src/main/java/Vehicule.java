package main.java;

public abstract class Vehicule {

    private String brand;
    private int kilometers;

    public int getKilometers() {
        return kilometers;
    }

    public Vehicule(String brand, int kilometers){
        this.brand = brand;
        this.kilometers = kilometers;
    }

    public String getBrand() {
        return brand;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract String doStuff();

}

