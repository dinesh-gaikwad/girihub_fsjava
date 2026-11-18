
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

