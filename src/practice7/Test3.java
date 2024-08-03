package practice7;
public class Test3 {

    public static String comperionVersion(String version1,String version2){

        String[] str1 = version1.split("\\.");
        String[] str2 = version2.split("\\.");

        int len = Math.max(str1.length,str2.length);

        for(int i=0;i<len;i++){


            int v1 = i<str1.length ? Integer.parseInt(str1[i]) :0;
            int v2 = i<str2.length ? Integer.parseInt(str2[i]) :0;

            if(v1<v2){
                return version2;
            }else if(v2>v2){
                return version1;

            }
        }

        return version1;

    }

    public static void main(String[] args) {

        // 1.21.7, 1.21.7.1--> output:1.21.7.1
        String v1 = "1.21.7";
        String v2 = "1.21.7.1";

        System.out.println(comperionVersion(v1,v2));



    }
}
