package hackerearth;

import java.io.*;
import java.util.*;

public class MinimumLength {

    public static int minimumLength(int n, int[] A, int[] B) {

        int L = -1;
        int R = -1;

        for (int i = 0; i < n; i++) {
            if (A[i] != B[i]) {
                if (L == -1) L = i;
                R = i;
            }
        }

        if (L == -1) return 0;

        return R - L + 1;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {

            int N = Integer.parseInt(br.readLine());

            int[] A = new int[N];
            int[] B = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }

            output.append(minimumLength(N, A, B)).append("\n");
        }

        System.out.print(output);
    }
}