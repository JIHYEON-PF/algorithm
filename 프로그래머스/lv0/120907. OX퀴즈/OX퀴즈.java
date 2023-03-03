class Solution {
    public String[] solution(String[] quiz) {
        String[] result = new String[quiz.length];
        
        for (int i = 0 ; i < quiz.length ; i++) {
            String[] temp = quiz[i].split("=");

            String[] temp2 = temp[0].split(" ");
            String r = (temp2[1].equals("+")) ? (Integer.parseInt(temp2[0]) + Integer.parseInt(temp2[2])) == Integer.parseInt(temp[1].trim()) ? "O" : "X"
                    : (Integer.parseInt(temp2[0]) - Integer.parseInt(temp2[2])) == Integer.parseInt(temp[1].trim()) ? "O" : "X";

            result[i] = r;
        }
        
        return result;
    }
}