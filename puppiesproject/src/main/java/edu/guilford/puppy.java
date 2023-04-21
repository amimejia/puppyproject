package edu.guilford;

public class puppy {
    //attributes
    private String name;
    private int age;
    private String breed;
    private String color;
    private String furtype;
    private double weight;
    private boolean spots;
    private boolean female;

    //constructor
    public puppy() {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.furtype = furtype;
        this.weight = weight;
        this.spots = spots;
        this.female = female;
    }
    
    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getFurtype() {
        return furtype;
    }
    public void setFurtype(String furtype) {
        this.furtype = furtype;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public boolean isSpots() {
        return spots;
    }
    public void setSpots(boolean spots) {
        this.spots = spots;
    }
    public boolean isFemale() {
        return female;
    }
    public void setFemale(boolean female) {
        this.female = female;
    }
    //methods
    public void bark() {
        System.out.println("Woof!");
    }
    public void eat() {
        System.out.println("Yum!");
    }
    public void sleep() {
        System.out.println("zzz");
    }
    public void cuddle() {
        System.out.println("pet me!");
    }
}
