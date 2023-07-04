package zooProject;

import java.io.Serializable;
abstract class animal implements Serializable, IFeedAnimal {
    private int code;
    private String name;
    private String category;
    private double weight;
    private int age;

public animal(String name, int code, String category, double weight, int age) {
    this.name = name;
    this.code = code;
    this.category = category;
    this.weight = weight;
    this.age = age;

}//constructor

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getCode() { return code; }

    public void setCode(int code) { this.code = code; }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public double getWeight() { return weight; }

    public void setWeight(double weight) { this.weight = weight; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    @Override
    abstract public String toString();

}//animal Class