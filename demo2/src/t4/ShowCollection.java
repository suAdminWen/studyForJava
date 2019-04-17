package t4;

import java.util.*;

public class ShowCollection {
    public static void show() {
        System.out.println("以下代码展示了可以在Collection对象上执行的操作");
        System.out.println("--------------------------------------- ");
        Collection<String> c = new HashSet<>();
        Collection<String> d = Arrays.asList("one", "two");
        Collection<String> e = Collections.singleton("three");

        c.add("zero");  // 添加单个元素
        c.addAll(d);  // 添加d中的所有元素
        System.out.println(c);

        // 复制集合：多数实现都有副本构造方法
        Collection<String> copy = new ArrayList<String>(c);
        c.remove("zero");
        c.removeAll(e);
        c.retainAll(d);
        c.clear();

        // 获取集合的大小
        boolean b = c.isEmpty();  // c 是空的
        int s = c.size();  // 现在c的大小是0
        System.out.println(b);
        System.out.println(s);

        // 使用前面创建的副本复原集合
        c.addAll(copy);

        // 测试元素是否在集合中，测试基于equals()方法
        b = c.contains("zero");
        System.out.println(b);
        b = c.containsAll(d);
        System.out.println(b);

        System.out.println(c);

        Object[] elements = c.toArray();
        System.out.println(elements);
        // 如果想把集合中的元素存入到String[]类型的数组，必须在指定这个类型
        String[] strings = c.toArray(new String[c.size()]);
        // 或者传入一个类型为String[]的空数组，指定所需的类型
        // toArray() 方法会为这个数组分配空间
        strings = c.toArray(new String[0]);
        System.out.println(strings);
    }
}
