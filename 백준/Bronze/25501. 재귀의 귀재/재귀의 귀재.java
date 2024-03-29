import java.io.*;

class Main {
    static int recursiveCnt = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < N ; i++) {
            String str = br.readLine();
            recursiveCnt = 0;
            int isPalindrome = isPalindrome(str);

            bw.write(isPalindrome + " " + recursiveCnt + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static int recursion(String s, int l, int r) {
        recursiveCnt++;
        if (l >= r) {
            return 1;
        }
        else if (s.charAt(l) != s.charAt(r)) {
            return 0;
        }
        else {
            return recursion(s, l+1, r-1);
        }
    }
    public static int isPalindrome(String s){
        return  recursion(s, 0, s.length() - 1);
    }
}