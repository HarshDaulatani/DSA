package hackerearth;

import java.util.Scanner;

public class FindMEX {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            boolean[] seen = new boolean[n + 1];
            int mex = 0;

            for(int i = 0; i < n; i++){

                if(arr[i] >= 0 && arr[i] <= n){
                    seen[arr[i]] = true;
                }

                while(mex <= n && seen[mex]){
                    mex++;
                }

                System.out.print(mex + " ");
            }
        }
    }
