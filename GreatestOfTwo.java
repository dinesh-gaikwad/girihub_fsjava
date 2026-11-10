
/*
 APEX AI FORGE
 TASK 003: GREATEST OF TWO NUMBERS

 Logic:
 a > b  -> a is greatest
 b > a  -> b is greatest
 a == b -> Both are equal
*/

import java.util.Scanner;

public class GreatestOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is Greatest");
        }
        else if (b > a) {
            System.out.println(b + " is Greatest");
        }
        else {
            System.out.println("Both numbers are Equal");
        }

        sc.close();
    }
}

/*
================ PYTHON =================

a = int(input("Enter first number: "))
b = int(input("Enter second number: "))

if a > b:
    print(a, "is Greatest")
elif b > a:
    print(b, "is Greatest")
else:
    print("Both are Equal")


================ C ======================

#include <stdio.h>

int main(void) {
    int a, b;

    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);

    if (a > b)
        printf("%d is Greatest", a);
    else if (b > a)
        printf("%d is Greatest", b);
    else
        printf("Both are Equal");

    return 0;
}


================ C++ ====================

#include <iostream>
using namespace std;

int main() {
    int a, b;

    cout << "Enter two numbers: ";
    cin >> a >> b;

    if (a > b)
        cout << a << " is Greatest";
    else if (b > a)
        cout << b << " is Greatest";
    else
        cout << "Both are Equal";

    return 0;
}


============= JAVASCRIPT ================

let a = Number(prompt("Enter first number:"));
let b = Number(prompt("Enter second number:"));

if (a > b)
    console.log(a, "is Greatest");
else if (b > a)
    console.log(b, "is Greatest");
else
    console.log("Both are Equal");


============= TYPESCRIPT ================

let a: number = 25;
let b: number = 15;

if (a > b)
    console.log(a, "is Greatest");
else if (b > a)
    console.log(b, "is Greatest");
else
    console.log("Both are Equal");


================ KOTLIN =================

fun main() {
    print("Enter first number: ")
    val a = readLine()!!.toInt()

    print("Enter second number: ")
    val b = readLine()!!.toInt()

    if (a > b)
        println("$a is Greatest")
    else if (b > a)
        println("$b is Greatest")
    else
        println("Both are Equal")
}


================ SQL ====================

-- MySQL

DELIMITER //

CREATE PROCEDURE GreatestOfTwo(
    IN a INT,
    IN b INT
)
BEGIN
    IF a > b THEN
        SELECT a AS Greatest;
    ELSEIF b > a THEN
        SELECT b AS Greatest;
    ELSE
        SELECT 'Both are Equal' AS Result;
    END IF;
END //

DELIMITER ;

CALL GreatestOfTwo(25, 15);


/*
FORMULA:
a > b ? a : b

Important:
Always check equality also.
*/
