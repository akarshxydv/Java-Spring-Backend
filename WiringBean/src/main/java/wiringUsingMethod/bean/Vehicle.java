package wiringUsingMethod.bean;

public class Vehicle {
    private String name;

    public Vehicle(){
        System.out.println("Vehicle bean has been created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Printing hello from the component of vehicle bean");
    }

    @Override
    public String toString(){
        return "Vehicle name is - "+ this.name;
    }



}
