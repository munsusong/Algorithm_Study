public class Array6{
    String compressBad(String str){
        String compressedString = "";
        int countConsecutive = 0;
        for (int i = 0; i <str.length(); i++){
            countConsecutive++;
            
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                compressdString += "" + str.charAt(i) + countConsecutive;
                countConsecutive = 0;
            }
        }
        return compressdString.length() < str.length() ? compressedString : str;
    }
    
    String compress(String str){
        StringBulider compressed = new StringBulider();
        int countConsecutive = 0;
        for(int i = 0; i <str.length(); i++){
            countConsecutive++;
            
            if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)){
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressed.length() <str.length() ? compressed.toString() : str;
    }
    
    int countCompression(String str){
        int compressedLength = 0;
        int countConsecutive = 0;
        for (int i = 0; i< str.length(); i++){
            countConsecutive++;
            
            if( i +1 >= str.length() || str.charAt(i) != str.charAt(i + 1)){
                compressedLength += 1 + String.valueOf(countConsecutive).length();
                countConsecutive = 0;
            }
        }
        return compressedLength;
    }

}