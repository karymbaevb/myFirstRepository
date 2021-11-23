package kg.itacademy.fv21;

import java.util.Scanner;

/**
 * Нам нужно написать программу, где робот вначале поздоровается с человеком
 * потом спросит о нем что нибудь и выведет всю информацию о пользователе на консоль
 *
 */
public class Main {

//    public static void main(String[] args) {
//        System.out.println("Hi. I'm robot. I have a some question about your.");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String yourName = scanner.next();
//        String greetingText = "Hi, " + yourName;
//        System.out.println(greetingText);
//
//        System.out.println("How old are you?");
//        int yourAge = scanner.nextInt();
//        System.out.println("Your age " + yourAge + " is great!");
//
//        System.out.println("What is your hobby?");
//        String yourHobby = scanner.next();
//        System.out.println("Ohhh great. I like too " + yourHobby);
//
//        System.out.println("Summary:\n");
//        System.out.println("Your name: " + yourName);
//        System.out.println("Your age: " + yourAge);
//        System.out.println("Your hobby: " + yourHobby);
//    }

    public static void main(String[] args) {
        greetingWithUser();
        String userName = askName();
        int userAge = askAge();
        String userHobby = askHobby();
        showUserInfo(userName, userAge, userHobby);
    }

    static void greetingWithUser() {
        System.out.println("Hi, My name is Azamat. I'm robot. I have a some question about your.");
    }

    static String askName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String yourName = scanner.next();
        String greetingText = "Hi, " + yourName;
        System.out.println(greetingText);
        return yourName;
    }

    static int askAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int yourAge = scanner.nextInt();
        System.out.println("Your age " + yourAge + " is great!");
        return yourAge;
    }

    static String askHobby() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your hobby?");
        String yourHobby = scanner.next();
        System.out.println("Ohhh great. I like too " + yourHobby);
        return yourHobby;
    }

    static void showUserInfo(String name, int age, String hobby) {
        System.out.println("Summary:\n");
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Your hobby: " + hobby);
    }
}
