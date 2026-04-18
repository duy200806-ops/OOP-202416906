import java.util.Scanner;

public class Ex4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        int month;

        while (true) {
            System.out.print("Enter year (>=0): ");
            year = sc.nextInt();
            if (year >= 0) break;
            System.out.println("Invalid year, try again!");
        }

        while (true) {
            System.out.print("Enter month (1-12): ");
            month = sc.nextInt();
            if (month >= 1 && month <= 12) break;
            System.out.println("Invalid month, try again!");
        }

        int days;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31; break;
            case 4: case 6: case 9: case 11:
                days = 30; break;
            case 2:
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                days = 0;
        }

        System.out.println("Month " + month + " of year " + year + " has " + days + " days.");
        sc.close();
    }
}
