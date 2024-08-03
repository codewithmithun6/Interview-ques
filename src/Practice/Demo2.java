package Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// sum of two number from given array and find out target value
//from Arun Jose (internal) to everyone:    3:33 PM
//        1, 3, 7, 9, 15
//        from Arun Jose (internal) to everyone:    3:33 PM
//        1, 3, 5, 9, 15
//        from Arun Jose (internal) to everyone:    3:34 PM
//        24
public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 9, 15,11,13};
        int target = 14;
        Set<Integer> cSet = new HashSet<>();

        for (int num:arr){
            int c = target-num;
            if(cSet.contains(num)){
                System.out.println(num+" + "+c+" = "+target);
            }
            cSet.add(c);
        }
    }
}

