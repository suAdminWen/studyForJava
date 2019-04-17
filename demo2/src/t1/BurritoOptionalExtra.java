package t1;

/**
 * 这个类是Burrito接口的修饰器
 * 表示墨西哥卷饼的可选配料
 */
public abstract class BurritoOptionalExtra implements Burrito{
    private final Burrito burrito;
    private final double price;
    protected BurritoOptionalExtra(Burrito toDecorate, double myPrice){
        burrito = toDecorate;
        price = myPrice;
    }

    public final double getPrice(){
        return (burrito.getPrice() + price);
    }
}
