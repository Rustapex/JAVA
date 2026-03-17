package Variable;

public class GameMain {
    public static void main(String[] args) {
        Game game1 = new Game("Apex Legend", 0);
        Game game2 = new Game("Escape from Tarkov", 55000);
        Game game3 = new Game();

        System.out.println(game1.toString());
        System.out.println(game2.toString());

        System.out.println(Game.cnt);
        Game.printCount();
    }
}
