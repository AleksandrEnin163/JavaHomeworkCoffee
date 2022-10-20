import java.util.Scanner;

public class CoffeeMaschine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите напиток (1-Эспрессо, 2-Американо, 3-Капучино, 4-Чай): ");
        int button = scanner.nextInt();
        scanner.close();
        CoffeeMethods c = new CoffeeMethods();
        switch (button) {
            case 1:
                System.out.println(c.getEspresso() + ". " + c.getDrinkReady());
                break;
            case 2:
                System.out.println(c.getEspresso() + ", " + c.getAddWater() + ". " + c.getDrinkReady());
                break;
            case 3:
                System.out.println(c.getEspresso() + ", " + c.getAddMilk() + ". " + c.getDrinkReady());
                break;
            case 4:
                System.out.println(c.getTeaBag() + ", " + c.getAddWater() + ". " + c.getDrinkReady());
                break;
            default:
                System.out.println("Выберите из существующих 4ех напитков");
        }
    }
}
