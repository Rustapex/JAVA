package practice;

import java.util.ArrayList;
import java.util.Scanner;



public class Playlist {
    static Scanner sc = new Scanner(System.in);
    static Song[] songs = new Song[120];
    static int songCount =0;

    public static void main(String[] args) {

        System.out.println("= 플레이리스트 =");
        loop : while(true){
            System.out.println("1.추가 / 2.삭제 / 3.수정 / 4.조회 / 5.종료");

            int menu = Integer.parseInt(sc.nextLine());
            switch (menu){
                case 1->{
                    System.out.println("추가");
                    addMenu();
                }
                case 2->{
                    System.out.println("삭제");
                }
                case 3->{

                    System.out.println("수정");
                    editMusic();
                }
                case 4->{
                    System.out.println("조회");
//                    searchMenu();
                }
                default -> {
                    break loop;}
            }


        }
        sc.close();



    }
    static void addMenu(){
        System.out.println("1. 앨범 추가 / 2. 음악 추가");
        int menu = Integer.parseInt(sc.nextLine());
        if(menu ==1){
            addAlbum();
        } else if(menu ==2){
            addSong();
        } else{
            System.out.println("잘못된 입력");
        }

    }
    static void addAlbum(){
        System.out.println("앨범명 / 곡명 / 장르 / 입력할 곡 개수 순서로 입력");
        System.out.print("앨범명 : ");
        String album = sc.nextLine();

        System.out.print("장르 : ");
        String genre = sc.nextLine();

        System.out.print("가수명 : ");
        String singer = sc.nextLine();

        System.out.print("곡 수 :");
        int count = Integer.parseInt(sc.nextLine());

        /*songCount : 입력하고 있는 배열의 index , count : 현재 입력할 곡 개수 이므로 index +1해서
        * 배열에 공간이 더 있는지 검사 */
        if(songCount+1+ count > songs.length){
            System.out.println("저장공간이 가득 차서 더이상 추가할 수 없습니다");
            return;
        }
        else{
            System.out.println("곡명을 입력하세요 ");
            for(int i=0; i<count ;i++){
                System.out.printf("%d번 곡명 : ",(i+1));
                String songName = sc.nextLine();

                songs[songCount++] = new Song(album, genre, singer, songName);
            }
            System.out.println("앨범 단위 추가 완료");
            System.out.printf("추가로 입력 가능한 곡 개수 : %d%n", (120-songCount));
        }

    }
    static void addSong(){
        System.out.print("입력할 곡 개수:");
        int count = Integer.parseInt(sc.nextLine());
        if(count + songCount +1 > songs.length){
            System.out.println("저장공간이 가득 차서 더이상 추가할 수 없습니다");
            return;
        }
        else{
            for(int i=0; i<count; i++){
                System.out.println("앨범명 / 곡명 / 장르 / 곡명 순서로 입력");
                System.out.print("앨범명 : ");
                String album = sc.nextLine();

                System.out.print("장르 : ");
                String genre = sc.nextLine();

                System.out.print("가수명 : ");
                String singer = sc.nextLine();

                System.out.print("곡명 :");
                String songName = sc.nextLine();

                songs[songCount++] = new Song(album, genre, singer, songName);
                System.out.printf("%d번 곡 추가 완료%n", (i+1));
            }
            System.out.printf("추가로 입력 가능한 곡 개수 : %d%n", (120-songCount));
        }

    }

    static void editMusic(){

        System.out.print("수정할 곡명을 입력하세요:");
        String songs = sc.nextLine();
        /*for(int i=0; i<songCount; i++){
            if(songs[i].eq)
        }*/
    }

}
