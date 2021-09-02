public class Array5 {
    boolean oneEditAway(String first, String second) {
        if (first.length() == second.length()) {
            return oneEditReplace(first, second);
        } else if (first.length() - second.length() == 1) {
            return oneEditInsert(second, first);
        } else if (first.length() - second.length() == -1) {
            return oneEditInsert(first, second);
        } else {
            return false;
        }
    }
    boolean oneEditReplace(String s1, String s2) {
        int count = 0;
        for (int i = 0; i < s1.length(); i ++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count ++;
                if (count == 2) {
                    return false;
                }
            }
        }
        return true;
    }
    boolean oneEditInsert(String s1, String s2) {
        int index1 = 0,
        index2 = 0;
        while (index1 < s1.length() && index2 < s2.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2 ++;
            } else {
                index1 ++;
                index2 ++;
            }
        }
        return true;
    }
}