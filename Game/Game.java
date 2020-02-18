/**
 * Main
 */
public class Game {

    public static void main(String[] args) {
        Character player = new Character("Netrian", CharacterType.WARRIOR);
        Character enemy = new Character("Sipsik", CharacterType.WIZARD);

        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        System.out.println(first);

        player.slogan = "Hey";
        
        System.out.println(player);
        System.out.println(player.direction);

        player.move();
        System.out.println(player);
        player.changeDirection(Direction.RIGHT);

        player.move();
        player.move();
        player.move();
        player.move();
        player.move();

        System.out.println(player);
    }
}