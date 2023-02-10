import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        int[] alphabets = new int[26];
    
        char[] chr = br.readLine().toLowerCase().toCharArray();
    
        for (char c : chr) {
            ++alphabets[c - 97];
        }
    
        int maxValue = 0;
        int maxValueIndex = 0;
    
        boolean maxValueIsCoupled = false;
    
        for (int i = 0 ; i < alphabets.length ; i++) {
            if (alphabets[i] == 0) {
                continue;
            }
        
            if (maxValue == alphabets[i]) {
                maxValueIsCoupled = true;
            } else if (maxValue < alphabets[i]) {
                maxValue = alphabets[i];
                maxValueIndex = i;
                maxValueIsCoupled = false;
            }
        }
    
        if (maxValueIsCoupled) {
            bw.write("?");
        } else {
            bw.write((char) maxValueIndex + 65);
        }
    
        bw.flush();
        bw.close();
        br.close();
    }
}