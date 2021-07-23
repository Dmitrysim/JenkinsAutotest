package mypackage;

public class Animal {

    public Animal() {
        System.out.println("New animal added");
    }

    public Animal(String color) {
        this.color = color;
        System.out.println("Animal color is: " + color);
    }

    String name;
    String color;

    public int getVar() {
        return var;
    }

    public void setVar(int var) {
        this.var = var;
    }

    private int var;

    public void walk(String place) {
        System.out.println("We are walking here: " + place);
    }

    public void sleep() {
        System.out.println("Zzzz");
    }
}
