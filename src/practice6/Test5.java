package practice6;

public class Test5 {
    public static int fibRec(int num){

        if(num<=1){
            return num;
        }
       return fibRec(num-1)+fibRec(num-2);

    }
    public static void main(String[] args) {
        // 1st 10 using recursion
        int num=10;

        for(int i=0;i<num;i++){
            System.out.print(fibRec(i)+" ");
        }






    }
}
