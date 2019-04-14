import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    Point2D() {
    }

    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    float getX() {
        return x;
    }

    void setX(float x) {
        this.x = x;
    }

    float getY() {
        return y;
    }

    void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    private float[] getXY() {
        float [] array = new float[] {x,y};
        return array;
    }

    @Override
    public String toString() {
        return "X,Y = " + Arrays.toString(getXY());
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(1.0f, 2.0f);
        System.out.println(point2D);
    }
}