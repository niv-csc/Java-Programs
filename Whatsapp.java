import java.util.*;

class Whatsapp {
    private String[][] chat_history;
    private String[] senders;
    private String[] receivers;
    private int ask;
    private int n;

    Whatsapp(int n, int ask) {
        this.n = n;
        this.ask = ask;
        senders = new String[n];
        receivers = new String[n];
        chat_history = new String[n][n];
    }

    public void chat() {
        if (ask == 1) {
            Scanner s = new Scanner(System.in);
            for (int i = 0; i < n; i++) {
                System.out.print("\nEnter senders name: ");
                senders[i] = s.nextLine();
                System.out.print("Enter receivers name: ");
                receivers[i] = s.nextLine();
                System.out.println("Enter messages to " + receivers[i] + ":");
                for (int j = 0; j < n; j++) {
                    System.out.print("Message " + (j + 1) + ": ");
                    chat_history[i][j] = s.nextLine();
                }
            }
        }
    }

    public void respond() {
        Scanner s = new Scanner(System.in);
        System.out.print("\nDo you want to respond to the messages? (1 for yes / 0 for no): ");
        int responseChoice = s.nextInt();
        s.nextLine(); // clear buffer

        if (responseChoice == 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println("\nMessage from " + senders[i] + " to " + receivers[i] + ": " + chat_history[i][j]);
                    System.out.print("Enter your response: ");
                    String response = s.nextLine();
                    chat_history[i][j] += "\nResponse: " + response;
                }
            }

            System.out.println("\n--- Updated Chat History ---");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println("Conversation with " + receivers[i] + ": " + chat_history[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of messages you want to send: ");
        int numMessages = s.nextInt();
        s.nextLine(); // consume newline
        System.out.print("Do you want to send messages? (1 for yes / 0 for no): ");
        int ask = s.nextInt();
        s.nextLine(); // consume newline

        Whatsapp w = new Whatsapp(numMessages, ask);
        w.chat();
        w.respond();
    }
}