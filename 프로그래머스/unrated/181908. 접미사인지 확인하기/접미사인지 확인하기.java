class Solution {
    public int solution(String my_string, String is_suffix) {
        return Boolean.compare(my_string.endsWith(is_suffix), false);
    }
}