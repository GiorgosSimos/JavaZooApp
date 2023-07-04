package zooProject;

public class giraffe extends animal {
    private double neck_length;//in meters

    public giraffe (String name, int code, String category, double weight, int age, double neck_length){
        super(name, code, category, weight, age);
        this.neck_length = neck_length;
    }//giraffe constructor

    public double getNeck_length() { return neck_length; }

    public void setNeck_length(double neck_length) { this.neck_length = neck_length; }

    @Override
    public String toString() {
        return "giraffe{Name: "+ getName()+", code: "+getCode()+", neck length: " + neck_length + " meters"+  "}\n";
    }//toString

    @Override
    public void feedAnimal(String name) {
        System.out.println(name+" the giraffe is hungry, some shrubs should be nice!!");
    }//feedAnimal - giraffe
}//giraffe class
