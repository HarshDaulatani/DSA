package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.*;
import java.util.*;
public class MakeanArray {
    public class TestClass {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter wr = new PrintWriter(System.out);
            int T = Integer.parseInt(br.readLine().trim());
            for(int t_i = 0; t_i < T; t_i++)
            {
                int N = Integer.parseInt(br.readLine().trim());
                String[] arr_A = br.readLine().split(" ");
                int[] A = new int[N];
                for(int i_A = 0; i_A < arr_A.length; i_A++)
                {
                    A[i_A] = Integer.parseInt(arr_A[i_A]);
                }

                int out_ = solve(N, A);
                System.out.println(out_);

            }

            wr.close();
            br.close();
        }
        static int solve(int N, int[] A) {
            // Edge case
            if (N == 1) {
                if(A[0] == 0){
                    return 0;
                }
                else {
                    return -1;
                }
            }

            long sum = 0;
            long max = Integer.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                sum += A[i];
                if(A[i] >= max){
                    max=  A[i];
                }
            }
            long k =0;
            if (sum % (N - 1) == 0 && max <= sum/(N-1)) {
                k =  sum/(N-1);
            }
            else{
                return -1;
            }
            return (int) k;
        }
    }
}
