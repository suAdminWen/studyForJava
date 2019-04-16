public class Rectangle extends Shape{
    // 抽象类的具体子类

    protected double w, h;
    public Rectangle(double w, double h){
        this.w = w;
        this.h = h;
    }

    public double getWidth(){
        return w;
    }
    public double getHeight(){
        return h;
    }

    @Override
    public double area(){
        return w * h;
    }

    @Override
    public double circumference() {
        return 2 * (w + h);
    }
}
