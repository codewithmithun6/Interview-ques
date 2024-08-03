package Practice;

public class Demo10 {
    public static void main(String[] args) {

        int[] arr = {10,15,20,25,30,40,45,50};
        int left = 0;
        int right = arr.length-1;
        int target = 70;
        int sum=0;
        while(left<right){
            sum  =arr[left] + arr[right];
            if(sum==target){
                System.out.println(arr[left]+" + "+arr[right]+ " = "+target);
                left++;
                right--;
            } else if (sum<target) {
                left++;

            }else {
                right--;
            }
        }
        if(sum!=target){
            System.out.println("There is no pairs of element");
        }

    }
}
