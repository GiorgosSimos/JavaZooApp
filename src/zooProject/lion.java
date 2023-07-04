package zooProject;

public class lion extends animal {
    private int strength;//measured in power units > 0

    public lion (String name ,int code, String category, double weight, int age, int strength){
        super(name,code, category, weight, age);
        this.strength = strength;
    }//lion constructor

    public int getStrength() { return strength; }

    public void setStrength(int strength) { this.strength = strength; }

    @Override
    public String toString() {
        return "lion{Name: "+ getName()+", code: "+getCode()+", strength: " + strength + " unit(s)"+  "}\n";
    }//toString

    @Override
    public void feedAnimal(String name) {
        System.out.println(name+" the lion is hungry, it's time to eat some meat. Let's hope it won't attack the other animals in the zoo!");
    }//feedAnimal - lion
}//lion class
