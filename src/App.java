
public class App {
    public static void main(String[] args) throws Exception {
        String name = "";
        System.out.println("What is your name?");
        name = System.console().readLine();
        System.out.println("Hello, " + name + "!");
        String name2 = "emmanuel stupid Macron";
        // get age
        int age = 0;
        System.out.println("How old are you?");
        age = Integer.parseInt(System.console().readLine());
        System.out.println("You are " + age + " years old.");
        if (age < 18) {
            System.out.println("You are not old enough to play.");
        } else {
            System.out.println("You are old enough to play.");
            System.out.println("What is your favorite number?");
            int favNum = Integer.parseInt(System.console().readLine());
            System.out.println("Your favorite number is " + favNum + ".");
            if (favNum % 2 == 0) {
                System.out.println("Your favorite number is even.");
            } else {
                System.out.println("Your favorite number is odd.");
            }
            if (favNum % 2 == 0 ) {
                System.out.println("Your favorite number is divisible by 2.");
                System.out.println("You win, " + name + "!");
                return;
            } else {
                System.out.println("Your favorite number is not divisible by 2.");
            }
            if (favNum % 3 == 0 ) {
                System.out.println("Your favorite number is divisible by 3.");
                System.out.println("You win, " + name + "!");
                return;
            } else {
                System.out.println("Your favorite number is not divisible by 3.");
                System.out.println("you are not a winner but a loser, "+ name2 + " AH AH AH !!!");
            }
        }
    }
}
