package SsangYong220825;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
	 
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
 
        for(int i = 0;i <= 100; i++) {
            list.add(i);
        }
        
        Iterator<Integer> iter = list.iterator();
        
        while(iter.hasNext()) {
            int data = iter.next();
            System.out.print(data + " ");
        }
        
    }
    
}