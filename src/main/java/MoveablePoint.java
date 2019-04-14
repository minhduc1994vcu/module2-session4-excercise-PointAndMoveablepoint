import java.util.Arrays;

public class MoveablePoint extends Point2D {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    MoveablePoint(){

    }
    MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    private MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    private float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    private float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    private float [] getSpeed(){
        float [] array = new float[] {getxSpeed(),getySpeed()};
        return array;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "xs,ys = " + Arrays.toString(getSpeed());
    }

    private float [] move(){
        float [] move = new float[] {super.getX()+getxSpeed(),super.getY()+getySpeed()};
        return move;
    }

    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(1.0f,2.0f,3.0f,4.0f);
        System.out.println(moveablePoint);
        System.out.println("Move (x+xs, y+ys): " + Arrays.toString(moveablePoint.move()));
    }
}