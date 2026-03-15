package practice;

public class PlaylistMain {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        System.out.println("=== \t플레이리스트\t===");
        loop:
        while (true) {
            System.out.println("1.추가 / 2.삭제 / 3.수정 / 4.조회 / 5.종료");


            /*나중에 예외처리 배울 때에 숫자가 아닌 다른 자료형이 올 때에 [try - catch]
            예외처리 해주고 다시 입력받기*/
            int menu = playlist.selectMenu();
            switch (menu) {
                case 1 -> {
                    System.out.println("===\t      추가    \t===");
                    playlist.addMenu();
                }
                case 2 -> {
                    System.out.println("===\t      삭제    \t===");
                    playlist.deleteMusic();
                }
                case 3 -> {
                    System.out.println("===\t      수정    \t===");
                    playlist.editMusic();
                }
                case 4 -> {
                    System.out.println("===\t      조회    \t===");
                    playlist.searchMenu();
                }
                case 5 -> {
                    System.out.println("===\t      종료    \t===");
                    break loop;
                }
            }
        }
    }
}
