package BlueThink;
import java.util.Scanner;
public class Bluethink {


    public static void main(String[] args) {
        while (true) {
            try {

                Scanner sc = new Scanner(System.in);
                System.out.println("Which department you want to go ?");
                System.out.println("Enter 1 for HR Department ");
                System.out.println("Enter 2 for java Department ");
                System.out.println("Enter 3 for Python Department ");
                System.out.println("Enter 4 for Dynamic Department ");
                System.out.println("Enter 5 for Magento Department ");
                System.out.println("Enter 0 for exit ");

                if (!sc.hasNextInt()) {
                    System.out.println("Input only integer value please!");
                    return;
                }
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("====================");

                        System.out.println("What you want? \nPress 1 to meet Neha \nPress 2 to meet Shalini");
                        int a = sc.nextInt();
                        sc.nextLine();

                        if (a == 1) {
                            System.out.println("What do you want to ask Neha Mam\n Your question about salary or education");
                            String question = sc.nextLine();

                            if (question.contains("salary")) {
                                System.out.println("Your salary is above 10,000");
                            } else if (question.contains("education") || question.contains("skill")) {
                                System.out.println("I have done BCA");
                            }

                        } else if (a == 2) {
                            System.out.println("What do you want to ask Pratiksha Mam\nQ:");
                            String question = sc.nextLine();
                            if (question.contains(" manager")) {
                                System.out.println("Your manager is Rahul Sir");
                            } else if (question.contains("hours ") || question.contains("timing ")) {
                                System.out.println("your working timing is 11am to 8pm");
                            }
                        } else {
                            System.out.println("Invalid choice.");
                        }

                        System.out.println("====================");

                        break;


                    case 2:

                        System.out.println("====================");

                        System.out.println("What you want? \nPress 1 to Rahul Sir \nPress 2 to Harikesh Sir");
                        int b = sc.nextInt();
                        sc.nextLine();

                        if (b == 1) {
                            System.out.println("You want to meet Rahul Sir \nYour Question meething or project ");
                            String question = sc.nextLine();

                            if (question.contains("project")) {
                                System.out.println("Your work is to make a Student Management System");
                            } else if (question.contains("meeting ")) {
                                System.out.println("Your meeting is in the evening at 5:30 o'clock");
                            } else {
                                System.out.println("Please provide a valid question.");
                            }

                        } else if (b == 2) {
                            System.out.println("You want to meet Harikesh Sir \nYour Question employee ");
                            String question = sc.nextLine();

                            if (question.contains("employee")) {
                                System.out.println("there is 25 employee work in java ");

                            }

                        } else {
                            System.out.println("Invalid choice");
                        }

                        break;

                    case 3:

                        System.out.println("====================");

                        System.out.println("What you want? \nPress 1 to Raju Sir \nPress 2 to Ramesh Sir");
                        int c = sc.nextInt();
                        sc.nextLine();

                        if (c == 1) {
                            System.out.println("You want to meet Raju Sir \nYour Question python or project ");

                            String question = sc.nextLine();

                            if (question.contains("python")) {
                                System.out.println("Your work is to make a Student Management System");
                            } else if (question.contains("meeting ")) {
                                System.out.println("Your meeting is in the evening at 5:30 o'clock");
                            } else {
                                System.out.println("Please provide a valid question.");
                            }

                        } else if (c == 2) {
                            System.out.println("you want to meet Ramesh  sir");
                            System.out.println("====================");

                            break;
                        }
                    case 4:

                        System.out.println("====================");

                        System.out.println("what you want press 1  meet Ramesh sir or 2 meet Laxman sir");
                        int d = sc.nextInt();
                        if (d == 1) {
                            System.out.println("you want to meet Ramesh sir");
                        } else if (d == 2) {
                            System.out.println("you want to meet Laxman sir");
                            System.out.println("====================");

                            break;
                        }
                    case 5:

                        System.out.println("====================");

                        System.out.println("what you want press 1  meet Hritik sir or 2 meet Varun sir");
                        int e = sc.nextInt();
                        if (e == 1) {
                            System.out.println("you want to meet Hritik sir");
                        } else if (e == 2) {
                            System.out.println("you want to meet Varun sir");
                            System.out.println("====================");

                            break;
                        }
                    case 0:
                        System.exit(0);
                        break;

                    default:
                        System.out.println(" Invalid department number..");

                }

            } catch (Exception e) {

                System.out.println("Please enter a numeric value ");

            }

        }
    }
}


