package prac.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 보조 스트림은 반드시 기반 스트림을 필요로 한다.

        String line = br.readLine();
        System.out.println(line);

        String su = br.readLine(); // "123" => 123
        System.out.println(Integer.parseInt(su));

        // Scanner sc.nextInt() sc.nextLine() Integer.parseInt(sc.nextLine()) => Scanner => 보조스트림
    }
}
