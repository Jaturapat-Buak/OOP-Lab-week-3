import java.util.Scanner;

public class dotdot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("กรุณากรอกความสูง: ");
        int height = scanner.nextInt();
        System.out.println(height);

        // Generate the pyramid pattern
        for (int i = 1; i <= height; i++) {
            System.out.println("#-#-#-#-#");
        }
        scanner.close();
    }
}
