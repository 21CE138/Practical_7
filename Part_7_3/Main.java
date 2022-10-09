package Part_7_3;

import java.util.ArrayList;

public class Main extends AccountHolder {

    public static void main(String[] args) {
        int count = 0;
        ArrayList a = new ArrayList<>();
        ArrayList<AccountHolder> personHolder = new ArrayList<AccountHolder>();
        for (int i = 1; i <= 5; i++) {
            personHolder.add(new AccountHolder());
        }

        // If you want user input, do it in the loop below
        for (AccountHolder p : personHolder) {
            p.info();
            if (p.age >= 21 && p.age <= 60 && p.inc >= 15000 && p.worke >= 1 && p.indian == true) {
                System.out.println("You are Eligible");
                System.out.println("Your Name is : " + p.name);
                count++;
                a.add(p.name);
            } else {
                System.out.println("You Are Not Eligible!!!");
            }
        }
        System.out.println("The Number of Eligible Candidates : " + count);
        System.out.println("The Number of Not Eligible Candidates : " + (5 - count));
        System.out.println("All Eligible Candidates Are : " + a);
        System.out.println("This Program is Created by 21CE138 Yuvrajsinh Solanki");
    }
}
