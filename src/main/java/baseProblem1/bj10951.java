package baseProblem1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bj10951 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        String input;
        while((input = br.readLine()) != null) {
            int A = input.charAt(0) - '0';
            int B = input.charAt(2) - '0';
            sb.append(A+B).append("\n");
        }
        System.out.println(sb);

    }
}
