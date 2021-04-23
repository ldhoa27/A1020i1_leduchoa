package ke_thua.baitap;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        this.setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] XYZ = {this.getX(),this.getY(),this.getZ()};
        return XYZ;
    }

    @Override
    public String toString() {
        return "Point3D" +
                " which is a subclass of "
                +"x=" + getX() +
                ", y=" + getY() +
                ", z=" + getZ() ;
    }
}
