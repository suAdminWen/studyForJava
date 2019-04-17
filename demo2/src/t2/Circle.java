package t2;

import java.awt.image.CropImageFilter;
public class Circle extends Shape {
    public static final double PI = 3.14159;
    public double r;

    public Circle(double r) {
        // 构造函数
        checkoutRadius(r);
        this.r = r;
    }
    protected void checkoutRadius(double radius){
        if (radius < 0.0){
            throw new IllegalArgumentException("radius");
        }
    }

    public void setR(double r){
        checkoutRadius(r);
        this.r = r;
    }

    public static double radiansToDegrees(double radians){
        return radians * 180 / PI;
    }

    public double area(){
        return PI * this.r * this.r;
    }

    public double circumference(){
        return PI * 2 * this.r;
    }

    public boolean isInside(double x, double y){
        return true;
    }
}

