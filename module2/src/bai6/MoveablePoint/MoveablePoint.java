package bai6.MoveablePoint;

public class MoveablePoint extends Point{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;
    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getXY(){
        float [] array={xSpeed,ySpeed};
        return array;
    }
    public MoveablePoint move(){
        setXY(getX()+xSpeed,getY()+ySpeed);
        return this;
    }
    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +"x= "+super.getX()+"y= "+super.getY()+
                '}';
    }
}