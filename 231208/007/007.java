import java.io.*;
import java.util.*;

class Secret {
    String code;
    String location;
    int time;

    public Secret(String code, String location, int time) {
        this.code = code;
        this.location = location;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Secret secret = new Secret(st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()));
        System.out.println("secret code : " + secret.code);
        System.out.println("meeting point : " + secret.location);
        System.out.println("time : " + secret.time);
    }
}