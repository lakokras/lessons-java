import java.util.Scanner;

public class Switch {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = scanner.nextInt();
        switch (age) {
            case 0:
                System.out.println("Ты только родился :)");
                break;
            case 7:
                System.out.println("Ты только пошел в школу, удачи!");
                break;
            case 18:
                System.out.println("Добро пожаловать во взрослую жизнь :)");
                break;
            default:
                System.out.println("Интересно, сколько тебе на самом деле");
        }
    }
}
