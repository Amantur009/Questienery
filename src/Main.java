

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Ala-Too Intrnational University!");
        System.out.println("Write your Last Name?");
        String LastName = scanner.next();
        System.out.println("Write your First Name?");
        String FirstName = scanner.next();
        System.out.println("Do you have the presence of a school education certificate? ");
        showmenu();
        int choise = scanner.nextInt();
        if (choise == 0) {
            System.out.println("Unfortunately, you can not enter the Ala-Too International University");
            System.exit(0);
        }

        System.out.println("Write your ORT score?");
        int ORTscore = scanner.nextInt();
        if (ORTscore < 110) {
            System.out.println("Unfortunately, you can not enter the Ala-Too International University");
            System.exit(0);
        }

        System.out.println("English language level B1/Intermediate or higher: ");
        showEnglishLevel();
        int EnglishLevel = scanner.nextInt();
        if (EnglishLevel < 2) {
            System.out.println("Your English level is less than Pre Intermediate.That is why you should study a one-year preparatory English language course (Foundation Course AIU) at the university. ");
            System.exit(0);
        }

        showSpecialties();
        System.out.println("Choose one of specialties.");
        int choice = scanner.nextInt();
        String specialties;
        short Tuition;
        if (choice == 1) {
            specialties = "Computer Engineering";
            Tuition = 2500;
        } else if (choice == 2) {
            specialties = "Artificial Intelligence";
            Tuition = 2200;
        } else if (choice == 3) {
            specialties = "Psychology";
            Tuition = 1900;
        } else if (choice == 4) {
            specialties = "Journalism";
            Tuition = 1700;
        } else if (choice == 5) {
            specialties = "International Relations";
            Tuition = 2200;
        } else if (choice == 6) {
            specialties = "Law";
            Tuition = 1800;
        } else if (choice == 7) {
            specialties = "Management";
            Tuition = 2200;
        } else {
            specialties = "Medicine";
            Tuition = 3300;
        }

        System.out.println(" Ala-Too has the following discount system depending on the ORT score: ");
        showDiscount();
        double discount = 0.0;
        if (ORTscore >= 219 && ORTscore < 240) {
            discount = 1.0;
        } else if (ORTscore >= 210 && ORTscore <= 218) {
            discount = 0.75;
        } else if (ORTscore >= 200 && ORTscore <= 209) {
            discount = 0.5;
        } else if (ORTscore >= 175 && ORTscore <= 199) {
            discount = 0.25;
        } else if (ORTscore >= 156 && ORTscore <= 174) {
            discount = 0.1;
        } else if (ORTscore >= 140 && ORTscore <= 155) {
            discount = 0.05;
        }

        double discountTuition = (double)Tuition - (double)Tuition * discount;
        if (discount > 0.0) {
            System.out.println("Dear " + FirstName + " " + LastName + " we congratulate you! You have been admitted to the " + specialties + " program at Ala-Too International University. The cost of your tuition with a " + (int)(discount * 100.0) + " % discount will be " + discountTuition + " $ per a year");
        } else {
            System.out.println("Dear" + FirstName + " " + LastName + " we congratulate you! You have been admitted to the " + specialties + " program at Ala-Too International University. The cost of your tuition with a 0% discount will be " + Tuition + " per a year");
        }

    }

    public static void showmenu() {
        System.out.println(" 1 is available.");
        System.out.println(" 0 is not available");
    }

    public static void showEnglishLevel() {
        System.out.println("1-Beginner");
        System.out.println("2-Elementary");
        System.out.println("3-Pre Intermediate");
        System.out.println("4-Intermediate");
        System.out.println("5-Upper Intermediate");
        System.out.println("6-Advanced");
    }

    public static void showSpecialties() {
        System.out.println("1-Computer Engineering (2500$)");
        System.out.println("2-Artificial Intelligence (2200$)");
        System.out.println("3-Psychology (1900$)");
        System.out.println("4-Journalism (1700$)");
        System.out.println("5-International Relations (2200$)");
        System.out.println("6-Law (1800$)");
        System.out.println("7-Management (2200$)");
        System.out.println("8-Medicine (3300$)");
    }

    public static void showDiscount() {
        System.out.println("140-155: 5%");
        System.out.println("156-174: 10%");
        System.out.println("175-199: 25%");
        System.out.println("200-209: 50%");
        System.out.println("210-218: 75%");
        System.out.println("219-240: 100%");
    }

    public void get() {
        System.out.println("Hello");
    }
}



