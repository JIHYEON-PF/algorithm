class Solution {
    public int solution(String myString, String pat) {
        return Boolean.compare(myString.toLowerCase().contains(pat.toLowerCase()), false);
    }
}