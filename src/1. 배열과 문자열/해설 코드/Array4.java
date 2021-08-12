public class Array4 {
    public static void main(String[] args) {
        Array4 array = new Array4();
        String phrase = "tact coa";
        System.out.print(array.isPermutationOfPalindrome(phrase));
    }

    boolean isPermutationOfPalindrome(String phrase) {
        int[] table = bulidCharFrequencyTable(phrase);
        return checkMaxOneOdd(table);
    }

    boolean checkMaxOneOdd(int[] table) {
        boolean foundOdd = false;
        for (int count : table) {
            if (count % 2 == 1) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }

    int[] bulidCharFrequencyTable(String phrase) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
            }
        }
        return table;
    }
}
