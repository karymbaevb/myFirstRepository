package kg.itacademy.fv21;

import java.util.Scanner;

public class Robot {
    public void greetingWithUser() {
        System.out.println("Hi, My name is Azamat. I'm robot. I have a some question about your.");
    }

    public String askHisName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String yourName = scanner.next();
        String greetingText = "Hi, " + yourName;
        System.out.println(greetingText);
        return yourName;
    }

    public int askHisAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int yourAge = scanner.nextInt();
        System.out.println("Your age " + yourAge + " is great!");
        return yourAge;
    }

    public String askHisHobby() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your hobby?");
        String yourHobby = scanner.next();
        System.out.println("Ohhh great. I like too " + yourHobby);
        return yourHobby;
    }

    public void showUserInfo(String name, int age, String hobby) {
        System.out.println("Summary:\n");
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Your hobby: " + hobby);
    }

    public void showUserInfo(UserInformation userInformation) {
        System.out.println("Summary:\n");
        System.out.println("Your name: " + userInformation.name);
        System.out.println("Your age: " + userInformation.age);
        System.out.println("Your hobby: " + userInformation.hobby);
    }
}
