package main.java.graphicEditior;

public class Shape {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void printName() {
        System.out.println(name);
    }
}