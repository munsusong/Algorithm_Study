public class Array1 {
    public static boolean StringCheck(String array) {
        boolean[] ChrArray = new boolean[128];
        for (int i = 0; i < array.length(); i ++) {
            char chr = array.charAt(i);
            if (ChrArray[(int)chr] == true) 
                return false;
            
            ChrArray[(int)chr] = true;
        }
        return true;
    }
}