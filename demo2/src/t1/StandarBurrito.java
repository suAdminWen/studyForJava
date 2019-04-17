package t1;

// 具体实现——标准尺寸的卷饼
public class StandarBurrito implements Burrito {
    private static final double BASE_PRICE = 5.99;
    public double getPrice(){
        return BASE_PRICE;
    }
}
