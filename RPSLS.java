import java.util.Random;
import java.util.Scanner;

/**
 * Created by Micah on 10/26/17.
 */
public class RPSLS {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper Scissors Lizard Spock\n");
        System.out.println("The rule is simple\n");

        while (true) {

            System.out.println("Scissors cuts Paper\n" +
                    "Paper covers Rock\n" +
                    "Rock crushes Lizard\n" +
                    "Lizard poisons Spock\n" +
                    "Spock smashes Scissors\n" +
                    "Scissors decapitates Lizard\n" +
                    "Lizard eats Paper\n" +
                    "Paper disproves Spock\n" +
                    "Spock vaporizes Rock\n" +
                    "And as it always has, Rock crushes Scissors");

            System.out.println("Now do you understand? (y/n)");

            Scanner s = new Scanner(System.in);
            String flag = s.nextLine().toLowerCase();

            if (flag.equals("y")) {
                break;
            }

        }

        while (true) {
            System.out.println("Make your decision now.");
            Scanner s = new Scanner(System.in);
            String input = s.nextLine();
            //String bianxiao = input;
            String decision = input.toLowerCase();

            Random r = new Random();
            String cpu = "";
            int result = r.nextInt(4);

            switch (result) {
                case 0:
                    cpu = "Rock";
                    break;
                case 1:
                    cpu = "Scissors";
                    break;
                case 2:
                    cpu = "Paper";
                    break;
                case 4:
                    cpu = "Lizard";
                    break;
                case 5:
                    cpu = "Spock";
            }
            if (decision.equals("paper") || decision.equals("rock") || decision.equals("scissors") || decision.equals("lizard") || decision.equals("paper") || decision.equals("spock")){
                if (decision.equals("rock") && (cpu.equals("Paper") || cpu.equals("Spock"))) {
                    System.out.format("Your Decision is: %s\nComputer's decision is: %s\n", input, cpu);
                    System.out.println("You lost\n");
                }

                if (decision.equals("rock") && (cpu.equals("Lizard") || cpu.equals("Scissors"))) {
                    System.out.format("Your Decision is: %s\nComputer's decision is: %s\n", input, cpu);
                    System.out.println("You won\n");
                }

                if (decision.equals("paper") && (cpu.equals("Scissors") || cpu.equals("Lizard"))) {
                    System.out.format("Your Decision is: %s\nComputer's decision is: %s\n", input, cpu);
                    System.out.println("You lost\n");
                }

                if (decision.equals("paper") && (cpu.equals("Rock") || cpu.equals("Spock"))) {
                    System.out.format("Your Decision is: %s\nComputer's decision is: %s\n", input, cpu);
                    System.out.println("You won\n");
                }

                if (decision.equals("lizard") && (cpu.equals("Rock") || cpu.equals("Scissors"))) {
                    System.out.format("Your Decision is: %s\nComputer's decision is: %s\n", input, cpu);
                    System.out.println("You lost\n");
                }

                if (decision.equals("lizard") && (cpu.equals("Spock") || cpu.equals("Paper"))) {
                    System.out.format("Your Decision is: %s\nComputer's decision is: %s\n", input, cpu);
                    System.out.println("You won\n");
                }

                if (decision.equals("spock") && (cpu.equals("Lizard") || cpu.equals("Paper"))) {
                    System.out.format("Your Decision is: %s\nComputer's decision is: %s\n", input, cpu);
                    System.out.println("You lost\n");
                }

                if (decision.equals("spock") && (cpu.equals("Scissors") || cpu.equals("Rock"))) {
                    System.out.format("Your Decision is: %s\nComputer's decision is: %s\n", input, cpu);
                    System.out.println("You won\n");
                }

                if (decision.equals("scissors") && (cpu.equals("Spock") || cpu.equals("Rock"))) {
                    System.out.format("Your Decision is: %s\nComputer's decision is: %s\n", input, cpu);
                    System.out.println("You lost\n");
                }

                if (decision.equals("scissors") && (cpu.equals("Paper") || cpu.equals("Lizard"))) {
                    System.out.format("Your Decision is: %s\nComputer's decision is: %s\n", input, cpu);
                    System.out.println("You won\n");
                }


                System.out.println("Wanna have another round? (y/n)");
                String flag = s.nextLine().toLowerCase();

                if (flag.equals("n")) {
                    System.out.println("Okay bye. Live long and prosper. ");
                    break;
                }


            } else {

                System.out.println("Invalid input, pleas try again.");

            }




        }
    }
}
