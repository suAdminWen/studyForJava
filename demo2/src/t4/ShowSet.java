package t4;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class ShowSet {
    public static void show(){
        // 除了Collection定义的方法之外，Set没有再定义其他方法，但是
        // 对这些方法做了额外的限制

        System.out.println("以下代码展示了可以在Set对象上执行的操作");
        System.out.println("--------------------------------------- ");

        // TreeSet 红黑树，升序排列
        SortedSet<String> s = new TreeSet<>(Arrays.asList("one", "two"));

        // 迭代集：元素已经自动排序
        for (String word : s){
            System.out.println(word);
        }

        // 特定的元素
        String first = s.first();
        String last = s.last();

        // 除第一个元素之外的所有其他元素
        SortedSet<String> tail = s.tailSet(first + '\0');
        System.out.println(tail);

        // 除第一个元素之外的其他所有元素
        SortedSet<String> head = s.headSet(last);
        System.out.println(head);

        SortedSet<String> middle = s.subSet(first + '\0', last);
        System.out.println(middle);

    }
}
