public class Array2{
    public static boolean PermutationCheck(String array1, String array2){
        if(array1.length() != array2.length()){
            return false;
        }
        char[] chrArray = new char[array1.length()];
        for(int i = 0; i < array1.length(); i++){
            char a1 = array1.charAt(i);
            for(int e = 0; e < array2.length(); i++){
                char a2 = array2.charAt(e);
                if(a1 == a2){
                    chrArray[i] = a1;
                } 
            }
            if(chrArray[i] == a1) return false;
        }
        return true;
    }
}