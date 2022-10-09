package Part_7_3;
import java.util.*;

public class AccountHolder {
        Scanner sc = new Scanner(System.in);
        String name;
        int age ,worke;
        double inc;
        boolean indian;
        void info() {
            System.out.println("Enter Your Name : ");
            name = sc.next();
            System.out.println("Enter Your Age : ");
            age = sc.nextInt();
            System.out.println("Enter Your Net Monthly Income : ");
            inc = sc.nextDouble();
            System.out.println("Enter Your Work Experience : ");
            worke = sc.nextInt();
            System.out.println("Enter Your Citizenship ? (For Indian true otherwise false) :- ");
            indian = sc.nextBoolean();
        }
    }

