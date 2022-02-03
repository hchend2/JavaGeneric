import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Collections;

class SomeGeneric<L extends Number & Comparable> {

    private LinkedList<L> myList;
    private L initVal;

    //constructor...
    SomeGeneric(L val) {
        initVal = val;
        myList = new LinkedList<>();
        myList.add(val);
    }
    // add item into linkedlist...
    public void addToList(L val) {
        myList.add(val);
    }

    // print list...
    public void printList() {
        if (myList.isEmpty()) {
            System.out.println("List isEmpty");
        }
        Iterator<L> iter = myList.iterator();
        while(true) {
            if (!iter.hasNext()) {
                break;
            }
            System.out.print(iter.next() + " ");
        }
    }

}