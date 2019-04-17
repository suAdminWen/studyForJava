package t4;

import java.util.*;

public class ShowMap {
    public static void show(){
        System.out.println("以下代码展示了可以在Map对象上执行的操作");
        System.out.println("--------------------------------------- ");

        // 新建一个空映射
        Map<String, Integer> m = new HashMap();

        // 不可变的映射，只包含一个键值对
        Map<String, Integer> singleton = Collections.singletonMap("test", -1);

        // 注意，较少使用以下语句显式指定通用方法emptyMap()的参数类型
        Map<String, Integer> empty = Collections.<String, Integer>emptyMap();

        // 使用put()方法填充映射，把数组中的元素映射到元素的索引上
        String[] words = {"this", "is", "a", "test"};
        for (int i = 0; i < words.length; i++){
            m.put(words[i], i); // 注意，int 会自动装包成Integer
        }

        // 使用get() 方法查询映射
        for(int i = 0; i < words.length; i++){
            if(m.get(words[i]) != i) throw new AssertionError();
        }

        // 一个键只能映射一个值
        for(int i = 0; i < words.length; i++){
            m.put(words[i].toUpperCase(), i);
        }

        m.putAll(singleton);

        // 测试映射中是否有指定的健和值
        m.containsKey(words[0]);
        m.containsKey(words.length);

        // 映射的健、值和键值对都可以看做集合
        Set<String> keys = m.keySet();
        Collection<Integer> values = m.values();
        Set<Map.Entry<String, Integer>> entries = m.entrySet();

        System.out.printf("Map: %s%nKeys: %s%nValues: %s%nEntries: %s%n",
                m, keys, values, entries);

        // 可以迭代这些集合
        // 多数映射都没有定义迭代的顺序
        for (String key: m.keySet()) System.out.println(key);
        for (Integer value: m.values()) System.out.println(value);

        for(Map.Entry<String, Integer> pair: m.entrySet()){
            System.out.printf("'%s' ==> %d%n", pair.getKey(), pair.getValue());
            pair.setValue(pair.getValue() + 1);
        }

        m.put("testing", null);  // 映射到null可以擦除一个键值对
        m.get("testing");  // 返回null
        m.containsKey("testing");  // 返回true；键值对依然存在
        m.remove("testing");  // 删除键值对
        m.get("testing");  // 还是返回null
        m.containsKey("testing");  // 这次返回false

        Iterator<Map.Entry<String, Integer>> iter = m.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<String, Integer> e = iter.next();
            if (e.getValue() == 2) iter.remove();
        }

        Set<Integer> v = new HashSet<Integer>(m.values());
        v.retainAll(singleton.values());

        m.clear();
        m.size();
        m.isEmpty();
        m.equals(empty);

    }
}
