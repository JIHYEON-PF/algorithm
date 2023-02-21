import java.io.*;
import java.util.StringTokenizer;

class Main {
    
    static int objectCnt = 20;
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double totalScore = 0;
        double gradeScore = 0;

        for (int i = 0 ; i < 20 ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String object = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String gradeStr = st.nextToken();
            double grade = getGradeScore(gradeStr);

            totalScore += score * grade;
            gradeScore = (gradeStr.equals("P") ? gradeScore + 0 : gradeScore + score);
        }
        
        bw.write(totalScore / gradeScore + "");
        bw.flush();
        bw.close();
        br.close();
    }
    
    static double getGradeScore(String grade) {
        switch (grade) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            case "F":
                return 0;
            default:
                objectCnt--;
                return 0;
        }
    }
}