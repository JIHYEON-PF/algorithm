import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        
        StringBuffer answer = new StringBuffer();
        
        for (String s : letter.split(" ")) {
            answer.append(morse.get(s));
        }
        
        return answer.toString();
    }
    
    HashMap<String,String> morse = new HashMap<>(){{
            put(".-","a");
            put("-...","b");
            put("-.-.","c");
            put("-..","d");
            put(".","e");
            put("..-.","f");
            put("--.","g");
            put("....","h");
            put("..","i");
            put(".---","j");
            put("-.-","k");
            put(".-..","l");
            put("--","m");
            put("-.","n");
            put("---","o");
            put(".--.","p");
            put("--.-","q");
            put(".-.","r");
            put("...","s");
            put("-","t");
            put("..-","u");
            put("...-","v");
            put(".--","w");
            put("-..-","x");
            put("-.--","y");
            put("--..","z");
        }};
        
}