package t3;

/**
 * 单例
 * 获取Singleton的唯一实例是通过静态方法：getInstance()
 * getInstance() 方法使用了synchronized修饰，为了防止再多线程
 * 程序中使用Singleton时得到意外的结果。
 *
 * @author wzw
 * @version 1.0
 */
public class Singleton {
    private final static Singleton instance = new Singleton();
    private static boolean initialized = false;

    // 私有构造方法
    private Singleton(){
        super();
    }
    private void init(){
        /* 做初始化操作 */
    }

    /**
     * 获取唯一的实例
     * @return 唯一的实例
     */
    public static synchronized Singleton getInstance(){
        // synchronized Java线程安全
        if (initialized) return instance;
        instance.init();
        initialized = true;
        return instance;
    }
}
