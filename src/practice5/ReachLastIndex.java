//Program : Check whether last index in an array is reachable from the first
//        Input : [2,1,3,4,5,0]    -->0,2,5
//        Output : true
//
//        Input : [2,1,4,2,5,0]
//        Output : false
//
//        Input : [3,5,1,1,5,1,0] 0,3,4 -- out of arr aging at backward 3
//        0,3,2,1,6
//        Output : true

package practice5;

import java.util.LinkedList;
import java.util.Queue;

public class ReachLastIndex {

    public static boolean canReachLastIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        int n = nums.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        // Start from the first index
        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int currentIndex = queue.poll();
            int stepSize = nums[currentIndex];

            // Check possible forward movement
            int forwardIndex = currentIndex + stepSize;
            if (forwardIndex == n - 1) {
                return true;
            }
            if (forwardIndex < n && !visited[forwardIndex]) {
                queue.add(forwardIndex);
                visited[forwardIndex] = true;
            }

            // Check possible backward movement
            int backwardIndex = currentIndex - stepSize;
            if (backwardIndex == n - 1) {
                return true;
            }
            if (backwardIndex >= 0 && !visited[backwardIndex]) {
                queue.add(backwardIndex);
                visited[backwardIndex] = true;
            }
        }

        return false;
    }
    public static void main(String[] args) {

        int[] arr1 = {2,1,3,4,5,0};
        int[] arr2 = {2,1,4,2,5,0};
        int[] arr3 = {3,5,1,1,5,1,0};

        System.out.println(canReachLastIndex(arr1));
        System.out.println(canReachLastIndex(arr2));
        System.out.println(canReachLastIndex(arr3));


    }
}
