class Solution {
    public int[] solution(String[] strlist) {
        
        int[] i = new int[strlist.length];
        
        for (int a = 0 ; a < i.length ; a++) {
            i[a] = strlist[a].length();
        }
        
        return i;
    }
}