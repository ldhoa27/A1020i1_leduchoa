package exception.baitap;



public class Triangle {
   private double slide1;
    private double slide2;
   private double slide3;

    public Triangle() {
    }

    public Triangle(double slide1, double slide2, double slide3) throws IllegalTriangleException {
        if (slide1<=0||slide2<=0||slide3<=0){
              throw  new IllegalTriangleException("canh nho hon khong");
        }else if(slide1 + slide2 <= slide3 || slide2 + slide3 <= slide1 || slide3 + slide1 <= slide2){
            throw  new IllegalTriangleException("tông hai canh nho hon 1 canh");
        }else {
            this.slide1 = slide1;
            this.slide2 = slide2;
            this.slide3 = slide3;
        }

    }

    public double getSlide1() {
        return slide1;
    }

    public void setSlide1(double slide1) {
        this.slide1 = slide1;
    }

    public double getSlide2() {
        return slide2;
    }

    public void setSlide2(double slide2) {
        this.slide2 = slide2;
    }

    public double getSlide3() {
        return slide3;
    }

    public void setSlide3(double slide3) {
        this.slide3 = slide3;
    }
}
