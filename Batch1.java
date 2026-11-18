import java.util.Scanner;

/*
 * Batch 1 - Java Fundamentals & Programming Basics
 * File name: Batch1.java
 *
 * Run:
 *   javac Batch1.java
 *   java Batch1
 *
 * Enter a question number from 1 to 50.
 * Each question runs as a separate practical inside this single class.
 */
public class Batch1 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Question Number (1-50): ");
        int q = sc.nextInt();

        switch (q) {
            case 1: q01(); break;
            case 2: q02(); break;
            case 3: q03(); break;
            case 4: q04(); break;
            case 5: q05(); break;
            case 6: q06(); break;
            case 7: q07(); break;
            case 8: q08(); break;
            case 9: q09(); break;
            case 10: q10(); break;
            case 11: q11(); break;
            case 12: q12(); break;
            case 13: q13(); break;
            case 14: q14(); break;
            case 15: q15(); break;
            case 16: q16(); break;
            case 17: q17(); break;
            case 18: q18(); break;
            case 19: q19(); break;
            case 20: q20(); break;
            case 21: q21(); break;
            case 22: q22(); break;
            case 23: q23(); break;
            case 24: q24(); break;
            case 25: q25(); break;
            case 26: q26(); break;
            case 27: q27(); break;
            case 28: q28(); break;
            case 29: q29(); break;
            case 30: q30(); break;
            case 31: q31(); break;
            case 32: q32(); break;
            case 33: q33(); break;
            case 34: q34(); break;
            case 35: q35(); break;
            case 36: q36(); break;
            case 37: q37(); break;
            case 38: q38(); break;
            case 39: q39(); break;
            case 40: q40(); break;
            case 41: q41(); break;
            case 42: q42(); break;
            case 43: q43(); break;
            case 44: q44(); break;
            case 45: q45(); break;
            case 46: q46(); break;
            case 47: q47(); break;
            case 48: q48(); break;
            case 49: q49(); break;
            case 50: q50(); break;
            default: System.out.println("Invalid question number.");
        }
        sc.close();
    }

    // Q1. Print Hello World.
    // Input: none | Output: Hello World
    static void q01() { System.out.println("Hello World"); }

    // Q2. Print your name.
    // Input: Dinesh | Output: My name is Dinesh
    static void q02() {
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.println("My name is " + name);
    }

    // Q3. Add two integers.
    // Input: 10 20 | Output: Sum = 30
    static void q03() {
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Sum = " + (a + b));
    }

    // Q4. Subtract two integers.
    // Input: 20 8 | Output: Difference = 12
    static void q04() {
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Difference = " + (a - b));
    }

    // Q5. Multiply two integers.
    // Input: 6 7 | Output: Product = 42
    static void q05() {
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Product = " + (a * b));
    }

    // Q6. Divide two numbers.
    // Input: 20 4 | Output: Quotient = 5.0
    static void q06() {
        double a = sc.nextDouble(), b = sc.nextDouble();
        if (b == 0) System.out.println("Cannot divide by zero");
        else System.out.println("Quotient = " + (a / b));
    }

    // Q7. Find remainder.
    // Input: 17 5 | Output: Remainder = 2
    static void q07() {
        int a = sc.nextInt(), b = sc.nextInt();
        if (b == 0) System.out.println("Cannot find remainder with zero divisor");
        else System.out.println("Remainder = " + (a % b));
    }

    // Q8. Swap two numbers using a temporary variable.
    // Input: 10 20 | Output: a = 20, b = 10
    static void q08() {
        int a = sc.nextInt(), b = sc.nextInt();
        int temp = a; a = b; b = temp;
        System.out.println("a = " + a + ", b = " + b);
    }

    // Q9. Swap two numbers without a temporary variable.
    // Input: 10 20 | Output: a = 20, b = 10
    static void q09() {
        int a = sc.nextInt(), b = sc.nextInt();
        a = a + b; b = a - b; a = a - b;
        System.out.println("a = " + a + ", b = " + b);
    }

    // Q10. Find square and cube of a number.
    // Input: 3 | Output: Square = 9, Cube = 27
    static void q10() {
        int n = sc.nextInt();
        System.out.println("Square = " + (n * n));
        System.out.println("Cube = " + (n * n * n));
    }

    // Q11. Calculate simple interest.
    // Input: principal=1000 rate=5 time=2 | Output: Simple Interest = 100.0
    static void q11() {
        double p = sc.nextDouble(), r = sc.nextDouble(), t = sc.nextDouble();
        System.out.println("Simple Interest = " + (p * r * t / 100));
    }

    // Q12. Convert Celsius to Fahrenheit.
    // Input: 25 | Output: Fahrenheit = 77.0
    static void q12() {
        double c = sc.nextDouble();
        System.out.println("Fahrenheit = " + (c * 9 / 5 + 32));
    }

    // Q13. Convert Fahrenheit to Celsius.
    // Input: 98.6 | Output: Celsius = 37.0
    static void q13() {
        double f = sc.nextDouble();
        System.out.println("Celsius = " + ((f - 32) * 5 / 9));
    }

    // Q14. Calculate area of a rectangle.
    // Input: 5 4 | Output: Area = 20
    static void q14() {
        double length = sc.nextDouble(), width = sc.nextDouble();
        System.out.println("Area = " + (length * width));
    }

    // Q15. Calculate perimeter of a rectangle.
    // Input: 5 4 | Output: Perimeter = 18
    static void q15() {
        double length = sc.nextDouble(), width = sc.nextDouble();
        System.out.println("Perimeter = " + (2 * (length + width)));
    }

    // Q16. Calculate area of a circle.
    // Input: 7 | Output: Area = 153.938...
    static void q16() {
        double radius = sc.nextDouble();
        System.out.println("Area = " + (Math.PI * radius * radius));
    }

    // Q17. Calculate circumference of a circle.
    // Input: 7 | Output: Circumference = 43.982...
    static void q17() {
        double radius = sc.nextDouble();
        System.out.println("Circumference = " + (2 * Math.PI * radius));
    }

    // Q18. Convert kilometers to meters.
    // Input: 2.5 | Output: Meters = 2500.0
    static void q18() {
        double km = sc.nextDouble();
        System.out.println("Meters = " + (km * 1000));
    }

    // Q19. Convert days into years, weeks and days (365-day year).
    // Input: 400 | Output: Years=1, Weeks=5, Days=5
    static void q19() {
        int total = sc.nextInt();
        int years = total / 365;
        int rem = total % 365;
        int weeks = rem / 7;
        int days = rem % 7;
        System.out.println("Years = " + years + ", Weeks = " + weeks + ", Days = " + days);
    }

    // Q20. Calculate average of three numbers.
    // Input: 10 20 30 | Output: Average = 20.0
    static void q20() {
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        System.out.println("Average = " + ((a + b + c) / 3));
    }

    // Q21. Check whether a number is even or odd.
    // Input: 7 | Output: Odd
    static void q21() {
        int n = sc.nextInt();
        System.out.println(n % 2 == 0 ? "Even" : "Odd");
    }

    // Q22. Check whether a number is positive, negative or zero.
    // Input: -5 | Output: Negative
    static void q22() {
        int n = sc.nextInt();
        if (n > 0) System.out.println("Positive");
        else if (n < 0) System.out.println("Negative");
        else System.out.println("Zero");
    }

    // Q23. Find the greater of two numbers.
    // Input: 12 9 | Output: Greater = 12
    static void q23() {
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Greater = " + Math.max(a, b));
    }

    // Q24. Find the greatest of three numbers.
    // Input: 10 25 15 | Output: Greatest = 25
    static void q24() {
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("Greatest = " + Math.max(a, Math.max(b, c)));
    }

    // Q25. Check whether a year is a leap year.
    // Input: 2024 | Output: Leap Year
    static void q25() {
        int year = sc.nextInt();
        boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        System.out.println(leap ? "Leap Year" : "Not a Leap Year");
    }

    // Q26. Check voting eligibility (age 18 or above).
    // Input: 20 | Output: Eligible to vote
    static void q26() {
        int age = sc.nextInt();
        System.out.println(age >= 18 ? "Eligible to vote" : "Not eligible to vote");
    }

    // Q27. Check whether a character is a vowel or consonant.
    // Input: e | Output: Vowel
    static void q27() {
        char ch = Character.toLowerCase(sc.next().charAt(0));
        if (ch < 'a' || ch > 'z') System.out.println("Not an English alphabet");
        else System.out.println("aeiou".indexOf(ch) >= 0 ? "Vowel" : "Consonant");
    }

    // Q28. Check whether a character is an alphabet, digit or special character.
    // Input: # | Output: Special Character
    static void q28() {
        char ch = sc.next().charAt(0);
        if (Character.isLetter(ch)) System.out.println("Alphabet");
        else if (Character.isDigit(ch)) System.out.println("Digit");
        else System.out.println("Special Character");
    }

    // Q29. Check whether a number is divisible by both 5 and 11.
    // Input: 55 | Output: Divisible by both 5 and 11
    static void q29() {
        int n = sc.nextInt();
        System.out.println(n % 5 == 0 && n % 11 == 0
                ? "Divisible by both 5 and 11" : "Not divisible by both 5 and 11");
    }

    // Q30. Calculate grade from marks (90 A+, 80 A, 70 B, 60 C, 40 D, else F).
    // Input: 85 | Output: Grade = A
    static void q30() {
        int marks = sc.nextInt();
        if (marks < 0 || marks > 100) System.out.println("Invalid marks");
        else if (marks >= 90) System.out.println("Grade = A+");
        else if (marks >= 80) System.out.println("Grade = A");
        else if (marks >= 70) System.out.println("Grade = B");
        else if (marks >= 60) System.out.println("Grade = C");
        else if (marks >= 40) System.out.println("Grade = D");
        else System.out.println("Grade = F");
    }

    // Q31. Print numbers from 1 to N.
    // Input: 5 | Output: 1 2 3 4 5
    static void q31() {
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) System.out.print(i + " ");
        System.out.println();
    }

    // Q32. Print numbers from N to 1.
    // Input: 5 | Output: 5 4 3 2 1
    static void q32() {
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) System.out.print(i + " ");
        System.out.println();
    }

    // Q33. Find sum of first N natural numbers.
    // Input: 5 | Output: Sum = 15
    static void q33() {
        int n = sc.nextInt();
        long sum = (long) n * (n + 1) / 2;
        System.out.println("Sum = " + sum);
    }

    // Q34. Print multiplication table of a number.
    // Input: 5 | Output: 5 x 1 = 5 ... 5 x 10 = 50
    static void q34() {
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + (n * i));
    }

    // Q35. Find factorial of a number.
    // Input: 5 | Output: Factorial = 120
    static void q35() {
        int n = sc.nextInt();
        if (n < 0) { System.out.println("Factorial is not defined for negative numbers"); return; }
        long fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        System.out.println("Factorial = " + fact);
    }

    // Q36. Count digits in an integer.
    // Input: 58320 | Output: Digit Count = 5
    static void q36() {
        long n = sc.nextLong();
        n = Math.abs(n);
        int count = (n == 0) ? 1 : 0;
        while (n > 0) { count++; n /= 10; }
        System.out.println("Digit Count = " + count);
    }

    // Q37. Find sum of digits of an integer.
    // Input: 583 | Output: Sum of Digits = 16
    static void q37() {
        long n = Math.abs(sc.nextLong());
        int sum = 0;
        while (n > 0) { sum += n % 10; n /= 10; }
        System.out.println("Sum of Digits = " + sum);
    }

    // Q38. Reverse an integer.
    // Input: 1234 | Output: Reverse = 4321
    static void q38() {
        long n = sc.nextLong(), value = Math.abs(n), rev = 0;
        while (value > 0) { rev = rev * 10 + value % 10; value /= 10; }
        System.out.println("Reverse = " + (n < 0 ? -rev : rev));
    }

    // Q39. Check whether a number is a palindrome.
    // Input: 121 | Output: Palindrome
    static void q39() {
        long n = sc.nextLong(), value = Math.abs(n), temp = value, rev = 0;
        while (temp > 0) { rev = rev * 10 + temp % 10; temp /= 10; }
        System.out.println(value == rev ? "Palindrome" : "Not a Palindrome");
    }

    // Q40. Check whether a number is an Armstrong number (three-digit definition).
    // Input: 153 | Output: Armstrong Number
    static void q40() {
        int n = sc.nextInt();
        int temp = n, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        System.out.println(n >= 0 && sum == n ? "Armstrong Number" : "Not an Armstrong Number");
    }

    // Q41. Read and display an integer.
    // Input: 25 | Output: You entered: 25
    static void q41() {
        int n = sc.nextInt();
        System.out.println("You entered: " + n);
    }

    // Q42. Read and display a decimal number.
    // Input: 12.5 | Output: You entered: 12.5
    static void q42() {
        double n = sc.nextDouble();
        System.out.println("You entered: " + n);
    }

    // Q43. Read and display a character.
    // Input: J | Output: You entered: J
    static void q43() {
        char ch = sc.next().charAt(0);
        System.out.println("You entered: " + ch);
    }

    // Q44. Read and display a full name (one line).
    // Input: Dinesh Gaikwad | Output: Name: Dinesh Gaikwad
    static void q44() {
        sc.nextLine(); // consume pending newline after question number
        String name = sc.nextLine();
        System.out.println("Name: " + name);
    }

    // Q45. Calculate total and percentage of five subjects.
    // Input: 80 70 90 60 100 | Output: Total=400, Percentage=80.0
    static void q45() {
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int d = sc.nextInt(), e = sc.nextInt();
        int total = a + b + c + d + e;
        System.out.println("Total = " + total);
        System.out.println("Percentage = " + (total / 5.0));
    }

    // Q46. Calculate electricity bill: first 100 units at 1.5, next 100 at 2.5, above 200 at 4.
    // Input: 250 | Output: Bill = 550.0
    static void q46() {
        int units = sc.nextInt();
        double bill;
        if (units < 0) { System.out.println("Invalid units"); return; }
        if (units <= 100) bill = units * 1.5;
        else if (units <= 200) bill = 100 * 1.5 + (units - 100) * 2.5;
        else bill = 100 * 1.5 + 100 * 2.5 + (units - 200) * 4.0;
        System.out.println("Bill = " + bill);
    }

    // Q47. Create a basic two-number calculator using an operator.
    // Input: 10 5 + | Output: Result = 15
    static void q47() {
        double a = sc.nextDouble(), b = sc.nextDouble();
        char op = sc.next().charAt(0);
        switch (op) {
            case '+': System.out.println("Result = " + (a + b)); break;
            case '-': System.out.println("Result = " + (a - b)); break;
            case '*': System.out.println("Result = " + (a * b)); break;
            case '/':
                if (b == 0) System.out.println("Cannot divide by zero");
                else System.out.println("Result = " + (a / b));
                break;
            case '%':
                if (b == 0) System.out.println("Cannot find remainder with zero divisor");
                else System.out.println("Result = " + (a % b));
                break;
            default: System.out.println("Invalid operator");
        }
    }

    // Q48. Calculate discount and final price (10% discount).
    // Input: 1000 | Output: Discount=100.0, Final Price=900.0
    static void q48() {
        double price = sc.nextDouble();
        double discount = price * 0.10;
        System.out.println("Discount = " + discount);
        System.out.println("Final Price = " + (price - discount));
    }

    // Q49. Generate a student result summary.
    // Input: name=Ravi, marks=75 80 65 | Output: Total=220, Percentage=73.33..., Result=Pass
    static void q49() {
        System.out.print("Enter student name: ");
        String name = sc.next();
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int total = a + b + c;
        double percentage = total / 3.0;
        System.out.println("Student = " + name);
        System.out.println("Total = " + total);
        System.out.println("Percentage = " + percentage);
        System.out.println("Result = " + (a >= 35 && b >= 35 && c >= 35 ? "Pass" : "Fail"));
    }

    // Q50. Complete console billing system for multiple items.
    // Input: itemCount=2; Pen 10 3; Book 50 2 | Output: Grand Total = 130.0
    static void q50() {
        int count = sc.nextInt();
        double grandTotal = 0;
        for (int i = 1; i <= count; i++) {
            String item = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            double amount = price * quantity;
            grandTotal += amount;
            System.out.println(item + " Amount = " + amount);
        }
        System.out.println("Grand Total = " + grandTotal);
    }
}
