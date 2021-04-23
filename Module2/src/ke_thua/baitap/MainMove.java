package ke_thua.baitap;

public class MainMove {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(0, 0, 20, 20);
        moveablePoint.move();
        System.out.println(moveablePoint.toString());

    }

}
