import java.util.*;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class XOGAME {
    public static void main(String[] args) {
        char[][] table = new char[3][3];
        for (int i = 0; i <= table.length - 1; i++) {
            for (int j = 0; j <= table[0].length - 1; j++) {
                table[i][j] = ' ';
            }
        }
        Scanner sc = new Scanner(System.in);
        char player = 'x';
        boolean end = false;

        while (!end) {
            printTable(table);
            System.out.println("player " + " " + player + " " + "enter");
            int i = sc.nextInt();
            int j = sc.nextInt();
            if (table[i][j] == ' ') {

                table[i][j] = player;

                if (won(table, player)) {
                    System.out.println("player " + player + " " + "Won!");
                    break;
                } else if (isfilled(table)) {
                    System.out.println("Match draw!");
                    break;
                } else {
                    player = (player == 'x') ? 'o' : 'x';
                }
            } else {
                System.out.println("already filled try again!");
            }

        }
    }

    public static boolean isfilled(char[][] table) {
        boolean ans = true;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                if (table[i][j] == ' ') {
                    ans = false;
                    break;
                }
            }
        }
        return ans;
    }

    public static void printTable(char[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                System.out.print(table[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static boolean won(char[][] arr, char player) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == player && arr[i][1] == player && arr[i][2] == player) {
                return true;
            }
        }
        for (int j = 0; j < arr[0].length; j++) {
            if (arr[0][j] == player && arr[1][j] == player && arr[2][j] == player) {
                return true;
            }
        }
        if (arr[0][0] == player && arr[1][1] == player && arr[2][2] == player) {
            return true;
        } else if (arr[0][2] == player && arr[1][1] == player && arr[2][0] == player) {
            return true;
        }
        return false;
    }
}