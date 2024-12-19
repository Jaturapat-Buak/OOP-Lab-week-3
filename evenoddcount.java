import java.util.*;
public class evenoddcount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oddcount = 0 ;
        int evencount = 0 ;
        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            if (number % 2 == 0) {
                evencount += 1;
            } else {
                oddcount += 1;
            }
        }
        System.out.println("Odd number = " + oddcount + " and Even number = " + evencount);
    }
}
