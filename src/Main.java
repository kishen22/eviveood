import java.util.Scanner;

public class Main {
    public static String userOrder = "";
    private static Breakfast breakfast;
    private static Lunch lunch;
    private static Dinner dinner;
    public static Scanner scan = new Scanner(System.in); //user input


    public static void main(String[] args){
        //setting objects for orders placed
        breakfast = new Breakfast();
        lunch = new Lunch();
        dinner = new Dinner();

        //user orders until they type Quit
        while (true){
            System.out.println("Hello, what meal and items would you like today? (Enter Quit to exit)");
            userOrder = scan.nextLine();
            char first = userOrder.charAt(0);
            if (first == 'B'){
                System.out.print(breakfast.getOrder(userOrder));
            }
            else if (first == 'L'){
                System.out.print(lunch.getOrder(userOrder));
            }
            else if (first == 'D'){
                System.out.print(dinner.getOrder(userOrder));
            }
            else if (first == 'Q'){
                break;
            }
            System.out.println('\n');
        }
    }
}
