import java.util.Scanner;

public class Calculator {
    public static int add(int x, int y) {return x + y;}
    public static int subtract(int x, int y) {return x - y;}
    public static int multiply(int x, int y) {return x * y;}
    public static int divide(int x, int y) {if (y==0){System.out.println("dont divide by 0");return 0;}return x / y;}

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1, add");
        System.out.println("2, sub");
        System.out.println("3, multiply");
        System.out.println("4, divide");
        int c = scanner.nextInt();
        System.out.println("Enter num1 ");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2 ");
        int num2 = scanner.nextInt();

        switch (c) {
            case 1 -> System.out.println("sum: " + add(num1, num2));
            case 2 -> System.out.println("difference: " + subtract(num1, num2));
            case 3 -> System.out.println("product: " + multiply(num1, num2));
            case 4 -> System.out.println("quotient: " + divide(num1, num2));
            default -> System.out.println("select something!");
        }
    }
}
