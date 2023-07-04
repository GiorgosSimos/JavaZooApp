package zooProject;

public class hippo extends animal {
    private double length;//in meters

    public hippo(String name, int code, String category, double weight, int age, double length) {
        super(name, code, category, weight, age);
        this.length = length;
    }//constructor

    public double getLength() { return length; }

    public void setLength(double length) { this.length = length; }

    @Override
    public String toString() {
        return "hippo{Name: "+ getName()+", code: "+getCode()+", length: " + length + " meters"+  "}\n";
    }//toString

    @Override
    public void feedAnimal(String name) {
        System.out.println(name+" the hippo is hungry, time to have some grass for lunch!!");
    }//feedAnimal - hippo
}//hippo class
