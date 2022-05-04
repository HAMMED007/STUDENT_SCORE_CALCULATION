package studentmark.home;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entry1= new Scanner(System.in);



        while (true){
            System.out.println("enter your name:");
            String name = entry1.nextLine();
            System.out.println("enter home_task1 score:");
            int homeTask1= entry1.nextInt();
            System.out.println("enter home_task2 score:");
            int homeTask2= entry1.nextInt();
            System.out.println("enter mid term test score:");
            int mid_test= entry1.nextInt();
            System.out.println("enter exam score:");
            int exam= entry1.nextInt();
            System.out.println();
            if (homeTask1<=10 && homeTask2<=10 && mid_test<=30 && exam<=50){
                System.out.println(name + " your score is " + (homeTask1+homeTask2+exam+mid_test));

                break;
            }
            else {
                System.out.println("That is not a valid  Please enter again");
                System.out.println("Home_task1 max 10----: home_task2 max 10---: test max 30--: exam max 50");
            }
        }
    }
}
