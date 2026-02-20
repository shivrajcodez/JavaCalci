import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1, num2;
        char operator;

        while (true) {
            System.out.println("Press 1: Run Program\nPress 0: Exit From Program");

            try {
                int key = sc.nextInt();

                if (key == 0) {
                    System.out.println("Exiting From Calculator Program......");
                    System.exit(0);
                } else if (key != 1) {
                    System.out.println("Enter Valid Key!!");
                    continue;
                }

                System.out.print("Enter First Number: ");
                num1 = sc.nextFloat();
                System.out.print("Enter Operator: + , - , * , / , % : ");
                operator = sc.next().charAt(0);
                System.out.print("Enter Second Number: ");
                num2 = sc.nextFloat();

                switch (operator) {
                    case '+':
                        System.out.println(num1 + "+" + num2 + " = " + (num1 + num2));
                        break;
                    case '-':
                        System.out.println(num1 + "-" + num2 + " = " + (num1 - num2));
                        break;
                    case '*':
                        System.out.println(num1 + "*" + num2 + " = " + (num1 * num2));
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("Error! Can't divide by Zero");
                        } else {
                            System.out.println(num1 + "/" + num2 + " = " + (num1 / num2));
                        }
                        break;
                    case '%':
                        System.out.println(num1 + "%" + num2 + " = " + (num1 % num2));
                        break;
                    default:
                        System.out.println("Enter Valid Operator!!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input!!");
                sc.nextLine();  // Consume the newline character
            }
        }
    }
}
