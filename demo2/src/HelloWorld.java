import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World!");
        int[] smallPrimes = new int[4];  // 定义数组
        for (int i = 0; i < 4; i++) {
            smallPrimes[i] = i;  // 数组赋值
            System.out.println(smallPrimes[i]);
        }
        System.out.println(smallPrimes.length);

        String[] responses = new String[2];
        responses[0] = "王志文";
        responses[1] = "编码";
        for (String s : responses) System.out.println(s);

        String o = "o";
        String hello1 = "hello";
        String hello2 = "hell" + o;  // hello1 != hello2
        // == 比较引用类型时,比较的是引用而不是真正的对象
        if (hello1 == hello2) System.out.println("equal");
        // equals 比较是否值是否相等
        if (hello1.equals(hello2)) System.out.println("equal");

        // 对象的操作
        Circle circle = new Circle(3.1);
        System.out.println(circle.r);
        circle.setR(3.2);
        System.out.println(circle.r);
        System.out.println(circle.area());
        System.out.println(circle.circumference());
        System.out.println(Circle.radiansToDegrees(12));

        PlaneCircle planeCircle = new PlaneCircle(2.1, 2, 1);
        System.out.println(planeCircle.getCenterX());
        System.out.println(planeCircle.getCenterY());
        System.out.println(planeCircle.isInside(4, 1));

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.2);
        shapes[1] = new Rectangle(2.0, 3.0);
        shapes[2] = new Rectangle(2.1, 2.2);

        double totalArea = 0.0;
        for (Shape shape : shapes){
            totalArea += shape.area();
        }
        System.out.println(totalArea);

        // 范型
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(2.0, 3.0));
        rectangles.add(new Rectangle(2.1, 3.1));
        Rectangle rectangle = rectangles.get(0);
        System.out.println(rectangle.area());
        System.out.println(PrimaryColor.RED);

        FilenameFilter filenameFilter = new FilenameFilter();
        System.out.println(filenameFilter.getFilenames());

    }

    public enum PrimaryColor{
        RED, BLUE, GREEN
    }
}
