package CG;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
* interface Iterator{
*   boolean hasnext()
*   Object next()
* }
* */
public class collectionDome01 {
    public static void main(String[] args) {
        Collection collection=new ArrayList();
        collection.add(100);
        collection.add("陈淦");
        Iterator it=collection.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
