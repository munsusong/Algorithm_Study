public class Array6 {
    public String returnString(String str) {
        if (str.length() < compressString(str).length()) {
            return str;
        } else {
            return compressString(str);
        }
    }
    public String compressString(String str) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i ++) {
            count ++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                sb.append(str.charAt(i));
                sb.append(count);
                count = 0;
            }
            // if (i != 0 && str.charAt(i) != str.charAt(i - 1)) {
            //     sb.append(str.charAt(i - 1));
            //     sb.append(count);
            //     count = 1;
            //     continue;
            // }
            // if (i == str.length() - 1) {
            //     sb.append(str.charAt(i));
            //     sb.append(count + 1);
            // }
            // count ++;
        }
        return sb.toString();
    }
}