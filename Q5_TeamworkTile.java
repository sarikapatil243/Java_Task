
import java.util.Scanner;

public class Q5_TeamworkTile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your tile number:");
        int yourTile = scanner.nextInt();
        System.out.println("Enter your friend's tile number:");
        int friendsTile = scanner.nextInt();
        System.out.println(possibleBonus(yourTile, friendsTile));
    }
public static boolean possibleBonus(int yourTile, int friendsTile) {
        if (yourTile >= friendsTile) {
            return false;
        }
        return (friendsTile - yourTile) <= 6;
    }
}