import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Collections;

class SomeGeneric<L extends Number & Comparable> {

    private LinkedList<L> lList;
    private L initVal;

    //constructor...

    SomeGeneric(L val) {
        initVal = val;
        lList = new LinkedList<>();
        lList.add(val);
    }

}