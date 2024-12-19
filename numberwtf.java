import java.util.*;
public class numberwtf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int count = scanner.nextInt();
        for (int i = 1; i < (count + 1); i++) {
            if (i % 5 == 0) {
                System.out.print("/");
            } else {
                System.out.print("|");
            }
        }
    }
}
