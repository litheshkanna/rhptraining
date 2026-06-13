import java.util.*;
import java.io.*;

public class KaranAndCoffee {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); 
        int k = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken()); 
        int MAX = 200005;
        int[] count = new int[MAX];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            for (int j = l; j <= r; j++) {
                count[j]++; 
            }
        }
        int[] admissible = new int[MAX];
        for (int i = 1; i < MAX; i++) {
            admissible[i] = admissible[i - 1] + (count[i] >= k ? 1 : 0);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int ans = admissible[b] - admissible[a - 1];
            sb.append(ans).append("\n");
        }

        System.out.print(sb);
    }
}
