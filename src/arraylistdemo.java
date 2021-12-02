import java.util.*;
public class arraylistdemo {
    public static void main(String[] args) {
        //crate an array list
        ArrayList<String > a1=new ArrayList<>();
        System.out.println("Initial size of a1:"+a1.size());
        //Add elements to the array list.
        a1.add("C");
        a1.add("A");
        a1.add("B");
        a1.add("D");
        a1.add("F");
        a1.add(1,"A2");
        System.out.println("size of a1 after addictions:"+a1.size());
        //display the array list.
        System.out.println("Contents of a1: "+a1);
        //.remove elements from the array list.
        a1.remove("F");
        a1.remove(2);
        System.out.println("Size of a1 after deletions:"+a1.size());
        System.out.println("Contents of a1:"+a1);
    }
}
