//public class ReverseString_Recarsion {
//    public static void main(String[] args) {
//        String Str = "object";
//        String revstr ="";
//        int L = Str.length();
//        String revStr = reverse(Str ,L , revstr);
//        System.out.println(revStr);
//
//
//
////        String revStr = reverse(Str);
////        System.out.println(revStr);
//    }
//
//
//
//    public static String reverse(String Str,int L, String revstr){
//        for(int i=L-1; i>=0;i--){
//            revstr = revstr + Str.charAt(i);
//        }
//        return revstr;
//    }
////    private static String reverse(String Str){
////        if(Str == null || Str.length() <= 1){
////            return Str;
////        }
////        return reverse(Str.substring(1))+Str.charAt(0);
//    //}
//
//
//}
public class ReverseString_Recarsion {
    public static void main(String[] args) {
        String str = "object";
      String revstr = reverse(str);
        System.out.println(revstr);
    }
    private static String reverse(String str){
        if(str == null || str.length() <=1){
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
