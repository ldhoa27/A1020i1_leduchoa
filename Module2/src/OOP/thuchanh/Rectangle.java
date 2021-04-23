package OOP.thuchanh;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle (double recWidth, double recHeight){
        this.width = recWidth;
        this.height = recHeight;
    }

    public double getArea (){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return (this.width + this.height)*2;
    }

    public void display(double width, double height, double S, double P){
        System.out.printf("HCN co chieu rong %-4.1f, chieu dai %-4.1f, Dien tich la : %-4.1f, Chu vi la : %-4.1f", width,height,S,P);
    }
}
