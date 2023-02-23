class Solution {
    public String solution(String rsp) {
        StringBuffer sb = new StringBuffer();
        
        for (String s : rsp.split("")) {
            if (s.equals("2")) 
                sb.append("0");
            if (s.equals("0"))
                sb.append("5");
            if (s.equals("5"))
                sb.append("2");
        }
        
        return sb.toString();
    }
}