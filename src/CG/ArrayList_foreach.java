package CG;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* for (Object obj : collection)底层使用的是for循环
* 特点：
*   简化集合遍历
*   循环结束释放迭代器（Iterator）
*   foreach实现遍历可能会出现并发修改异常
* */
public class ArrayList_foreach {
    public static void main(String[] args) {
        Collection collection=new ArrayList();
        collection.add(100);
        collection.add("陈淦");
        collection.add("王昭君");
        collection.add("貂蝉");
        collection.add("西施");
        collection.add("杨贵妃");
        for (Object obj : collection) {
            System.out.println(obj);
        }

        for (Iterator it=collection.iterator();it.hasNext();){
            System.out.println(it.next());
        }
        //底层foreach实现
        for (Iterator it=collection.iterator();it.hasNext();System.out.println(it.next()));
    }
}
