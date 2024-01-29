package bai6.Point;

public class Point3D extends Point2D{
    private float z=0.0f;

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
    public void setXYZ(float x,float y,float z){
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }
    public float[] getXYZ(){
        float[] array3D={this.getX(),this.getY(),z};
        return array3D;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +"x= "+super.getX()+"y= "+super.getY()+
                '}';
    }
    public static void main(String[] args) {
        Point3D point3D=new Point3D();
        System.out.println(point3D);
        point3D=new Point3D(3.0f,4.0f,6.0f);
        System.out.println(point3D);
    }
}