
/*
 APEX AI FORGE
 TASK 002: EVEN OR ODD NUMBER CHECKER

 Logic:
 n % 2 == 0  -> Even
 n % 2 != 0  -> Odd

 Test Cases:
 10  -> Even
 7   -> Odd
 0   -> Even
 -8  -> Even
 -13 -> Odd
*/

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }

        sc.close();
    }
}

/*
================ PYTHON =================

n = int(input("Enter an integer: "))

if n % 2 == 0:
    print(n, "is Even")
else:
    print(n, "is Odd")


================ C ======================

#include <stdio.h>

int main(void) {
    int n;

    printf("Enter an integer: ");
    scanf("%d", &n);

    if (n % 2 == 0)
        printf("Even\n");
    else
        printf("Odd\n");

    return 0;
}


================ C++ ====================

#include <iostream>
using namespace std;

int main() {
    int n;

    cout << "Enter an integer: ";
    cin >> n;

    if (n % 2 == 0)
        cout << "Even\n";
    else
        cout << "Odd\n";

    return 0;
}


============= JAVASCRIPT ================

const n = Number(prompt("Enter an integer:"));

if (!Number.isInteger(n)) {
    console.log("Invalid integer");
} else if (n % 2 === 0) {
    console.log("Even");
} else {
    console.log("Odd");
}


============= TYPESCRIPT ================

const n: number = 25;

if (!Number.isInteger(n)) {
    console.log("Invalid integer");
} else if (n % 2 === 0) {
    console.log("Even");
} else {
    console.log("Odd");
}


================ KOTLIN =================

fun main() {
    print("Enter an integer: ")
    val n = readLine()?.toIntOrNull()

    if (n == null) {
        println("Invalid integer")
    } else if (n % 2 == 0) {
        println("Even")
    } else {
        println("Odd")
    }
}


================ SQL ====================

-- MySQL

DELIMITER //

CREATE PROCEDURE CheckEvenOdd(IN p_n INT)
BEGIN
    IF MOD(p_n, 2) = 0 THEN
        SELECT 'Even' AS Result;
    ELSE
        SELECT 'Odd' AS Result;
    END IF;
END //

DELIMITER ;

CALL CheckEvenOdd(10);


/*
LEARNING FORMULA:

R = N % 2

R = 0 -> EVEN
R != 0 -> ODD

Java is the active runnable program.
Other languages are reference implementations.
*/
