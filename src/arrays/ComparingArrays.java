//: arrays/ComparingArrays.java
// Using Arrays.equals()
package arrays;
import java.util.*;
import static net.mindview.util.Print.*;

public class ComparingArrays {
  public static void main(String[] args) {
	  Integer[] test1 = new Integer[]{32, 28, 34};
	  Integer[] test2 = new Integer[]{32, 28, 34};
	  Integer[] test3 = new Integer[]{333, 28, 34};
	  System.out.println(Arrays.equals(test1,test3));
	  System.out.println("adddddd");
	  
	  
    int[] a1 = new int[10];
    int[] a2 = new int[10];
    Arrays.fill(a1, 47);
    Arrays.fill(a2, 47);
    print(Arrays.equals(a1, a2));
    a2[3] = 11;
    print(Arrays.equals(a1, a2));
    String[] s1 = new String[4];
    Arrays.fill(s1, "Hi");
    String[] s2 = { new String("Hi"), new String("Hi"),
      new String("Hi"), new String("Hi") };
    print(Arrays.equals(s1, s2));
  }
} /* Output:
true
false
true
*///:~
