import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Go to Program? (Yes or No):");
            var action = scanner.nextLine().toUpperCase().trim();

            if (action.equals("YES")){
                System.out.println("Please, write speed of the car:");
                var speed = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Please, write hour to drive:");
                var time = scanner.nextInt();
                scanner.nextLine();

                System.out.println("The car will drive " + (speed * time) + " distance with speed " + speed + " and " + time + " hour");
            }
            else if (action.equals("NO")) {
                break;
            }
            else {
                System.out.println("Please, write correct answer");
            }
        }
        scanner.close();
    }
}