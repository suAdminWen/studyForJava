// 这是一个简单的接口
interface InterfaceShape{
    void setSize(double width, double height);
    double area();
    double circumference();
    boolean isInside(double x, double y);
}

// 上述接口的部分实现
public abstract class Shape implements InterfaceShape{
    // 抽象类
    protected double w, h;
    public void setSize(double width, double height){
       w = width; h = height;
    }
}
