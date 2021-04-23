package OOP.baitap.fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int setSpeed(int newSpeed) {
        this.speed = newSpeed;
        return this.speed;
    }

    public boolean setOn(boolean status) {
        this.on = status;
        return this.on;
    }

    public double setRadius(int newRadius) {
        this.radius = newRadius;
        return this.radius;
    }

    public String setColor(String newColor) {
        this.color = newColor;
        return this.color;
    }


    public Fan() {
    }

    public String toString() {
        String feedback = "";
        feedback += "Fan, Speed : " + this.speed +
                ". Color : " + this.color +
                ". Radius : " + this.radius;
        if (this.on) {
            feedback += ". Fan is on";
        } else {
            feedback += ". Fan is off";
        }
        return feedback;
    }
}
