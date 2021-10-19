import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Project name(项目名称)：Map集合
 * Package(包名): PACKAGE_NAME
 * Class(类名): Map_class
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/19
 * Time(创建时间)： 22:18
 * Version(版本): 1.0
 * Description(描述)：
 * Map 是一种键-值对（key-value）集合，Map 集合中的每一个元素都包含一个键（key）对象和一个值（value）对象。用于保存具有映射关系的数据。
 * Map 集合里保存着两组值，一组值用于保存 Map 里的 key，另外一组值用于保存 Map 里的 value，key 和 value 都可以是任何引用类型的数据。
 * Map 的 key 不允许重复，value 可以重复，即同一个 Map 对象的任何两个 key 通过 equals 方法比较总是返回 false。
 * Map 中的 key 和 value 之间存在单向一对一关系，即通过指定的 key，总能找到唯一的、确定的 value。从 Map 中取出数据时，
 * 只要给出指定的 key，就可以取出对应的 value。
 * Map 接口主要有两个实现类：HashMap 类和 TreeMap 类。其中，HashMap 类按哈希算法来存取键对象，而 TreeMap 类可以对键对象进行排序。
 * Map 接口中提供的常用方法如表 1 所示。
 * 表 1 Map接口的常用方法
 * 方法名称	说明
 * void clear()	删除该 Map 对象中的所有 key-value 对。
 * boolean containsKey(Object key)	查询 Map 中是否包含指定的 key，如果包含则返回 true。
 * boolean containsValue(Object value)	查询 Map 中是否包含一个或多个 value，如果包含则返回 true。
 * V get(Object key)	返回 Map 集合中指定键对象所对应的值。V 表示值的数据类型
 * V put(K key, V value)	向 Map 集合中添加键-值对，如果当前 Map 中已有一个与该 key 相等的 key-value 对，
 * 则新的 key-value 对会覆盖原来的 key-value 对。
 * void putAll(Map m)	将指定 Map 中的 key-value 对复制到本 Map 中。
 * V remove(Object key)	从 Map 集合中删除 key 对应的键-值对，返回 key 对应的 value，如果该 key 不存在，则返回 null
 * boolean remove(Object key, Object value)	这是 Java 8 新增的方法，删除指定 key、value 所对应的 key-value 对。
 * 如果从该 Map 中成功地删除该 key-value 对，该方法返回 true，否则返回 false。
 * Set entrySet()	返回 Map 集合中所有键-值对的 Set 集合，此 Set 集合中元素的数据类型为 Map.Entry
 * Set keySet()	返回 Map 集合中所有键对象的 Set 集合
 * boolean isEmpty()	查询该 Map 是否为空（即不包含任何 key-value 对），如果为空则返回 true。
 * int size()	返回该 Map 里 key-value 对的个数
 * Collection values()	返回该 Map 里所有 value 组成的 Collection
 * Map 集合最典型的用法就是成对地添加、删除 key-value 对，接下来即可判断该 Map 中是否包含指定 key，
 * 也可以通过 Map 提供的 keySet() 方法获取所有 key 组成的集合，进而遍历 Map 中所有的 key-value 对。
 */

public class Map_class
{
    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------


        HashMap m = new HashMap();
        m.put(1, "name1");
        m.put(2, "name2");
        m.put(3, "name3");
        m.put(4, "name4");
        m.put(5, "name5");
        m.put(6, "name6");
        m.put(7, "name7");
        m.put(8, "name8");
        m.put(9, "name9");
        m.put(10, "name10");
        System.out.println("数量：" + m.size());
        for (Object key : m.keySet())
        {
            Object val = m.get(key);
            System.out.println("学号：" + key + "，姓名:" + val);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要删除的学号：");
        int n = input.nextInt();
        if (m.containsKey(n))
        {
            m.remove(n);
            System.out.println("删除成功！！！ 删除后的数据如下：");
            Iterator it = m.keySet().iterator();
            while (it.hasNext())
            {
                Object key = it.next();
                Object val = m.get(key);
                System.out.println("学号：" + key + "，姓名:" + val);
            }
        }
        else
        {
            System.out.println("删除失败！！！");
        }


        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}
