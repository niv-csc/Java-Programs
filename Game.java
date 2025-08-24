import java.util.*;
import java.util.Random;

public class Game {
    static int total_games = 1;
    static int total_guesses = 0;
    static int games_won = 0;
    static int guess;

    public static void play_Game() {
        Random randoms = new Random();
        int Book_no = randoms.nextInt(101); // secret number
        int asks;

        System.out.print("WELCOME\n !! GUESS THE SECRET NUMBER TO WIN !");

        Scanner s = new Scanner(System.in);

        int i = 0;
        do {
            while (i <= 10) {
                System.out.print("\n Enter your guess:");
                guess = s.nextInt();
                i++;

                if ((guess > 100) || (guess < 1)) {
                    System.out.print("\nGuess within range");
                }

                if (guess == (-1)) {
                    System.out.print("\n BYEE :( ");
                    i = 10;
                    break;
                }

                if (guess < Book_no) {
                    System.out.print("\nGuess higher !");
                    total_guesses += 1;
                } else if (guess > Book_no) {
                    System.out.print("\nGuess lower!");
                    total_guesses += 1;
                } else if (guess == Book_no) {
                    total_guesses += 1;
                    System.out.print("\nYOU WON YAYY :)");
                    games_won++;
                    System.out.print("\nTotal games played :" + total_games);
                    System.out.print("\nTotal number of guesses:" + total_guesses);
                    System.out.print("\nTotal number of games won:" + games_won);
                    i = 0;
                    Book_no = randoms.nextInt(101);
                    break;
                }

                if (i == 10) {
                    System.out.print("\nGAME OVER (10 rounds per game)");
                    System.out.print("\nTotal gamess played :" + total_games);
                    System.out.print("\nTotal number of guesses:" + total_guesses);
                    System.out.print("\nTotal number of games won:" + games_won);
                    System.out.print("\nThe secret number was:" + Book_no);
                    Book_no = randoms.nextInt(101);
                    break;
                }
            }

            total_games++;
            System.out.print("\nDo you want to play another game:(0(no)/1(yes)) :");
            i = 0;
            asks = s.nextInt();

            if (asks == 0) {
                System.out.print("BYEE");
            } else if (asks == 1) {
                Book_no = randoms.nextInt(101);
            }
        } while (asks != 0);
    }

    public static void viewstats() {
        System.out.print("\n STATS ARE AS FOLLOWS:");
        System.out.print("\nTotal gamess played :" + total_games);
        System.out.print("\nTotal number of guesses:" + total_guesses);
        System.out.print("\nTotal number of games won:" + games_won);
    }

    public static void main(String[] args) {
        int main = 1;
        while (main == 1) {
            System.out.print("\nNIVRITI MUTHUVAIRAVAN (2024503005)");
            Scanner s = new Scanner(System.in);
            System.out.print("\n________GUESS GAME--MAIN MENU________");
            System.out.print("\n 1. PLAY Game");
            System.out.print("\n 2. View Status");
            System.out.print("\n 3. Quit");
            System.out.print("\n______________________________________");
            System.out.print("\n Enter your choice(1/2/3) :");

            int chs = s.nextInt();

            switch (chs) {
                case 1:
                    play_Game();
                    System.out.print("\nback to main?(1/0)");
                    main = s.nextInt();
                    break;

                case 2:
                    viewstats();
                    System.out.print("\nback to main?(1/0)");
                    main = s.nextInt();
                    break;

                case 3:
                    main = 0;
                    System.out.print(" BYEE");
                    break;

                default:
                    System.out.print("Enter correct option");
            }
        }
    }
}

