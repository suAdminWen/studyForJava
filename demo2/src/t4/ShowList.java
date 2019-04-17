package t4;

import java.util.*;

public class ShowList {
    public static void show(){
        System.out.println("以下代码展示了可以在List对象上执行的操作");
        System.out.println("--------------------------------------- ");

        List<String> l = new ArrayList<String>(Arrays.asList("one", "two"));
        List<String> words = Arrays.asList("hello", "world");

        // 通过索引查询和设定元素
        String first = l.get(0);  // 列表的第一个元素
        String last = l.get(l.size() - 1);  // 列表的最后一个元素
        l.set(0, last);  // 把最后一个元素变成第一个元素

        // 插入元素
        l.add(first);
        l.add(0, first);  // 把第一个元词添加到列表的头部
        l.addAll(words);  // 把一个列表添加到列表的尾部
        l.addAll(1, words);

        // 子列表
        List<String> sub = l.subList(1, 3);  // 第二个和第三个
        sub.set(0, "hi");  // 修改l的第二个元素
        // 子列表可以把操作限制在原列表索引的子范围内
        String s = Collections.min(l.subList(0, 4));
        Collections.sort(l.subList(0, 4));
        // 子列表的独立副本不影响父列表
        List<String> subcopy = new ArrayList<String>(l.subList(1, 3));

        // 搜索列表
        int p = l.indexOf(last);  // 最后一个词的索引位置
        p = l.lastIndexOf(last);  // 反向搜索

        int n = l.size();
        p = 0;
        do {
            List<String> list = l.subList(p, n);
            int q = list.indexOf(last);
            if (q == -1) break;
            System.out.printf("Found '%s' at index %d%n", last, p+q);
            p += q + 1;
        } while (p < n);

        l.remove(last);
        l.remove(0);
        l.subList(0, 2).clear();  // 使用subList方法，删除一个范围内的元素
        l.retainAll(words);  // 删除所有不在words中的元素
        l.removeAll(words);  // 删除所有在words中的元素
        l.clear();  // 删除所有元素

    }
}
