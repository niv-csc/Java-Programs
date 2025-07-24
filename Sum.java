import java.util.Scanner;
class Sum {
    public static void main(String[] args) {
        System.out.println("                 Nivriti Muthu Vairavan - 2024503005                 ");
        int a = 22, b = 12;
        int sum = a + b;
        System.out.println("sum=" + a); // This seems like it should be "sum=" + sum
        System.out.println("difference=" + (a - b));

        int d, c;
        Scanner sc = new Scanner(System.in);
        d = sc.nextInt();
        c = sc.nextInt();
        System.out.println("sum=" + (d + c));
    }
}