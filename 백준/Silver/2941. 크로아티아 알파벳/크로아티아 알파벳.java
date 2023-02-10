import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        
        String[] croatiaAlphabet = new String[] {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        for (String s : croatiaAlphabet) {
            if (str.contains(s)) {
                str = str.replaceAll(s, "A");
            }
        }
        
        bw.write(String.valueOf(str.length()));
        bw.flush();
        bw.close();
        br.close();

    }
}