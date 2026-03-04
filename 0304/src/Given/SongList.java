package Given;

import java.util.HashMap;
import java.util.Scanner;

public class SongList {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        HashMap<String, String> songs = new HashMap<>();
        songs.put("우주연", "벌써1년");
        songs.put("손영석", "역성");



        String resultSong = songs.get("우주연");
        System.out.println(resultSong);
        // map => (key, value) 형태로 저장 약간 배열 느낌

        System.out.println("이름을 입력하시오");
        String name = sc.nextLine();
        String nameSong = songs.get(name);
        System.out.println(nameSong);

        sc.close();
    }
}


