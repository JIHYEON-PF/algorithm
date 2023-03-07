class Solution {
    public String solution(String polynomial) {
        int number = 0;
        int polyNumber = 0;
        
        for (String s : polynomial.replace(" ", "").split("\\+")) {
            if (s.contains("x")) {
                if (s.length() > 1) {
                    polyNumber += Integer.parseInt(s.substring(0, s.indexOf("x")));
                } else {
                    polyNumber++;
                }
            } else {
                number += Integer.parseInt(s);
            }
        }
        
        if (polyNumber == 0) {
            return number + "";
        } else if (polyNumber == 1) {
            if (number > 0) {
                return "x + " + number;
            } else {
                return "x";
            }
        } else {
            if (number > 0) {
                return polyNumber + "x + " + number;
            } else {
                return polyNumber + "x";
            }
        }
    }
}