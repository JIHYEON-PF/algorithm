class Solution {
    public long solution(String numbers) {
        StringBuffer sb = new StringBuffer();
        StringBuffer result = new StringBuffer();
        
        for (String s : numbers.split("")) {
            sb.append(s);
            int num = checkEnglishNum(sb.toString());
            
            if (num > -1) {
                sb = new StringBuffer();
                result.append(num);
            }
        }
        
        return Long.parseLong(result.toString());
    }
    
    public int checkEnglishNum(String keyword) {
        switch(keyword) {
            case "zero":
                return 0;
            case "one":
                return 1;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            default:
                return -1;
        }
    }
}