package exc4;

import java.util.Scanner;

public class DemoGetStudentDetails {
    public static void main(String[] args) {
        // Variable to store student information
        String name;
        int age;
        float weight;
        // Scanner to get infor from key board (standard input)
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Student name: ");
        name = keyboard.nextLine();
        System.out.println("Student age: ");
        age = keyboard.nextInt();
        System.out.println("weight: ");
        weight = keyboard.nextFloat();

        // Show student information
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("weight: " + weight);

    }
}
