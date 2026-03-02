package hackerearth;
import java.io.*;
import java.util.*;
public class HiddenTreasure {



    public class TestClass {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter wr = new PrintWriter(System.out);
            int n = Integer.parseInt(br.readLine().trim());
            String[] arr_nums = br.readLine().split(" ");
            int[] nums = new int[n];
            for(int i_nums = 0; i_nums < arr_nums.length; i_nums++)
            {
                nums[i_nums] = Integer.parseInt(arr_nums[i_nums]);
            }

            long out_ = solve(n, nums);
            System.out.println(out_);

            wr.close();
            br.close();
        }
        static long solve(int n, int[] nums){
            int [] result = new int [n];
            for(int i = 0;i<n;i++){
                int num = Math.abs(nums[i]);
                int sum = 0;
                while(num>0){
                    sum += num%10;
                    num /= 10;
                }
                result[i] = sum;
            }
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0;i<n;i++){
                map.put(result[i], map.getOrDefault(result[i], 0) + 1);
            }
            long pairs = 0;
            for(int freq : map.values()){
                pairs += (long)freq * (freq -1) / 2;
            }
            return pairs;
        }
    }
}
