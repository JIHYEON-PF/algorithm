import java.io.*;
import java.math.BigInteger;
import java.util.*;

class Main {

    static char[] A;
    static char[] B;

    static char[] setArrays(int size, char[] AB) {
        char[] temp = new char[size];
        Arrays.fill(temp, '0');
        if (temp.length - (size - AB.length) >= 0)
            System.arraycopy(AB, 0, temp, size - AB.length, temp.length - (size - AB.length));

        return AB = Arrays.copyOf(temp, temp.length);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] A = st.nextToken().toCharArray();
        char[] B = st.nextToken().toCharArray();

        int size = Math.max(A.length, B.length);
        if (A.length > B.length) {
            B = setArrays(size, B);
        } else {
            A = setArrays(size, A);
        }

        int upper = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = size - 1 ; i >= 0 ; i--) {
            int sumValue = (A[i] - '0') + (B[i] - '0');

            if (upper > 0) {
                sumValue += upper;
                --upper;
            }

            if (sumValue > 9) {
                upper++;
                sumValue = sumValue % 10;
            }
            stack.add(sumValue);
        }

        if (upper != 0) {
            stack.add(upper);
        }

        while (!stack.isEmpty()) {
            bw.write(stack.pop() + "");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
