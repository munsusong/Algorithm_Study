public class Array3{
    public static String replaceSpaces(String str){
       int trueLength = str.length(), index = 0, count = 0;
       for(int i = 0; i < str.length(); i++){
           if(str.charAt(i) == ' '){
               count++;
           }
       }
       trueLength += count*3;
       
       char[] chr = new char[trueLength];
        
       for(int i = 0; i < str.length(); i++){
           if(str.charAt(i) == ' '){
               chr[index] = '%';
               index++;
               chr[index] = '2';
               index++;
               chr[index] = '0';
               index++;
           }
           else{
               chr[index] = str.charAt(i);
               index++;
           }
       }
       return String.valueOf(chr);
    }
}