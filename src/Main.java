import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int Minimum_length(int n,int[]A,int []B){
        int L=-1;
        int R = -1;
        for(int i = 0;i<n;i++){
            if (A[i] != B[i]){
                if(L == -1){
                    L = i;
                }
                R = i;
            }

        }
        if (L == -1){
            return 0;
        }
        else {
            return R - L + 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }
            System.out.println(Minimum_length(N, A, B));
        }
    }
}
