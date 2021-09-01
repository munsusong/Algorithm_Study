public class Array5 {
    public boolean oneEditAway(String first, String second) {
        if (first.length() == second.length()) {
            oneEditReplace();
        } else if (first.length() - second.length() == 1) {
            return oneEditInsert(first, second);
        } else if (first.length() - second.length() == -1) {
            return oneEditInsert(second, first);
        } else {
            return false;
        }
    }
    public boolean oneEditReplace(String s1, String s2) {}
    public boolean oneEditInsert(String s1, String s2) {
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