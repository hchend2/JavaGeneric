import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Collections;

class Main {
  public static void main(String[] args) {
      SomeGeneric<Integer> myVal = new SomeGeneric<>(10);
      
      myVal.addToList(1);
      myVal.addToList(-1);
      
      System.out.println();
      myVal.printList();
      System.out.println();

    System.out.println("Hello world!");
  }
}