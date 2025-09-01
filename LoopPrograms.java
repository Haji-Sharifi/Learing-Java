import java.util.Scanner;

public class LoopPrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Print numbers from 1 to 100
        System.out.println("1. Numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 2. Print all even numbers between 2 and 200
        System.out.println("2. Even numbers from 2 to 200:");
        for (int i = 2; i <= 200; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 3. Print first 50 natural numbers in reverse order
        System.out.println("3. First 50 natural numbers in reverse:");
        for (int i = 50; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 4. Calculate sum of numbers from 1 to 100
        System.out.println("4. Sum of numbers 1 to 100:");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum + "\n");

        // 5. Multiplication table of 9
        System.out.println("5. Multiplication table of 9:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("9 x " + i + " = " + (9 * i));
        }
        System.out.println();

        // 6. Factorial of a given number
        System.out.println("6. Factorial of a number:");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial = " + fact + "\n");

        // 7. Prime numbers between 1 to 500
        System.out.println("7. Prime numbers between 1 and 500:");
        for (int n = 2; n <= 500; n++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(n + " ");
            }
        }
        System.out.println("\n");

        // 8. Reverse a number
        System.out.println("8. Reverse a number:");
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        int rev = 0, temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        System.out.println("Reversed = " + rev + "\n");

        // 9. Sum of digits
        System.out.println("9. Sum of digits:");
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        int sumDigits = 0;
        temp = num;
        while (temp != 0) {
            sumDigits += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits = " + sumDigits + "\n");

        // 10. Palindrome check
        System.out.println("10. Palindrome check:");
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        temp = num;
        rev = 0;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if (num == rev) {
            System.out.println(num + " is Palindrome\n");
        } else {
            System.out.println(num + " is Not Palindrome\n");
        }

        // 11. GCD of two numbers
        System.out.println("11. GCD of two numbers:");
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int x = a, y = b;
        while (y != 0) {
            int t = y;
            y = x % y;
            x = t;
        }
        System.out.println("GCD of " + a + " and " + b + " = " + x + "\n");

        // 12. Count divisors of a number
        System.out.println("12. Divisors of a number:");
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal divisors = " + count + "\n");

        // 13. Prime number check
        System.out.println("13. Prime number check:");
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        boolean isPrime = true;
        if (num <= 1) isPrime = false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(num + (isPrime ? " is Prime\n" : " is Not Prime\n"));

        // 14. Sum of even and odd numbers up to 500
        System.out.println("14. Sum of even and odd numbers up to 500:");
        int evenSum = 0, oddSum = 0;
        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0) evenSum += i;
            else oddSum += i;
        }
        System.out.println("Even Sum = " + evenSum);
        System.out.println("Odd Sum = " + oddSum + "\n");

        // 15. Extract all digits of a number
        System.out.println("15. Extract all digits of a number:");
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        System.out.println("Digits:");
        while (num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            num /= 10;
        }

        sc.close();
    }
}