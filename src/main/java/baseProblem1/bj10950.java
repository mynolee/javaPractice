package baseProblem1;

/*import java.util.*;

public class bj10950 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        int b[] = new int[a];
        int c[] = new int[a];
        int d[] = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = b[i] + c[i];
        }
        for (int i = 0; i < a; i++) {
            System.out.println(d[i]);
        }
    }
}

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bj10950{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for( int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine()," ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append('\n');
        }
        System.out.println(sb);
    }
}


