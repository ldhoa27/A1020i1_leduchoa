package OOP.baitap;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double act_a, double act_b, double act_c){
        this.a = act_a;
        this.b = act_b;
        this.c = act_c;
    }

    public double getDiscriminant(){
        return Math.pow(this.b,2)-(4*this.a*this.c);
    }

    public double getRoot1(){
        return ((-this.b)+Math.pow(this.getDiscriminant(),0.5))/(2*this.a);
    }

    public double getRoot2(){
        return ((-this.b)-Math.pow(this.getDiscriminant(),0.5))/(2*this.a);
    }

    public double get2SameRoot(){
        return (-this.b)/(2*this.a);
    }
}
