public class Array2 {
    public static boolean PermutationCheck(String array1, String array2) {
        if (array1.length() != array2.length()) {
            return false;
        }
        int[] temp1 = new int[128];
        int[] temp2 = new int[128];
        for (int i = 0; i < array1.length(); i ++) {
            temp1[(int)array1.charAt(i)]++;
            temp2[(int)array2.charAt(i)]++;
        }
        for (int i = 0; i < 128; i ++) {
            if (temp1[i] != temp2[i]) 
                return false;
            
        }
        return true;
    }
}