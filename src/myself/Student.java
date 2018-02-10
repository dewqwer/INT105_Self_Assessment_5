package myself;

public class Student {

    private String name;
    private double weight;
    private double height;

    public Student() {
    }

    public Student(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getBMI(){
        double bmi=weight/Math.pow(height,2);
        if(weight<0||height<0){
            return -1;
        }
        else if(height==0){
            return -2;
        }
        return bmi;
    
    }
    
    
    
    
}
