import java.util.Scanner;

public class Gym_Membership {
    String name;
    int age, membership_duration, fee = 1000;
    boolean membership_status;
    double membership_fees;

    public void setDetails(String name, int age, int membership_duration, boolean membership_status) {
        this.name = name;
        this.age = age;
        this.membership_duration = membership_duration;
        this.membership_status = membership_status;
        this.membership_fees = membership_duration * fee;
    }

    public void getDetails() {
        System.out.println("Member Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Membership Duration (in months): " + membership_duration);
        System.out.println("Membership Active: " + membership_status);
        System.out.println("Membership Fees: $" + membership_fees);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gym_Membership member = new Gym_Membership();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter membership duration (in months): ");
        int membership_duration = scanner.nextInt();
        System.out.print("Is the membership active? (true/false): ");
        boolean membership_status = scanner.nextBoolean();

        member.setDetails(name, age, membership_duration, membership_status);
        System.out.println();
        System.out.println("----- Membership Details -----");
        System.out.println();
        member.getDetails();

        scanner.close();
    }
}

/*
Output:

Enter name: Om Makadia
Enter age: 19
Enter membership duration (in months): 10
Is the membership active? (true/false): true

----- Membership Details -----

Member Name: Om Makadia
Age: 19
Membership Duration (in months): 10
Membership Active: true
Membership Fees: $10000.0
 */