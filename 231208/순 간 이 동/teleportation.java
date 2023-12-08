import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        // 바로 이동하기, A가 B보다 클 수도 있음.
        int result = Math.abs(A - B);

        // x에서 y로 이동하기
        int dis = Math.abs(A - x) + Math.abs(B - y);
        result = Math.min(result, dis);

        // y에서 x로 이동하기
        dis = Math.abs(A - y) + Math.abs(B - x);
        result = Math.min(result, dis);

        System.out.println(result); 
    }
}