package zooProject;

public class zebra extends animal {
    private double top_speed;//measured in km per hour

    public zebra (String name ,int code, String category, double weight, int age, double top_speed){
        super(name, code, category, weight, age);
        this.top_speed = top_speed;
    }//zebra constructor

    public double getTop_speed() { return top_speed; }

    public void setTop_speed(double top_speed) { this.top_speed = top_speed; }

    @Override
    public String toString() {
        return "zebra{Name: "+ getName()+", code: "+getCode()+", top speed: " + top_speed + " km/h"+  "}\n";
    }//toString

    @Override
    public void feedAnimal(String name) {
        System.out.println(name+" the zebra is hungry, let's feed it some tasty leaves!!");
    }//feedAnimal - zebra
}//zebra class
