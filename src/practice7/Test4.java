package practice7;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Test4 {
    public static List<String>  generatePerm(String str){
        if(str==null || str.isEmpty()){
            return Collections.emptyList();
        }

        return perm("",str);
    }

    public static List<String> perm(String prefix, String str){
        int n = str.length();
        if(n==0){
            return Collections.singletonList(prefix);
        }else {
             return IntStream.range(0,n)
                     .boxed()
                     .flatMap(i->perm(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1)).stream())
                     .collect(Collectors.toList());


        }
    }

    public static void main(String[] args) {


/*        input: str = “abb”
          Output: abb abb bab bba bab bba
         input: str = “abc”
         Output: abc acb bac bca cab cba
*/
        String str = "abc";
        List<String > permutation=generatePerm(str);
        String result = permutation.stream().collect(Collectors.joining(" "));
        System.out.println(result);



    }
}
