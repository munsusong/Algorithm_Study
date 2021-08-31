public class Array4 {
    public static boolean palindrome(String str) {
        int[] ascii = new int[128];
        char[] chr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length(); i ++) {
            ascii[(int)chr[i]] += 1;
        }
        for (int i = 0; i < ascii.length; i ++) {
            if (ascii[i] % 2 == 1) {
                if (i != 32) {
                    count ++;
                }
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}