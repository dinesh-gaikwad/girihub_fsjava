n - int (input("Enter a number: "))
if n>0:print("positive number")
elif n<0:print("negative number")
else:print("number is Zero")

''' 
import java.util.*;
class NumberCheker {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number: ");
int number = nextInt();
if(number>0){
System.out.println("numer is positive");
}
else if(number<0){
System.out.println("number is negative");
}
else{
System.out.println("number is negative");
}
}
} '''

''' 
#include<stdio.h>
void main()
{
int a;
printf("Enter the number:");
scanf("%d",&a);
if(a>0){printf("positive");}
else if(a<0){
printf("nigative");}
else{printf("zero");}
}'''

'''
#include<iostram.h>
void main(){
int n;
cout << "Enter the number";
cin >> n;
if (n>0){cout <<"positive";}
else if(n<0){cin >>"nigative";
else{cout << "zero"}}
} '''

''' 
let n = Number(prompt("Enter the number"));
if (n>0){console.log("positve");}
else if(n<0){console.log("negative");}
else{console.log("zero");}
'''

''' 
let n: number = 25;
if(n > 0){console.log(""positive");}
else if(n<0){console.log("negative");}
else{console.log("zero");}
'''

'''

// Program 001: Number Checker

fun main() {
    print("Enter a number: ")
    val n = readLine()!!.toInt()

    if (n > 0) {
        println("Positive Number")
    } else if (n < 0) {
        println("Negative Number")
    } else {
        println("Zero")
    }
}
'''
'''

-- Program 001: Number Checker
-- MySQL

DELIMITER //

CREATE PROCEDURE NumberChecker(IN n INT)
BEGIN
    IF n > 0 THEN
        SELECT 'Positive Number' AS Result;
    ELSEIF n < 0 THEN
        SELECT 'Negative Number' AS Result;
    ELSE
        SELECT 'Zero' AS Result;
    END IF;
END //

DELIMITER ;

CALL NumberChecker(25);
'''

