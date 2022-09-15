public class Is_Palimdrom {
    public static void main(String[] args) {
        String s = "777";
        String revStr= "";
        int L = s.length();

        for(int i=L-1;i>=0;i--){

            revStr = revStr+s.charAt(i);

        }
        if( s == revStr){
            System.out.print( "it is a palimdrom " + " " + revStr);
        } else{
            System.out.print("not palimdrom" +" " +revStr);
        }
    }

}
