package t1;

import t1.Burrito;
import t1.BurritoOptionalExtra;

// 配料的具体实现
public class Guacamole extends BurritoOptionalExtra {
    public Guacamole(Burrito toDecorate, double myPrice) {
        super(toDecorate, myPrice);
    }
}
